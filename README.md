# The Missing Exam Paper: Detective Investigation System

A console-based Java application that simulates a detective investigation.
An exam question paper has disappeared from the department office, and the
detective must examine suspects, collect clues and identify the culprit.

## Team Members

| Student | Name | File | Responsibility |
|---|---|---|---|
| Student 1 | Nisha | Suspect.java | Suspect class and suspect management |
| Student 2 | Natania | ClueManager.java | Clue storage and collection |
| Student 3 | Anagha | Investigation.java | Investigating suspects and accusation logic |
| Student 4 | Kruthika | DetectiveGame.java | Main program, menu and integration |

## Features

1. View suspects
2. Investigate a suspect by ID
3. Collect clues (a clue cannot be collected twice)
4. View collected clues
5. Accuse a suspect (maximum 3 attempts)
6. Exit the investigation

The program uses predefined values, so no keyboard input is needed.

## How to Compile and Run

All files must be in the same folder.

```
javac Suspect.java ClueManager.java Investigation.java DetectiveGame.java
java DetectiveGame
```

## Java Concepts Used

Classes, objects, constructors, `this` keyword, methods, arrays, array of
objects, if-else, switch, for, for-each, while loop, break, continue, return,
primitive data types and Strings.

## Project Structure

```
detective-investigation/
├── Suspect.java
├── ClueManager.java
├── Investigation.java
├── DetectiveGame.java
└── README.md
```

