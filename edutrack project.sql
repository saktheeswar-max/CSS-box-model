CREATE DATABASE edutrack_db;
USE edutrack_db;
CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role ENUM('ADMIN', 'TEACHER', 'STUDENT') NOT NULL,
    student_id BIGINT NULL,
    teacher_id BIGINT NULL
);
CREATE TABLE student (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    department VARCHAR(100) NOT NULL
);
CREATE TABLE teacher (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    department VARCHAR(100) NOT NULL
);
CREATE TABLE course (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(50) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL
);
CREATE TABLE enrollment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    student_id BIGINT NOT NULL,
    course_id BIGINT NOT NULL,
    academic_year VARCHAR(20),
    semester VARCHAR(20),
    FOREIGN KEY (student_id) REFERENCES student(id) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES course(id) ON DELETE CASCADE
);
CREATE TABLE attendance (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    student_id BIGINT NOT NULL,
    course_id BIGINT NOT NULL,
    date DATE NOT NULL,
    status ENUM('PRESENT', 'ABSENT') NOT NULL,
    FOREIGN KEY (student_id) REFERENCES student(id) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES course(id) ON DELETE CASCADE
);
CREATE TABLE mark (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    student_id BIGINT NOT NULL,
    course_id BIGINT NOT NULL,
    date DATE NOT NULL,
    marks INT NOT NULL,
    FOREIGN KEY (student_id) REFERENCES student(id) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES course(id) ON DELETE CASCADE
);

CREATE TABLE timetable (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    course_id BIGINT NOT NULL,
    teacher_id BIGINT NOT NULL,
    student_id BIGINT NOT NULL,
    day VARCHAR(20) NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    FOREIGN KEY (course_id) REFERENCES course(id) ON DELETE CASCADE,
    FOREIGN KEY (teacher_id) REFERENCES teacher(id) ON DELETE CASCADE,
    FOREIGN KEY (student_id) REFERENCES student(id) ON DELETE CASCADE
);

INSERT INTO user (username, password, role)
VALUES 
('admin', 'admin123', 'ADMIN'),
('teacher1', 'teach123', 'TEACHER'),
('student1', 'stud123', 'STUDENT');

INSERT INTO student (name, email, department)
VALUES ('Student One', 'student1@gmail.com', 'Computer Science');

INSERT INTO teacher (name, email, department)
VALUES ('Teacher One', 'teacher1@gmail.com', 'Computer Science');

UPDATE user SET student_id = 1 WHERE role = 'STUDENT';
UPDATE user SET teacher_id = 1 WHERE role = 'TEACHER';

INSERT INTO course (code, name, department)
VALUES ('CS101', 'Introduction to Programming', 'Computer Science');

INSERT INTO enrollment (student_id, course_id, academic_year, semester)
VALUES (1, 1, '2024-2025', 'Semester 1');

INSERT INTO attendance (student_id, course_id, date, status)
VALUES (1, 1, CURDATE(), 'PRESENT');

INSERT INTO mark (student_id, course_id, date, marks)
VALUES (1, 1, CURDATE(), 85);

INSERT INTO timetable (course_id, teacher_id, student_id, day, start_time, end_time)
VALUES (1, 1, 1, 'Monday', '09:00:00', '10:00:00');









