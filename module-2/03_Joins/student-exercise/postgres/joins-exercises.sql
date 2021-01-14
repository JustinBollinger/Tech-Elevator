-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
-- actor_id = 44

SELECT title
FROM film AS f
INNER JOIN film_actor AS fa
        ON f.film_id = fa.film_id
WHERE actor_id = 44;


-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
-- actor_id = 135

SELECT title
FROM film AS f
INNER JOIN film_actor AS fa
        ON f.film_id = fa.film_id
WHERE actor_id = 135;


-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

SELECT first_name
        , last_name
        , title
FROM film AS f
INNER JOIN film_actor AS fa
        ON f.film_id = fa.film_id
INNER JOIN actor AS a
        ON fa.actor_id = a.actor_id
WHERE last_name = 'DEAN'
ORDER BY first_name;


-- 4. All of the the 'Documentary' films
-- (68 rows)
-- Documentary category_id = 6

SELECT title
FROM film AS f
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
INNER JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 6;


-- 5. All of the 'Comedy' films
-- (58 rows)

SELECT title
FROM film AS f
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
INNER JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 5;


-- 6. All of the 'Children' films that are rated 'G'
-- (10 rows)

SELECT title
FROM film AS f
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
INNER JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 3
        AND rating = 'G';


-- 7. All of the 'Family' films that are rated 'G' and are less than 2 hours in length
-- (3 rows)

SELECT title
FROM film AS f
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
INNER JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 8
        AND rating = 'G'
        AND length < 120;


-- 8. All of the films featuring actor Matthew Leigh that are rated 'G'
-- (9 rows)
-- actor_id = 103

SELECT title
FROM film AS f
INNER JOIN film_actor AS fa
        ON f.film_id = fa.film_id
WHERE actor_id = 103
        AND rating = 'G';


-- 9. All of the 'Sci-Fi' films released in 2006
-- (61 rows)
-- category_id = 14

SELECT title
FROM film AS f
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
INNER JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 14
        AND release_year = 2006;


-- 10. All of the 'Action' films starring Nick Stallone
-- (2 rows)

SELECT title
FROM film AS f
INNER JOIN film_actor AS fa
        ON fa.film_id = f.film_id
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
INNER JOIN category AS c
        ON fc.category_id = c.category_id
WHERE actor_id = 44
        AND c.category_id = 1;


-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT a.address AS street_address
        , city
        , district
        , c.country
FROM address AS a
INNER JOIN city
        ON a.city_id = city.city_id
INNER JOIN country AS c
        ON city.country_id = c.country_id
WHERE a.address_id = 1
        OR a.address_id = 2;


-- 12. A list of all stores by ID, the store's street address, and the name of the store's manager
-- (2 rows)

SELECT s.store_id
        , address AS street_address
        , first_name
        , last_name
FROM store AS s
INNER JOIN address AS a
        ON s.address_id = a.address_id
INNER JOIN staff AS st
        ON s.manager_staff_id = st.staff_id
WHERE s.manager_staff_id = 1
        OR s.manager_staff_id = 2;


-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be 'ELEANOR HUNT' with 46 rentals, #10 should have 39 rentals)

SELECT c.first_name
        , c.last_name
        , COUNT(rental_date) AS number_of_rentals
FROM customer AS c
INNER JOIN rental AS r
        ON c.customer_id = r.customer_id
GROUP BY c.customer_id
ORDER BY number_of_rentals DESC
LIMIT 10;


-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be 'KARL SEAL' with 221.55 spent, #10 should be 'ANA BRADLEY' with 174.66 spent)

SELECT c.first_name
        , c.last_name
        , SUM(amount) AS total_money_spent
FROM customer AS c
INNER JOIN payment AS p
        ON c.customer_id = p.customer_id
GROUP BY c.customer_id
ORDER BY total_money_spent DESC
LIMIT 10;


-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

--- !!! COME BACK TO THIS ONE !!! --

-- will need STORE, ADDRESS, RENTAL, PAYMENT(, CUSTOMER)

SELECT s.store_id
        , a.address AS street_address
        , COUNT(rental_date) AS number_of_rentals
        , SUM(p.amount) AS total_amount_of_sales
        , (SUM(p.amount) / COUNT(rental_date)) AS avg_sale_of_store
FROM rental AS r
INNER JOIN inventory AS i
        ON r.inventory_id = i.inventory_id
INNER JOIN store AS s
        ON i.store_id = s.store_id
INNER JOIN address AS a
        ON s.address_id = a.address_id
INNER JOIN payment AS p
        ON r.rental_id = p.rental_id
GROUP BY s.store_id
        , a.address;


-- 16. The top ten film titles by number of rentals
-- (#1 should be 'BUCKET BROTHERHOOD' with 34 rentals and #10 should have 31 rentals)

SELECT title
        , COUNT(rental_date) AS number_of_rentals
FROM film AS f
INNER JOIN inventory AS i
        ON f.film_id = i.film_id
INNER JOIN rental AS r
        ON i.inventory_id = r.inventory_id
GROUP BY title
ORDER BY number_of_rentals DESC
LIMIT 10;


-- 17. The top five film categories by number of rentals 
-- (#1 should be 'Sports' with 1179 rentals and #5 should be 'Family' with 1096 rentals)

SELECT c.name
        , COUNT(rental_date) AS number_of_rentals
FROM film AS f
INNER JOIN inventory AS i
        ON f.film_id = i.film_id
INNER JOIN rental AS r
        ON i.inventory_id = r.inventory_id
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
INNER JOIN category AS c
        ON fc.category_id = c.category_id
GROUP BY c.name
ORDER BY number_of_rentals DESC
LIMIT 5;


-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

SELECT f.title
        , COUNT(rental_date) AS number_of_rentals
FROM film AS f
INNER JOIN inventory AS i
        ON f.film_id = i.film_id
INNER JOIN rental AS r
        ON i.inventory_id = r.inventory_id
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
INNER JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 1
GROUP BY f.title
ORDER BY number_of_rentals DESC
LIMIT 5;


-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be 'GINA DEGENERES' with 753 rentals and #10 should be 'SEAN GUINESS' with 599 rentals)

SELECT a.first_name
        , a.last_name
        , COUNT(rental_date) AS number_of_rentals
FROM actor AS a
INNER JOIN film_actor AS fa
        ON a.actor_id = fa.actor_id
INNER JOIN inventory AS i
        ON fa.film_id = i.film_id
INNER JOIN rental AS r
        ON i.inventory_id = r.inventory_id
GROUP BY a.actor_id
ORDER BY number_of_rentals DESC
LIMIT 10;


-- 20. The top 5 'Comedy' actors ranked by number of rentals of films in the 'Comedy' category
        -- starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT a.first_name
        , a.last_name
        , COUNT(rental_date) AS number_of_rentals
FROM actor AS a
INNER JOIN film_actor AS fa
        ON a.actor_id = fa.actor_id
INNER JOIN inventory AS i
        ON fa.film_id = i.film_id
INNER JOIN rental AS r
        ON i.inventory_id = r.inventory_id
INNER JOIN film AS f
        ON fa.film_id = f.film_id
INNER JOIN film_category AS fc
        ON f.film_id = fc.film_id
INNER JOIN category AS c
        ON fc.category_id = c.category_id
WHERE c.category_id = 5
GROUP BY a.actor_id
ORDER BY number_of_rentals DESC
LIMIT 5;

