-- Drop Tables
-- Drop child tables first
DROP TABLE IF EXISTS member_course CASCADE;

-- Then drop parents
DROP TABLE IF EXISTS course CASCADE;
DROP TABLE IF EXISTS members CASCADE;
DROP TABLE IF EXISTS centres CASCADE;
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS jobs CASCADE;



CREATE TABLE IF NOT EXISTS users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS centres (
    id INT PRIMARY KEY AUTO_INCREMENT,
    town VARCHAR(100),
    zip VARCHAR(10),
    address VARCHAR(255),
    phone_number VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS members (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    address VARCHAR(255),
    phone VARCHAR(20),
    level VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS course (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    course_id INT,
    description TEXT
);

CREATE TABLE IF NOT EXISTS member_course (
    member_id INT,
    course_id INT,
    PRIMARY KEY (member_id, course_id),
    FOREIGN KEY (member_id) REFERENCES members(id),
    FOREIGN KEY (course_id) REFERENCES course(id)
);

CREATE TABLE IF NOT EXISTS jobs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    description TEXT,
    address VARCHAR(255)
);


