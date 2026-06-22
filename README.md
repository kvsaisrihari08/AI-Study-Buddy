# AI Study Buddy - Personalized Learning Assistant

Simple Java console project using basic OOP concepts.

## Features

- Register a student
- Create a simple personalized study plan
- Generate topic-wise quiz questions
- Track quiz score and progress
- Show performance analysis
- Give motivational feedback
- Optional Oracle SQL schema and JDBC DAO included

## OOP Concepts Used

- Classes and objects
- Encapsulation
- Constructors
- ArrayList
- Methods
- Simple modular design

## Project Structure

```text
AI-Study-Buddy/
  src/
    StudyBuddyApp.java
    Student.java
    Question.java
    QuizResult.java
    StudyPlan.java
    QuestionBank.java
    ProgressTracker.java
    DBConnection.java
    OracleStudyBuddyDAO.java
  sql/
    oracle_schema.sql
```

## Run Without Database

```bash
javac src/*.java
java -cp src StudyBuddyApp
```

## Oracle SQL Integration

The main app works without a database. If you want to connect Oracle:

1. Run `sql/oracle_schema.sql` in Oracle SQL Developer.
2. Add Oracle JDBC driver `ojdbc8.jar` or `ojdbc11.jar` to classpath.
3. Update username, password, and URL in `DBConnection.java`.

Example compile with Oracle JDBC:

```bash
javac -cp "ojdbc11.jar;src" src/*.java
java -cp "ojdbc11.jar;src" StudyBuddyApp
```

