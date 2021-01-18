-- DDL - Data Definition Language
-- CREATE database, table
-- DROP database, table
-- ALTER table

-- connected to the POSTGRES database when you are creating another db
-- kill and db locks
SELECT pg_terminate_backend(pid) FROM pg_stat_activity WHERE datname = 'gills_art';

DROP DATABASE gills_art;

CREATE DATABASE gills_art;



-- 1. drop all tables (IF EXISTS does exactly what it sounds like)
-- 
DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS sale;
DROP TABLE IF EXISTS sale_line_item;
DROP TABLE IF EXISTS art;
DROP TABLE IF EXISTS artist;


-- 2 create all tables
CREATE TABLE customer
(
        -- column_name datatype constraints (NULL/NOT NULL)
        customer_id SERIAL NOT NULL PRIMARY KEY
        , first_name VARCHAR(50) NOT NULL
        , last_name VARCHAR(50) NOT NULL
        , street_address VARCHAR(50) NULL -- allows blank values for address fields
        , city VARCHAR(20) NULL
        , state CHAR(2) NULL
        , zip VARCHAR(10) NULL
        , phone VARCHAR(15) NOT NULL
);

CREATE TABLE sale
(
        sale_id SERIAL NOT NULL PRIMARY KEY -- remember that if it's a PK, it can't be NULL
        , customer_id INTEGER NOT NULL -- FOREIGN KEY REFERENCES customer (customer_id)
        -- ^^^^ inline FK constraint that points to the customer table
        -- FK constraints then require your tables to be ordered a certain way.
        -- Best practice is to not create FK constraints inline as you go.
        -- Create tables, then alter them.
        , purchase_date DATE NOT NULL
);

CREATE TABLE artist
(
       artist_id INTEGER NOT NULL PRIMARY KEY
       , name VARCHAR(100) NOT NULL 
);

CREATE TABLE art
(
        art_id SERIAL NOT NULL PRIMARY KEY
        , artist_id INTEGER NOT NULL -- FOREIGN KEY REFERENCES art (art_id)
        , title VARCHAR(255) NOT NULL
);

CREATE TABLE sale_line_item
(
        sale_id INTEGER NOT NULL -- shared PK with art_id so can't just set to PK inline
        , art_id INTEGER NOT NULL -- shared PK with sale_id """"
        , price DECIMAL(10, 2) NOT NULL
        -- below adds a new constraint due to both being primary keys
        -- you can do this with a sinlge PK as well,
        -- BUT DON'T DO BOTH. Either declare it inline or end with it.
        , PRIMARY KEY (
                sale_id
                , art_id
        )
);


-- 3. add relationships

ALTER TABLE sale -- which table are we altering
ADD CONSTRAINT fk_customer_sale -- name of the constraint
FOREIGN KEY (customer_id) -- which column in the sale table
REFERENCES customer (customer_id); -- point to other table and column

ALTER TABLE sale_line_item
ADD CONSTRAINT fk_sale_sale_line_item
FOREIGN KEY (sale_id)
REFERENCES sale (sale_id);

ALTER TABLE sale_line_item
ADD CONSTRAINT fk_art_sale_line_item
FOREIGN KEY (art_id)
REFERENCES art (art_id);

ALTER TABLE art
ADD CONSTRAINT fk_artist_art
FOREIGN KEY (artist_id)
REFERENCES artist (artist_id);

-- Gregor had an add constraint which made it so that a piece of art
-- couldn't be sold for under $0. He went so fast I didn't get it,
-- but it goes here.

-- 4. populate the tables

