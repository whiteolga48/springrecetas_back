INSERT INTO SECUENCIAS VALUES
('INGREDIENTES_SEQ',1000),
('RECETAS_SEQ',1000);

INSERT INTO INGREDIENTES VALUES
(10,'Ingrediente A','kilo'),
(11,'Ingrediente B','litro'),
(12,'Ingrediente C','kilo'),
(13,'Ingrediente D','kilo'),
(14,'Ingrediente E','kilo'),
(15,'Ingrediente F','gramo'),
(16,'Ingrediente G','cucharada'),
(17,'Ingrediente H','taza'),
(18,'Ingrediente H','manojo');


INSERT INTO RECETAS VALUES
(10,'Receta 10','receta10.jpg','POSTRE',10,15,'ALTA','MEDIA',6.4),
(11,'Receta 11','receta11.jpg','PRIMERO',15,20,'ALTA','MEDIA',4.0),
(12,'Receta 12','receta12.jpg','SEGUNDO',18,40,'BAJA','ALTA',12.5),
(13,'Receta 13','receta13.jpg','PRIMERO',40,120,'MEDIA','MEDIA',15.8);


INSERT INTO RECETAS_INGREDIENTES VALUES
(1,10,11),
(2,10,12),
(3,10,15),
(4,10,17),
(5,11,10),
(6,11,15),
(7,12,16),
(8,12,13),
(9,12,14),
(10,12,18),
(11,12,17),
(12,12,11),
(13,13,13),
(14,13,14);

INSERT INTO RECETA_PASOS VALUES
(10,0,'paso...'),
(10,1,'paso...'),
(10,2,'paso...'),
(10,3,'paso...'),
(10,4,'paso...'),
(10,5,'paso...'),
(10,6,'paso...'),
(11,0,'paso...'),
(11,1,'paso...'),
(11,2,'paso...'),
(12,0,'paso...'),
(12,1,'paso...'),
(12,2,'paso...'),
(12,3,'paso...'),
(12,4,'paso...'),
(12,5,'paso...'),
(12,6,'paso...'),
(13,0,'paso...'),
(13,1,'paso...');



