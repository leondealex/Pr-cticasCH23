USE business;

-- Revisar employee
SELECT * FROM employee;

-- ALIAS
SELECT last_name AS "Apellido" FROM employee;

SELECT
employee_id AS "ID",
first_name AS "Nombre",
last_name as "Apellido",
department AS "Departamento"
FROM employee;

-- Filtrar por nombre (Monika)
SELECT * FROM employee
WHERE first_name= "Monika";

-- Filtrar doble
SELECT * FROM employee
WHERE salary = 500000 AND first_name = "Vivek";

-- Filtrar por NOT
SELECT * FROM employee
WHERE NOT first_name = "Barack";

-- Filtrar por doble negacion
SELECT * FROM employee
WHERE NOT first_name = "Santiago" AND NOT first_name = "Ian"

-- Ordenamiento Alfabetico ASC o DESC | ORDER BY

SELECT * FROM employee
ORDER BY department DESC;

SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- GROUP BY
SELECT * FROM employee
GROUP BY department ASC, last_name DESC;