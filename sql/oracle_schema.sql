CREATE TABLE students (
    student_id NUMBER PRIMARY KEY,
    name VARCHAR2(100) NOT NULL,
    goal VARCHAR2(200),
    daily_study_hours NUMBER
);

CREATE TABLE quiz_results (
    result_id NUMBER PRIMARY KEY,
    student_id NUMBER,
    topic VARCHAR2(50),
    total_questions NUMBER,
    correct_answers NUMBER,
    percentage NUMBER(5,2),
    attempted_on DATE DEFAULT SYSDATE,
    CONSTRAINT fk_quiz_student FOREIGN KEY (student_id)
        REFERENCES students(student_id)
);

CREATE SEQUENCE quiz_results_seq
START WITH 1
INCREMENT BY 1
NOCACHE;