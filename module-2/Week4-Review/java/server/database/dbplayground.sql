BEGIN TRANSACTION;

SELECT p.product_id AS id 
        , p.name
        , p.price
        ,pt.name AS type
        ,i.slot_id AS slot
        , i.quantity
FROM product AS p


SELECT *
FROM inventory;


ROLLBACK TRANSACTION;
-- COMMIT TRANSACTION;