/*

Some functions :- 

String function :- 

CHAR() : Gives all the characters according to the integer passed
CONCAT() : Returns the concated string 
LOWER CASE() : Makes the letters to lowercase
UPER CASE() : Makes the letters to upper case
SUBTRING() : Returns the substring
TRIM() : Removes leading and trailing spaces
LENGTH() : Returns the lenght of the string 

*/

/* Numeric Functions

MOD() : Returns the remainder of one expression by dividing by another expression
POW() : Returns the value of one expression raised to the power of another expression.
ROUND() :  Returns numeric expression rounded to an integer. Can be used to round an expression to a number of decimal places.
SIGN() : This function returns the sign of a given number.
SQRT() :  Returns the non negative square root of a given number.
TRUNCATE() : Returns the truncated version of a given number , then the decimal point will have n decimal places.


*/

/* Date and time functions 

CURDATE() : Returns the current date 
DATE() : Extracts teh date part of a date or date time expression
MONTH() : Returns the month from the date passed 
YEAR() : Returns the year 
NOW() : Returns the time at which the function executes 
SYSDATE() : Returns the current date and time 

*/



SELECT CHAR(65 , 78);
SELECT CONCAT("rishabh" , "pant")
SELECT LOWER("SHAHNAWAZ")
SELECT UPPER("hamza")
SELECT SUBSTRING("kendriya"  ,2 , 5)
SELECT TRIM("  rishabh  ") 


SELECT MOD(-19.450);
SELECT POW(3,2);
SELECT ROUND(23.678)
SELECT SIGN (-12)
SELECT SQRT(9)
SELECT TRUNCATE(12.3456)


SELECT CURDATE()
SELECT DATE()
SELECT MONTH(2021/30/09)
SELECT NOW()
SELECT SYSDATE()

SELECT CONCAT(name , aggregate) AS "Nameandage" FROM student WHERE age = 14 OR age = 16

SELECT LOWER("MR. OBAMA") 
SELECT LOWER("MS. GANDHI")

SELECT SUBSTRING("ABCDEFG" , 3 , 4)

SELECT SUBSTRING(name , 1,4) FROM student WHERE age = 18 AND age = 22 

SELECT LENGTH('CANDIDE')

SELECT SUBSTRING("Quadratically" , 5 ,6)

SELECT MOD(11 ,4) "Modulus"

SELECT POW(3,2)  "Power"

SELECT TRUNCATE(15.79 , 1)

SELECT CURDATE()

SELECT CURDATE() 

SELECT DATE('2020-12-31 01:02:03')  /* This will help in selecting the date */ 

SELECT MONTH('2020-02-03')  /*Will help in extracting the month */

SELECT NOW()

SELECT SYSDATE()




