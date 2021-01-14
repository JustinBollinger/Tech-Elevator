-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor
(
        first_name
        , last_name
)
VALUES
(
        'Hampton'
        , 'Avenue'
),
(
        'Lisa'
        , 'Byway'
);

-- Tested to see if success.
SELECT *
FROM actor
WHERE first_name = 'Hampton'
        OR first_name = 'Lisa';


-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since it's an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
-- Values = 
--      title, description, release_year, language_id, _, _, _, length, _, _, special_features, _;
-- English language_id = 1.

INSERT INTO film
(
        title
        , description
        , release_year
        , language_id
        , length
)
VALUES
(
        'Euclidean PI'
        , 'The epic story of Euclid as a pizza delivery boy in ancient Greece'
        , 2008
        , 1
        , 198
);


SELECT *
FROM film
WHERE title = 'Euclidean PI';


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

INSERT INTO film_actor
(
        film_id
        , actor_id
)
VALUES
(
        (SELECT film_id
        FROM film
        WHERE title = 'Euclidean PI')
        ,
        (SELECT actor_id
        FROM actor
        WHERE first_name = 'Hampton'
                AND last_name = 'Avenue')
        
);

INSERT INTO film_actor
(
        film_id
        , actor_id
)
VALUES
(
        (SELECT film_id
        FROM film
        WHERE title = 'Euclidean PI')
        ,
        (SELECT actor_id
        FROM actor
        WHERE first_name = 'Lisa'
                AND last_name = 'Byway')
);

SELECT *
FROM film_actor
WHERE film_id = 1001;


-- 4. Add Mathmagical to the category table.

INSERT INTO category
(
        category_id
        , name
)
VALUES
(
        17
        , 'Mathmagical'
        
);

SELECT *
FROM category;


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
-- film_id for all movies: 274, 494, 714, 996, 1001

INSERT INTO film_category
(
        film_id
        , category_id
)
VALUES
(
        (SELECT film_id
        FROM film
        WHERE title = 'Euclidean PI')
        ,
        (SELECT category_id
        FROM category
        WHERE category_id = 17)
);

BEGIN TRANSACTION;

UPDATE film_category
SET category_id = 17
WHERE film_id IN(274
        , 494
        , 714
        , 996);

-- ROLLBACK TRANSACTION;
COMMIT TRANSACTION;


SELECT film_id
FROM film_category
WHERE category_id = 17;


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

BEGIN TRANSACTION;

UPDATE film
SET rating = 'G'
WHERE film_id IN(274
        , 494
        , 714
        , 996
        , 1001);

-- ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

SELECT *
FROM film AS f
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
WHERE fc.category_id = 17;


-- 7. Add a copy of "Euclidean PI" to all the stores.

INSERT INTO inventory
(
        film_id
        , store_id
)
VALUES
(
        (SELECT film_id
        FROM film
        WHERE title = 'Euclidean PI')
        ,
        (SELECT store_id
        FROM store
        WHERE store_id = 1)
);

INSERT INTO inventory
(
        film_id
        , store_id
)
VALUES
(
        (SELECT film_id
        FROM film
        WHERE title = 'Euclidean PI')
        ,
        (SELECT store_id
        FROM store
        WHERE store_id = 2)
);

SELECT COUNT(film_id)
        , store_id
FROM inventory
GROUP BY store_id;


-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <Deletion did not succeed because data associated with 'Euclidian PI' has been added to various
-- other tables. The foreign key constraint prevents me from carrying out deletion.>

BEGIN TRANSACTION;

DELETE FROM film
WHERE title = 'Euclidean PI';

ROLLBACK TRANSACTION;
-- COMMIT TRANSACTION;


-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <Deletion did not succeed for the same reason as in question 8. We have intertwined Euclidean PI
-- and Mathmagical. As a result, the foreign key constraint prevents me from carrying out deletion.>

BEGIN TRANSACTION;

DELETE FROM category
WHERE name = 'Mathmagical';

ROLLBACK TRANSACTION;
-- COMMIT TRANSACTION;


-- 10. Delete all links to Mathmagical in the film_category table.
-- (Did it succeed? Why?)
-- <It DID succeed. I believe the reason it succeeded is because both the category_id and film_id
-- in the film_category table are foreign keys and can be deleted from that table because their respective
-- primary keys are still intact in the film and category tables. So this permits the deletion.>

BEGIN TRANSACTION;

DELETE FROM film_category
WHERE category_id = 17;

-- ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

-- Check to see which category_id Mathmagical was assigned.
SELECT *
FROM category
WHERE name = 'Mathmagical';

SELECT *
FROM film
WHERE film_id = 1001;


-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <Deleting Mathmagical succeed because it wasn't tied to any other tables anymore.
-- So deletion was permitted. However, deletion of 'Euclidean PI' was not successful due to
-- the aforementioned foreign key restraint.>

-- Retrying deletion of Mathmagical from category table.
BEGIN TRANSACTION;

DELETE FROM category
WHERE name = 'Mathmagical';

-- ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

-- Retrying deletion of 'Euclidean PI' from the film table.
BEGIN TRANSACTION;

DELETE FROM film
WHERE title = 'Euclidean PI';

ROLLBACK TRANSACTION;
-- COMMIT TRANSACTION;


-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.


-- The film_id 1001 was still present in the film_actor and inventory tables.
-- In order to delete 'Euclidean PI' from the film table, the two remaining links
-- to the film_actor and inventory tables had to be severed. Then I was able to
-- successfully delete 'Euclidean PI' from the film table.

-- Deletes link between film and film_actor tables.
BEGIN TRANSACTION;

DELETE FROM film_actor
WHERE film_id = 1001;

-- ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

-- Prior to deletion: confirms film_id 1001 still present in film_actor table.
-- After deletion: confirms film_id 1001 is no longer present in film_actor table.
SELECT *
FROM film_actor
WHERE film_id = 1001;

-- Deletes link between film and inventory tables.
BEGIN TRANSACTION;

DELETE FROM inventory
WHERE film_id = 1001;

-- ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

-- Prior to deletion: confirms film_id 1001 still present in inventory table.
-- After deletion: confirms film_id 1001 is no longer present in inventory table.
SELECT *
FROM inventory
WHERE film_id = 1001;

-- Retrying deletion of 'Euclidean PI' from the film table.
BEGIN TRANSACTION;

DELETE FROM film
WHERE title = 'Euclidean PI';

-- ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

-- Prior to deletion: confirms 'Euclidean PI' is still present in film table.
-- After deletion: confirms 'Euclidean PI' is no longer present in film table.
SELECT *
FROM film
WHERE title = 'Euclidean PI';