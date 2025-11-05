# Student Collector (CLI) Application

A simple command-line application that **continuously collects student 
details** and saves them to a CSV file.


### Features

- Prompts for **Student ID** and **Student Name** repeatedly.
- Creates in-memory `Student` objects during the session.
- Ends the input loop when the user types `exit`.
- Saves all session entries to `students.csv` in CSV format.
- Appends new records if the file already exists (does not overwrite).
- Creates the file and adds a header only once (on first run).
- Handles basic validation (no empty inputs).