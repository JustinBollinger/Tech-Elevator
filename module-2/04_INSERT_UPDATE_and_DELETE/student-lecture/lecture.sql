
-- Syntax
/*
SELECT *
FROM countrylanguage;

INSERT INTO <table> (<available columns>)
VALUES (<values>)
*/

-- INSERT

-- 1. Add Klingon as a spoken language in the USA
-- 2. Add Klingon as a spoken language in Great Britain

INSERT INTO countrylanguage
(
        countrycode
        , language
        , isofficial
        , percentage
)
VALUES
(
        'USA'
        , 'Klingon'
        , false
        , 0.001
);

SELECT *
FROM countrylanguage
WHERE countrycode = 'USA';

INSERT INTO countrylanguage
(
        countrycode
        , language
        , isofficial
        , percentage
)
VALUES
(
        'GBR'
        , 'Klingon'
        , false
        , 0.001
);

SELECT *
FROM countrylanguage
WHERE countrycode = 'GBR';



-- UPDATE
--Syntax

/*
UPDATE <table name>
SET <column> = value  -- since the row already exists, you just need to clarify which column's value you'd like to update
        , <column> = value
WHERE <condition> -- if you don't add a WHERE condition, it will update EVERY row.
                -- !!ALWAYS HAVE A WHERE CLAUSE!!
*/

-- 1. Update the capital of the USA to Houston
-- 2. Update the capital of the USA to Washington DC and the head of state

-- current capital 3813 - Washington
-- new capital 3796 - Houston

SELECT *
FROM country
WHERE code = 'USA';

SELECT *
FROM city
WHERE name = 'Houston';

-- changed capital to Houston
UPDATE country
SET capital = 3796
WHERE code = 'USA';

-- changed capital back to Washington and headofstate to Joe Biden
UPDATE country
SET capital = 3813
        , headofstate = 'Joe Biden'
WHERE code = 'USA';

-- check for success of update
SELECT *
FROM country
WHERE code = 'USA';



-- DELETE

-- 1. Delete English as a spoken language in the USA

DELETE FROM countrylanguage
WHERE countrycode = 'USA'
        AND language = 'English';

-- 2. Delete all occurrences of the Klingon language 

DELETE FROM countrylanguage
WHERE language = 'Klingon';



-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.

-- illegal
INSERT INTO countrylanguage
(
        language
)
VALUES
(
        'Elvish'
);


-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?

-- illegal
INSERT INTO countrylanguage
(
        countrycode
        , language
        , isofficial
        , percentage
)
VALUES
(
        'ZZZ'
        , 'English'
        , false
        , 0.02
);

-- 3. Try deleting the country USA. What happens?

-- good rule of thumb is to do a SELECT statement first to make sure
-- I'm grabbing the data I want before I commit to a deletion
SELECT *
FROM country
WHERE code = 'USA';

-- doesn't work because multiple tables share information held within the USA row.
-- will get into this more on Monday.
DELETE FROM country
WHERE code = 'USA';



-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA

INSERT INTO countrylanguage
(
        countrycode
        , language
        , isofficial
        , percentage
)
VALUES
(
        'USA'
        , 'Klingon'
        , false
        , 0.001
);


-- 2. Try again. What happens?

INSERT INTO countrylanguage
(
        countrycode
        , language
        , isofficial
        , percentage
)
VALUES
(
        'USA'
        , 'Klingon'
        , false
        , 0.001
);


-- 3. Let's relocate the USA to the continent - 'Outer Space'

-- doesn't work because there are constraints involved.
-- will dive into this more on Monday.
UPDATE country
SET continent = 'Outer Space'
WHERE code = 'USA';


-- How to view all of the constraints

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS;


-- TRANSACTIONS

-- change capital to Houston (without WHERE)
BEGIN TRANSACTION; -- allows us to begin writing to the transaction log.
-- helps to indent the statements within a transaction just so it's easier
-- to see what we've been doing.
        UPDATE country
        SET capital = 3796;
        
        -- shows all updated capitals
        SELECT code
                , capital
        FROM country;

ROLLBACK TRANSACTION; -- because we were in the middle of the transaction,
                      -- it wasn't permanent yet.
                      -- So the erroneous chages we made weren't yet committed.

-- verifies that no capitals were actually updated
SELECT code
        , capital
FROM country;


-- 1. Try deleting all of the rows from the country language table and roll it back.
BEGIN TRANSACTION;
        
        DELETE FROM countrylanguage;
        
        SELECT *
        FROM countrylanguage;
        
ROLLBACK TRANSACTION;


-- 2. Try updating all of the cities to be in the USA and roll it back

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.