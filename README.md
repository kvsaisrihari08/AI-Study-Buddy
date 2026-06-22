# AI Study Buddy - Personalized Learning Assistant

A Java-based AI Study Buddy application that helps students create personalized study schedules, take topic-wise quizzes, track learning progress, and store results using Oracle SQL.

This project demonstrates Object-Oriented Programming (OOP), JDBC connectivity, database integration, and personalized learning assistance through a console-based application.

## Features

* Student profile registration
* Personalized study plan generation based on daily study hours
* Topic-wise quizzes (Java, DBMS, OOP)
* Quiz score calculation and progress tracking
* Performance analysis and motivational feedback
* Oracle SQL database integration using JDBC
* Dynamic study schedule based on learning goals

## Technologies Used

* Java
* Oracle SQL
* JDBC
* VS Code
* Git & GitHub

## OOP Concepts Used

* Classes and Objects
* Encapsulation
* Constructors
* ArrayList Collections
* Methods
* Modular Design

## Project Structure

```text
AI-Study-Buddy/
├── sql/
│   └── oracle_schema.sql
├── src/
│   ├── DBConnection.java
│   ├── OracleStudyBuddyDAO.java
│   ├── ProgressTracker.java
│   ├── Question.java
│   ├── QuestionBank.java
│   ├── QuizResult.java
│   ├── Student.java
│   ├── StudyBuddyApp.java
│   └── StudyPlan.java
├── .gitignore
└── README.md
```

## Run Without Database

```bash
javac src/*.java
java -cp src StudyBuddyApp
```

## Oracle SQL Integration

The main application works without a database. To enable Oracle SQL support:

1. Run `sql/oracle_schema.sql` in Oracle SQL Developer.
2. Add Oracle JDBC Driver (`ojdbc8.jar` or `ojdbc11.jar`) to the project classpath.
3. Update database URL, username, and password in `DBConnection.java`.

Example:

```bash
javac -cp "ojdbc11.jar;src" src/*.java
java -cp "ojdbc11.jar;src" StudyBuddyApp
```

## Future Enhancements

* Additional quiz topics (DSA, Operating Systems, Computer Networks)
* Randomized question generation
* AI-based study recommendations
* GUI version using Java Swing or JavaFX
* Advanced performance analytics dashboard
