-- SELECT ... FROM
-- Selecting the names for all countries

SELECT * -- * means all columns
FROM country;

SELECT name
FROM country;


-- Selecting the name and population of all countries

SELECT name
        , population
FROM country;

-- Selecting all columns from the city table

SELECT *
FROM city;

/*
SELECT -- what columns to include
FROM -- what table is the source
WHERE -- filter(like if statements in java) - what rows to include
*/


-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio

SELECT *
FROM city
WHERE district = 'Ohio';

/*
=
>
<
>=
<=
BETWEEN
!= (not equal to)
*/


-- Selecting countries that gained independence in the year 1776

SELECT *
FROM country
WHERE indepyear = 1776;


-- Selecting countries not in Asia

-- Option 1
SELECT *
FROM country
WHERE continent != 'Asia';

-- Option 2
SELECT *
FROM country
WHERE NOT (continent = 'Asia');

-- Both options are identical and acceptable.

-- Selecting countries that do not have an independence year

-- unacceptable
SELECT name
        , indepyear
FROM country
WHERE indepyear = NULL; -- null can NEVER = null

-- acceptable
SELECT name
        , indepyear
FROM country
WHERE indepyear IS NULL; -- IS NULL determines that there IS NO value

-- Selecting countries that do have an independence year

SELECT name
        , indepyear
FROM country
WHERE indepyear IS NOT NULL; -- IS NOT NULL determines that there IS a value


-- Selecting countries that have a population greater than 5 million
SELECT name
        , population
FROM country
WHERE population > 5000000


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
-- AND is like multiplication
-- OR is like addition
-- if you want to apply an AND condition to multiple things,
-- use parentheses to group ORs together.

SELECT *
FROM city
WHERE district = 'Ohio'
        AND population > 400000;

-- Selecting country names on the continent North America or South America

SELECT name
        , continent
FROM country
WHERE continent = 'North America'
        OR continent = 'South America';

-- strings can be compared using LIKE keyword
-- % means wildcard
SELECT name
        , continent
FROM country
WHERE continent LIKE 'North%'; -- starts with

SELECT name
        , continent
FROM country
WHERE continent LIKE '%America'; -- ends with

-- ILIKE is a case insensitive version of LIKE
-- only works on string comparison
SELECT name
        , continent
FROM country
WHERE continent ILIKE '%America';


-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword

SELECT name
        , population
        , lifeexpectancy AS life_expectancy
        , population / surfacearea AS population_density -- do math inline
FROM country;




