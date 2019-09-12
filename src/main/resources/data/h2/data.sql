INSERT INTO INGREDIENTES VALUES
(10,'Arroz','gramos'),
(11,'Pollo deshuesado','g'),
(12,'Pimiento rojo','unidad'),
(13,'Cebolla','unidad'),
(14,'Patatas','kilo'),
(15,'Bacalao','g'),
(16,'Tomate frito ','cucharada'),
(17,'Merluza','rodajas'),
(18,'Ajos','unidad'),
(19,'Aceite de oliva','g'),
(20,'Pimiento verde','g'),
(21,'Tomate entero pelado','g'),
(22,'Calabaza troceada a taquitos','g'),
(23,'Sal','pizca'),
(24,'Chili en polvo','cuchadarita'),
(25,'pimienta negra','pizca'),
(26,'Chocolate','gr'),
(27,'Azúcar','gr.'),
(28,'Huevos','unidad'),
(29,'Chocolate rallado','g'),
(30,'Leche entera','ml'),
(31,'Conejo','g'),
(32,'Cerveza ','cucharada'),
(33,'Merluza','rodajas'),
(34,'Pimineta blanca','pizca');

INSERT INTO RECETAS VALUES
(10,'Arroz con pollo','receta10.jpg','PRIMERO',10,15,'ALTA','MEDIA',3.4),
(11,'Conejo a la cerveza','receta11.jpg','PRIMERO',15,20,'ALTA','MEDIA',4.0),
(12,'Natillas de chocolate','receta12.jpg','POSTRE',18,40,'BAJA','ALTA',1.0),
(13,'Chili Vegetariano','receta13.jpg','PRIMERO',40,120,'MEDIA','MEDIA',2.0);

INSERT INTO RECETAS_INGREDIENTES VALUES
(1,10,11),
(2,10,12),
(3,10,13),
(4,11,31),
(5,11,32),
(6,11,19),
(7,12,26),
(8,12,27),
(9,12,28),
(10,12,30),
(11,12,17),
(12,12,18),
(13,13,24),
(14,13,22);

INSERT INTO RECETA_PASOS VALUES
(10,0,'Pon los tomates en cuartos y trocea 5 segundos en velocidad 5. Retira y reserva.'),
(10,1,'Vierte en el vaso los ajos, los pimientos y el aceite y trocea 5 segundos en velocidad 5, ahora sofríe 10 minutos, 120ºC o Varoma, velocidad 2.'),
(10,2,'Incorpora el pollo en trozos y rehoga 5 minutos, 120ºC o Varoma, giro a la izquierda y velocidad cuchara.'),
(10,3,'Agrega el tomate triturado y cocina 5 minutos, Varoma, giro a la izquierda y velocidad cuchara. Añade el pimentón y mezcla 30 segundos, Varoma, giro a la izquierda y velocidad cuchara.'),
(10,4,'Vierte el caldo de ave y la sal al gusto y programa 10 minutos, 100ºC giro a la izquierda y velocidad cuchara.'),
(10,5,'Solo queda verter el arroz y las judías y cocinar 13 minutos, 100ºC, giro a la izquierda y velocidad cuchara. Sirve en una fuente inmediatamente y a comer. Listo.'),
(10,6,'paso.'),
(11,0,'Salpimenta el conejo y reserva. Pon en el vaso el aceite, la cebolla y el ajo y trocea 3 segundos en velocidad 5 y sofríe 12 minutos, 120ºC o Varoma, giro a la izquierda y velocidad cuchara, sin cubilete -pon el cestillo sobre la tapadera para que no salpique-.'),
(11,1,'Mientras la Thermomix® está con el sofrito, pasa el conejo -opcional- por la sartén para dorarlo antes de usarlo en la receta y retira y reserva.'),
(11,2,'Añade al vaso el conejo, la cerveza y el caldo - vierte sal al gusto- y cocina 25 minutos, 100ºC, giro a la izquierda y velocidad cuchara -con cubilete-. Acabado el tiempo, programa 10 minutos, Varoma, giro a la izquierda y velocidad cuchara, sin cubilete y con el cestillo sobre la tapadera para que la salsa quede más densa. A comer.'),
(12,0,'Pon en el vaso el chocolate en trozos y rállalo 15 segundos en velocidad 10.'),
(12,1,'Añade el azúcar, los huevos, la leche y el azúcar vainillado y mezcla todo 10 segundos en velocidad 4. Después cuece 8 minutos, 90ºC, velocidad 3. Vierte en vasitos de cristal y deja enfriar.'),
(12,2,'Decora con galletas o pepitas de chocolate, al gusto'),
(13,0,'Pon el recipiente Duraceramic al fuego y vierte el aceite. Cuando esté caliente sofríe las verduras unos minutos, la cebolla, los pimientos y los ajos'),
(13,1,'Pasa el recipiente a la Crock-Pot®, añade al sofrito anterior el tomate entero que has aplastado con la ayuda de un tenedor previamente, la calabaza troceada, las zanahorias troceadas, el cacao el polvo y todas las especias, la sal, la pimienta y la salsa Chipotle. Remueve para integrar todo.'),
(13,2,'Agrega el bote de judias cocidas lavadas y escurridas y mezcla con cuidado de no romperlas.'),
(13,3,'Cocina en ALTA durante 4:30h con la tapa abierta para que evapore. Yo le pongo una cuchara de madera cruzada para que no se cierre y la última hora puedes cocinar directamente sin tapa. Acabado el tiempo sirve al gusto, podrás dipear con verduras frescas cortadas en tiras o con nachos o similar.'),
(13,4,'paso...');



