-- DDL - Data Definition Language
-- CREATE database, table
-- DROP database, table
-- ALTER table

-- connected to the POSTGRES database when you are creating another db

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
        employee_id SERIAL NOT NULL PRIMARY KEY
        , job_title VARCHAR(50) NOT NULL
        , last_name VARCHAR(75) NOT NULL
        , first_name VARCHAR(75) NOT NULL
        , gender CHAR(1) NULL
        , date_of_birth DATE NOT NULL
        , date_of_hire DATE NOT NULL
        , dept_id SERIAL NOT NULL -- fk relationship added in step 3
);

CREATE TABLE department
(
        dept_id SERIAL NOT NULL PRIMARY KEY
        , dept_name VARCHAR(100) NOT NULL
);

CREATE TABLE project
(
        project_id SERIAL NOT NULL PRIMARY KEY
        , project_name VARCHAR(100) NOT NULL
        , start_date DATE NOT NULL
);

CREATE TABLE project_employee_relator
(
        employee_id SERIAL NOT NULL
        , project_id INTEGER NOT NULL
        
        , PRIMARY KEY 
        (
                employee_id
                , project_id
        )        
);


-- 3. add relationships

-- have run these already
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

-- vvv this is just one example from Gregor's lecture code
-- DO NOT RUN (won't work anyways)
ALTER TABLE sale_line_item
ADD CONSTRAINT ck_sale_line_item_price
CHECK (price > 0);

ALTER TABLE  
ADD CONSTRAINT 
CHECK 




-- 4. populate the tables