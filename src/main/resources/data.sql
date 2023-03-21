-- spring.sql.init.mode=always
-- spring.jpa.defer-datasource-initialization=true
-- spring.jpa.hibernate.ddl-auto=create

USE benitickets;
SET FOREIGN_KEY_CHECKS = 0;

TRUNCATE TABLE  customer;
INSERT INTO customer (id, first_Name, first_Last_Name, second_Last_Name, phone_Number, email)
VALUES (1, 'Alberto','Diaz','Perez','667656765','albertodiaz@gmail.com'),
       (2, 'Iñaki','Recoletos','Diaz','667876737','inakidos@gmail.com'),
       (3, 'Pedro','San Nicolas','Navarra','667876727','pedrosannico@hotmail.com'),
       (4, 'Macarena','Cristobal','Colon','665242526','macacolon@gmail.com'),
       (5, 'Daniel','España','Castro','667873636','castrodani@gmail.com'),
       (6, 'Robert','Lafuente','Dalto','667876737','daltodiaz@gmail.com'),
       (7, 'Manoli','Dinamo','Moravia','667876737','manolidinamo@gmail.com'),
       (9, 'Angel', 'Kanamura', 'Arigato', '667876737', 'angelkamura@gmail.com')
;

TRUNCATE TABLE  ticket;
INSERT INTO ticket (id, event_id, price_Ticket, type_Ticket, stock)
VALUES (1, 1, 19.95, 1, 50),
       (2, 2, 40.95, 0, 50),
       (3, 3, 19.95, 1, 20),
       (4, 1, 29.95, 0, 10),
       (5, 1, 9.95, 2, 9),
       (6, 4, 19.95, 1, 50)
;

TRUNCATE TABLE  event;
INSERT INTO event (id, event_Name, init_Date, end_Date, capacity, category)
VALUES (1, "Aqualandia", '2023-04-24', '2023-09-24', 2000, 2),
       (2, "Terra Mitica", '2023-05-22', '2023-09-01', 5000, 2),
       (3, "Benidorm Palace", '2023-04-19', '2024-04-19', 200, 3),
       (4, "Mundomar", '2023-03-25', '2023-10-01', 200, 5)
;