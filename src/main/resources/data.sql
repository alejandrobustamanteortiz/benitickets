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
INSERT INTO ticket (id, event_id, price_Ticket, buy_Date, type_Ticket)
VALUES (1, 1, 19.95, '2022-03-19', 'ADULTO'),
       (2, 2, 40.95, '2022-03-25', 'ADULTO'),
       (3, 3, 19.95, '2022-04-27', 'NIÑO')
;

TRUNCATE TABLE  event;
INSERT INTO event (id, event_Name, event_Date)
VALUES (1, "Aqualandia", '2022-03-24'),
       (2, "Terra Mitica", '2022-03-22'),
       (3, "Benidorm Palace", '2022-04-19')
;