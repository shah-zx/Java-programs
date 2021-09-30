DESCRIBE employee;
DESCRIBE neighbours;
DESCRIBE residents;
DESCRIBE students;
DESCRIBE client;
SHOW TABLES;

/* This command is used for showing tables*/
CREATE TABLE fruits (
    num INT,
    quantity INT,
    name VARCHAR(20)
);
DESC fruits;
INSERT INTO fruits
VALUES (1, 5, "Mango");
INSERT INTO fruits
VALUES (2, 10, "Papaya")
INSERT INTO fruits
VALUES (3, 8, "Banana");
INSERT INTO fruits
VALUES (4, 6, "Pomagranet")
INSERT INTO fruits
VALUES (5, 9, "Pomagranet");
SELECT *
FROM fruits;
/* Some operations we can do with SELECT */
SELECT quantity
FROM fruits
    /* Selecting columns */
SELECT 1 + 6
SELECT 45 / 15
SELECT CONCAT("rishabh", "kumar")
SELECT LENGTH("shahnawaz")
SELECT ASCII ("A")
SELECT SUBSTRING("hamza", 1, 4)
SELECT DISTINCT name
FROM fruits
    /* Will give only distinct values and not the same*/
SELECT 4 * 3
FROM Dual
SELECT SYSDATE()
    /* Gives the current date and time*/
SELECT curdate();
/*Special function for getting the date */
SELECT name,
    quantity * 100
FROM fruits
    /* Here we will get the number of fruits multiplied by hundred like 400 , 500 etc  */
    CREATE TABLE event (
        date DATE,
        occassion VARCHAR(20),
        home VARCHAR(20)
    );
DESC event
INSERT INTO event
values ('2021-04-28', "birthday", "shahnawaz's home");
INSERT INTO event
values ('2021-07-26', "party", "hamza's home");
INSERT EVENT
values ('2021-09-30', "internship", "mind");
INSERT EVENT
values ('2021-03-30', "swimming", "pool");
INSERT EVENT
values ('2021-05-30', "job", "office");
INSERT EVENT
values ('2021-01-30', "vaccination", "hospital");
SELECT *
FROM event;
DROP TABLE event;
/*If we want to print the dates according to the events happened*/
SELECT date,
    occassion AS "event type"
FROM event;
DELETE date
FROM event
WHERE occassion = "vaccination";
SELECT 9.36 / 1 AS "gravitational force";

/* Question : 1*/

CREATE TABLE student (
    name VARCHAR(20),
    age INT,
    sex VARCHAR(20),
    matric INT,
    aggregate INT
)

DESC student


INSERT INTO student Values ("Hamza", 20, "Male", 9531186, 456)
INSERT INTO student Values ("Ritika", 22, "Female", 9531187, 456)
INSERT INTO student Values ("Kunal", 20, "Male", 9531188, 456)
INSERT INTO student Values ("Rahul", 21, "Male", 9531189, 456) 
INSERT INTO student Values ("John", 21, "Male", 9531189, 450) 
INSERT INTO student Values ("Ram", 18, "Male", 9531189, 423) 

DROP TABLE student

SELECT name , sex , aggregate/5 AS "precentage" FROM student

SELECT name FROM fruits;

SELECT name , sex , age ,  aggregate FROM student WHERE age < 20;

SELECT aggregate/5 AS "Ram's aggregate" FROM student WHERE name = "Ram" 

/* The not equal to sign :- <> */

SELECT name FROM student WHERE name <> "Rahul"


 /* Different types of operators */

SELECT name , sex , aggregate FROM student WHERE age = 20 || age = '21'

SELECT name , sex , aggregate FROM student WHERE age = 21 AND sex = 'Male'

SELECT name  , sex , aggregate FROM student WHERE (age = 22 || age = 21 ) && sex = 'Male'

/*Selecting the items from a particular range */

SELECT aggregate FROM student WHERE aggregate BETWEEN 420 AND 455

SELECT name , age , aggregate FROM student WHERE age BETWEEN 19 AND 22

/*Condition based on a list */

/*This will give the names gien to it */

SELECT * FROM student WHERE name IN ('Rahul' , 'Hamza' , 'Ritika')

/*This will give the names other than the names given to it */

SELECT * FROM student WHERE name NOT IN ('Rahul' , 'Hamza' , 'Ritika')

/* Conditon based om pattern matches */

SELECT * FROM student WHERE name LIKE '%mza%' 

SELECT * FROM student WHERE matric LIKE '953%'

SELECT * FROM student WHERE name LIKE '%a'

-- % is for substring and _ is for character 

-- Order by : This will give us the names of the students by their names in order (A-Z)

SELECT name , aggregate FROM student WHERE aggregate > 430 ORDER BY name;

SELECT * FROM student WHERE aggregate > 430 ORDER BY aggregate DESC

SELECT * FROM student WHERE aggregate > 430 ORDER BY aggregate ASC

/* Complex query */

SELECT name , age , aggregate FROM student WHERE aggregate BETWEEN 400 AND 470 ORDER BY name DESC


