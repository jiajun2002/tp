# Jia Jun - Project Portfolio Page

## Overview

**NextStep** is a **command-line interface (CLI) application** designed to empower students and job-seekers in their internship search. By simplifying internship management through seamless adding, deleting, searching, and filtering, NextStep eliminates the chaos of spreadsheets and manual tracking. 🎯

Given below are my contributions to the project.

## Summary of Contributions

### Code Contributed
[View my code contributions on RepoSense](https://nus-cs2113-ay2425s2.github.io/tp-dashboard/?search=jiajun2002&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2025-02-21&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other)

### Enhancements Implemented

**New Feature: Add Command Implementation**
- What it does: Enables users to add internships to their list, along with the various fields associated with the internship _eg. Company, Role, Skills etc_.
- Highlights:
    - Added robust error handling and confirmation prompts to prevent incorrect formatting.
    - Ensured compatibility with the project’s data persistence and serialization mechanisms.

**New Feature: Filter Command Implementation**
- What it does: Allows users to filter and be displayed specific internships based on their input.
- Highlights:
    - Enabled users to filter via allowance/duration by inputting 1/2 values.
    - Added error and exception handling to prevent incorrect formatting.

**Enhancement: Existing Classes**
- Ui Class: Implemented the Ui class along with various printing methods and formatting for user interactions.
- Parser Class: Implemented the Parser class to process user input and execute the appropriate commands.
- Exception Handling: Created multiple custom exception classes for improved robustness of application.

**Enhancement: Testing**
- Added JUnit tests for `add` and `filter` that cover normal expected behaviours as well as throws the appropriate exceptions when handling unexpected user inputs.

### Documentation

#### Contributions to the User Guide
- Added parameter tables for `add` and `delete`
- Enhanced explanations for `edit` and `filter`

#### Contributions to the Developer Guide
- Added UML sequence diagrams for `add` and `filter`.
- Added UML class diagram for commands component, improvements on the architecture diagram and other existing diagrams.
- Implemented additional instructions in the "Instructions for Manual Testing" section.

### Project Management
- Managed 3 releases on GitHub (v1.0, v2.0 and v2.1).
- Initiated and closed issues to help track team progress.
- Conducted code reviews for team members.

### Community
- Provided thorough code reviews for teammates.
- Assisted team members with debugging and implementation challenges.
- Added error handling to improve overall application reliability.
