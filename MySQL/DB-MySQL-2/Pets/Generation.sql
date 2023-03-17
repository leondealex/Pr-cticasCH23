USE generation;
SELECT * FROM IdTypes;

-- INNER JOIN
-- t.students t-countries

SELECT * FROM Students;
SELECT * FROM Countries;
SELECT * FROM IdTypes;
SELECT * FROM Courses_has_Students;
SELECT * FROM Courses;
SELECT * FROM Modules;

-- Encontrar a que paies pertencen
SELECT students.*,
countries.name,
countries.code
FROM students
INNER JOIN countries
ON
students.nationality = countries.idCountries;

-- UNION DE DOS TABLAS
SELECT students.idStudent as 'ID',
students.name AS 'Nombre',
students.last_name AS 'Apellido',
countries.name AS 'Pais de origen',
countries.code AS 'Codigo del pais'
FROM students
INNER JOIN countries
ON students.nationality = countries.idCountries;

-- Que tipo de ID. tienen los estudiantes
SELECT
students.idStudent as 'ID',
students.name AS 'Nombre',
students.last_name AS 'Apellido',
idTypes.name AS 'ID registrado'
FROM students
INNER JOIN idTypes
ON idtypes.id_idTypes = students.IdType_id;

-- Abreviaciones
SELECT
t1.name AS 'Nombre',
t2.name AS 'Pais',
t2.code as 'Codigo de Pais'
FROM students t1
INNER JOIN countries t2
ON t1.nationality = t2.idCountries; 

SELECT * FROM Courses_has_Students;

-- Estudiantes que esten registrados en un curso
-- ID, Nombre, Apellido y curso al que pertenece

SELECT
t1.idStudent as 'ID',
t1.name AS 'Nombre',
t1.last_name AS 'Apellido',
t2.course_code AS 'Curso'
FROM students t1
INNER JOIN Courses_has_Students t2
ON t2.students_id_student = t1.idStudent;

SELECT
t1.name AS 'Nombre',
t1.last_name AS 'Apellido',
t2.course_code AS 'Codigo del curso',
t3.name AS 'Curso',
t3.credits
FROM students t1
INNER JOIN Courses_has_Students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

-- Group by sirve para agrupar datos agregados/coincidencias
SELECT 
t1.course_code AS 'Codigo de curso',
t2.code AS 'Codigo de curso',
t2.name AS 'Curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code;

-- Encontrar estudiantes que sean del pais 125

SELECT 
countries.name 'Pais',
countries.idCountries AS 'Codigo de pais',
students.name AS 'Nombre',
students.last_name AS 'Apellido'
FROM students
INNER JOIN countries ON students.nationality = countries.idCountries
WHERE countries.idCountries = '125'; 
  
  -- Contar estudiantes que pertenezcan al curso JAVA-1
  
  SELECT * FROM Courses_has_Students;
  
  SELECT
  Courses_has_Students.course_code AS 'Codigo del curso',
  Students.idStudent AS 'ID del estudiante',
  Students.name AS 'Nombre',
Students.last_name AS 'Apellido'
  FROM Students
  INNER JOIN Courses_has_Students
  ON  Students.idStudent = Courses_has_Students.students_id_student
  WHERE Courses_has_Students.course_code = "JAVA-1";
  
  SELECT COUNT(course_code) FROM Courses_has_Students;
  
SELECT COUNT(*) AS 'Estudiantes JAVA 1'
FROM students
INNER JOIN courses_has_students
ON  students.idStudent = courses_has_students.students_id_student
WHERE courses_has_students.course_code = "JAVA-1";
  
  
  -- Contar estudiantes por cada modulo
  
SELECT * FROM Students;
SELECT * FROM Courses;
SELECT * FROM Courses_has_Students;
SELECT * FROM Modules;

SELECT
modules.name AS 'Nombre Modulo',
COUNT(*) AS 'Total Estudiantes'
FROM modules
INNER JOIN courses
ON modules.code = courses.module_code
INNER JOIN courses_has_students
ON courses.code = courses_has_students.course_code
GROUP BY modules.name;


  
  -- Encontrar estudiantes SIN curso
  
SELECT * FROM Students;  
SELECT * FROM Courses_has_Students;

SELECT
Students.idStudent,
Students.name,
Students.last_name,
Courses_has_Students.course_code
FROM Students
INNER JOIN Courses_has_Students
ON students.idStudent = courses_has_students.students_id_student;

