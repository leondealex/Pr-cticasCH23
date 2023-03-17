USE generation;

-- INNER JOIN
-- t.students t.countries

SELECT * FROM students;
SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules; 

-- Encontrar a que pais pertenecen
SELECT
students.*,
countries.name,
countries.code
FROM students
INNER JOIN countries
ON students.nationality = countries.idCountries;

-- INNER JOIN sencillo
SELECT students.name, 
students.last_name,countries.Name AS "country", 
countries.Code  
FROM students
INNER JOIN countries 
ON countries.idCountries = students.nationality;

-- Encontrar que tipo de ID tienen

SELECT
students.idStudent AS "ID",
students.name AS  "Name",
students.last_name AS "Last name",
idtypes.name AS 'Tipo de registro'
FROM students
INNER JOIN idtypes
ON idtypes.id_idTypes = students.IdType_id;
SELECT 
    students.name,
    countries.name,
    countries.code
FROM
students
INNER JOIN countries 
ON students.nationality = countries.idCountries;

-- Abreviaciones
SELECT 
    t1.name,
    t2.name,
    t2.code
FROM students t1
INNER JOIN countries t2
ON t1.nationality = t2.idCountries;

-- Estudiantes que esten registrades en un curso.
-- Nombre, id, apellido, curso al que estan registrades.

SELECT 
students.name,
students.idStudent, 
students.last_name,
courses_has_students.course_code
FROM students
INNER JOIN courses_has_students
ON students.idStudent = courses_has_students.students_id_type_id;

SELECT 
students.name AS 'Nombre',
students.idStudent AS 'ID', 
students.last_name AS 'Apellido',
courses_has_students.course_code AS 'Nombre del curso'
FROM students
INNER JOIN courses_has_students
ON courses_has_students.students_id_type_id = students.idStudent;

SELECT
students.idStudent as 'ID',
students.name AS 'Nombre',
students.last_name AS 'Apellido',
Courses_has_Students.course_code AS 'Nombre del Curso'
FROM students
INNER JOIN Courses_has_Students
ON Courses_has_Students.students_id_student = Students.idStudent;

-- Buscar estudiantes y el curso al que pertenecen
SELECT 
    t1.name AS 'Nombre',
    t1.last_name AS 'Apellido',
    t2.course_code AS 'Codigo de curso',
    t3.name AS 'Curso',
    t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

-- Group by sirve para agrupar datos coincidentes siempre y cuando 
SELECT 
    t1.course_code AS 'Codigo de  curso',
    t2.code AS 'Codigo de  curso',
    t2.name AS 'Codigo de  curso'
FROM
    courses_has_students t1
        INNER JOIN
    courses t2 ON t1.course_code = t2.code
GROUP BY t2.code;

SELECT * FROM students;

SELECT students.name, students.last_name
FROM students
INNER JOIN countries ON students.nationality = countries.idCountries
WHERE countries.idCountries = '125';

SELECT 
countries.name 'Pais',
countries.idCountries AS 'Codigo de pais',
students.name AS 'Nombre',
students.last_name AS 'Apellido'
FROM students
INNER JOIN countries ON students.nationality = countries.idCountries
WHERE countries.idCountries = '125';

SELECT
  Courses_has_Students.course_code,
  Courses_has_Students.students_id_student,
  Students.idStudent,
  Students.name,
  Students.last_name
  FROM Students
  INNER JOIN Courses_has_Students
  ON  Students.idStudent = Courses_has_Students.students_id_student
  WHERE Courses_has_Students.course_code = "JAVA-1";


SELECT modules.name AS 'Nombre Modulo', COUNT(*) AS 'Total Estudiantes'
FROM modules
INNER JOIN courses ON modules.code = courses.module_code
INNER JOIN courses_has_students ON courses.code = courses_has_students.course_code
GROUP BY modules.name;

