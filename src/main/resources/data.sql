USE benitickets;
SET FOREIGN_KEY_CHECKS = 0;

TRUNCATE TABLE  customer;
INSERT INTO customer (id, firstName, firstLastName, secondLastName, phoneNumber, email)
VALUES (1, 'England','Deninton','Big London','Road','98230'),
       (2, 'Spain','Recoletos','Comunidad de Madrid','Paseo','68249'),
       (3, 'Spain','San Nicolas','Navarra','Calle','31000'),
       (4, 'Spain','Cristobal Colon','Zaragoza','Plaza','58423'),
       (5, 'Spain','España','Sevilla','Plaza','32975'),
       (6, 'France','Liberte','Ile de France','Avenue','12896'),
       (7, 'República Checa','Dinamo libery','Moravia','Street','89837'),
       (9, 'Japón', 'Kanamura', 'Arigato', 'Street', '837362')
;