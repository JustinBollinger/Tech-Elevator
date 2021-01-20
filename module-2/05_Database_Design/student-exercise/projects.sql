-- DDL - Data Definition Language
-- CREATE database, table
-- DROP database, table
-- ALTER table

-- !! make sure you are connected to the POSTGRES database when you are creating another db

-- kill and db locks
SELECT pg_terminate_backend(pid) FROM pg_stat_activity WHERE datname = 'projects';

DROP DATABASE projects;

CREATE DATABASE projects;

-- Created projects db ^^^

-- 1. drop all tables
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS project_employee_relator;


-- 2. create all tables
-- column name / datatype / NULL or NOT NULL / constraints
CREATE TABLE employee
(
        employee_id INTEGER NOT NULL PRIMARY KEY
        , dept_id INTEGER NOT NULL -- fk relationship added in step 3
        , last_name VARCHAR(75) NOT NULL
        , first_name VARCHAR(75) NOT NULL
        , gender CHAR(1) NULL
        , date_of_birth DATE NOT NULL
        , date_of_hire DATE NOT NULL
);

CREATE TABLE department
(
        dept_id INTEGER NOT NULL PRIMARY KEY
        , dept_name VARCHAR(100) NOT NULL
);

CREATE TABLE project
(
        project_id INTEGER NOT NULL PRIMARY KEY
        , project_name VARCHAR(100) NOT NULL
        , start_date DATE NOT NULL
);

CREATE TABLE project_employee_relator
(
        employee_id INTEGER NOT NULL
        , project_id INTEGER NOT NULL
        
        , PRIMARY KEY 
        (
                employee_id
                , project_id
        )        
);


-- 3. add relationships

ALTER TABLE project_employee_relator
ADD CONSTRAINT fk_employee_project_employee_relator
FOREIGN KEY (employee_id)
REFERENCES employee (employee_id);

ALTER TABLE project_employee_relator
ADD CONSTRAINT fk_project_project_employee_relator
FOREIGN KEY (project_id)
REFERENCES project (project_id);

ALTER TABLE employee
ADD CONSTRAINT fk_department_employee
FOREIGN KEY (dept_id)
REFERENCES department (dept_id);


-- 4. populate the tables

-- populating department table
INSERT INTO department (dept_id, dept_name)
VALUES ('1', 'Accounting');
INSERT INTO department (dept_id, dept_name)
VALUES ('2', 'Junior Dev Team');
INSERT INTO department (dept_id, dept_name)
VALUES ('3', 'Senior Dev Team');

-- populating employee table
INSERT INTO employee (employee_id, dept_id, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('1', '3', 'Smith', 'Geraldine', 'F', '1989-06-14', '2014-08-15');
INSERT INTO employee (employee_id, dept_id, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('2',  '1', 'Boucher', 'Bobby', 'M', '1974-10-22', '2018-07-13');
INSERT INTO employee (employee_id, dept_id, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('3', '3', 'Nicklow', 'Kurt', 'M', '1992-08-25', '2013-05-17');
INSERT INTO employee (employee_id, dept_id, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('4', '2', 'Barnes', 'Matt', 'M', '1990-08-23', '2019-02-22');
INSERT INTO employee (employee_id, dept_id, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('5', '1', 'Barnes', 'Jenny', 'F', '1988-05-21', '2017-03-30');
INSERT INTO employee (employee_id, dept_id, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('6', '3', 'Bollinger', 'Justin', 'M', '1990-06-21', '2011-09-24');
INSERT INTO employee (employee_id, dept_id, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('7', '2', 'Evert', 'Gerald', 'M', '1987-12-24', '2019-10-31');
INSERT INTO employee (employee_id, dept_id, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('8', '3', 'Winthrop', 'Kate', 'F', '1988-05-21', '2013-05-24');


-- populating project table
INSERT INTO project (project_id, project_name, start_date)
VALUES ('1', 'Project Waterboy', '2021-01-03');
INSERT INTO project (project_id, project_name, start_date)
VALUES ('2', 'Lebowski Lane' , '2019-03-19');
INSERT INTO project (project_id, project_name, start_date)
VALUES ('3', 'Seymour and Sundry', '2009-04-19');
INSERT INTO project (project_id, project_name, start_date)
VALUES ('4', 'Mansion Overhaul', '2016-03-28');

-- populating project_employee_relator table
INSERT INTO project_employee_relator (employee_id, project_id)
VALUES ('1', '3');
INSERT INTO project_employee_relator (employee_id, project_id)
VALUES ('2', '1');
INSERT INTO project_employee_relator (employee_id, project_id)
VALUES ('3', '3');
INSERT INTO project_employee_relator (employee_id, project_id)
VALUES ('4', '2');
INSERT INTO project_employee_relator (employee_id, project_id)
VALUES ('5', '1');
INSERT INTO project_employee_relator (employee_id, project_id)
VALUES ('6', '4');
INSERT INTO project_employee_relator (employee_id, project_id)
VALUES ('7', '2');
INSERT INTO project_employee_relator (employee_id, project_id)
VALUES ('8', '4');