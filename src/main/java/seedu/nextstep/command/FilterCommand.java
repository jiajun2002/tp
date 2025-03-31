package seedu.nextstep.command;

import seedu.nextstep.core.Internship;
import seedu.nextstep.core.InternshipList;
import seedu.nextstep.exception.EmptyInputException;
import seedu.nextstep.exception.InvalidInputFormatException;
import seedu.nextstep.ui.Ui;

/**
 * Filters internships based on user input and prints filtered internships.
 * Able to filter via allowance and duration.
 */
public class FilterCommand extends Command {

    public FilterCommand(String input, InternshipList internships) {
        super(input, internships);
    }

    /**
     * Executes the filtering.
     * If the user enters one number, filters internships that have an allowance/duration higher than the input.
     * If the user enters two numbers, filters internships that have an allowance/duration in between the 2 inputs.
     *
     * @throws EmptyInputException         if no range is given by the user.
     * @throws InvalidInputFormatException if more than 2 values are provided.
     * @throws NumberFormatException       if the ranges provided are not integers.
     */
    @Override
    public void execute() throws EmptyInputException, InvalidInputFormatException {
        if (input.trim().equals("filter/a") || input.trim().equals("filter/d")) {
            throw new EmptyInputException("Error: Please provide the details for the filter (e.g., MIN_VAL, MAX_VAL).");
        }

        String[] words = input.split(" ");
        String filterType = words[0];

        int minVal = Integer.parseInt(words[1]);
        int maxVal;
        if (words.length == 2) {
            maxVal = -1;
        } else if (words.length == 3) {
            maxVal = Integer.parseInt(words[2]);
        } else {
            throw new InvalidInputFormatException("Error: Please only provide 1 or 2 values.");
        }

        boolean found = false;
        for (Internship internship : internships.getAllInternships()) {
            if (isWithinRange(internship, filterType, minVal, maxVal)) {
                Ui.printInternship(internship);
                Ui.printLinebreak();
                found = true;
            }
        }
        if (!found) {
            Ui.printNoFilteredInternshipFound();
        }
    }

    private boolean isWithinRange(Internship internship, String filterType, int minValue, int maxValue) {
        if (filterType.equals("filter/a")) {
            int allowance = internship.getAllowance();
            if (maxValue < 0) {
                return allowance >= minValue;
            }
            return allowance >= minValue && allowance <= maxValue;
        } else if (filterType.equals("filter/d")) {
            int duration = internship.getDuration();
            if (maxValue < 0) {
                return duration >= minValue;
            }
            return duration >= minValue && duration <= maxValue;
        } else {
            return false;
        }
    }
}
