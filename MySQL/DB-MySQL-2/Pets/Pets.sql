-- Selecciona todo de una tabla
SELECT * FROM Users;

-- Selecciona solo una columna
SELECT first_name FROM Users;


-- Insertar datos a tabla pets
INSERT INTO pets
(first_name, fav_food, `type`, Users_idUsers)
VALUES
('Griselo', 'Fresas', 'Nejo', 1),
('Nicky', 'Caldito con tortillitas', 'Doggo', 2),
('Pepperoni', 'Huesitos de manzanas', 'Doggo', 3),
('Pepe', 'Semillas de girasol', 'Cotorro', 3);

-- Seleccionar todo de pets
SELECT * FROM pets;

-- Filtrar por FK para identificar a owners
SELECT * FROM pets
WHERE Users_idUsers = 3;

SELECT * FROM Users;


INSERT INTO Users
(first_name, last_name, fav_food)
VALUES
("Enrique", "Albarran" , "Mianesa"),
("Diana", "Barreto" , "Anvorguezas"),
("Yael", "Muñoz" , "Mole verde"),
("Cristina", "Trujillo" , "Enchiladas");

SELECT * FROM Users;

INSERT INTO pets
(first_name, fav_food, `type`, Users_idUsers)
VALUES
('Cactus', 'Sol y Agua', 'Tierra', 1),
('Chimuelo', 'Gatitos', 'Dragon', 5),
('Benito', 'Huesos', 'Doggo', 7),
('Molly', 'Galletas', 'Doggo', 6),
('Pantera', 'Higado de Pollo', 'Doggo', 4);

SELECT * FROM pets;
