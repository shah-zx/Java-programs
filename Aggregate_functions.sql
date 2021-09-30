/* All the functions we saw till now were operating upon the same row but these functions works 
 upon all the columns */

-- DISTINCT : This option causes a group function to consider only distinct values of the argument expression.
-- All : This option causes a group function to consider all values including all the duplicates.


CREATE TABLE empl (
    EMPNO INT , 
    ENAME VARCHAR(20) , 
    JOB VARCHAR(20) , 
    MGR INT , 
    HIREDATE DATE , 
    SAL INT , 
    COMM INT,
    DEPTNO INT 
)


INSERT INTO empl VALUES (8369 , 'SMITH' , 'CLERK' , 8902 , '1990-12-18' , 800 , NULL , 20)
INSERT INTO empl VALUES (8499 , 'ANYA' , 'SALESMAN' , 8698 , '1991-02-20' , 1600 , 300 , 30)
INSERT INTO empl VALUES (8521 , 'SETH' , 'SALESMAN' , 8698 , '1991-02-22' , 1250 , 500 , 30)
INSERT INTO empl VALUES (8566 , 'MAHADEVAN' , 'MANAGER' , 8839 , '1991-04-02' , 2985 , NULL , 20)
INSERT INTO empl VALUES (8654 , 'MOMIN' , 'SALESMAN' , 8698 , '1991-09-28' , 1250 , 1400 , 30)
INSERT INTO empl VALUES (8698 , 'BINA' , 'MANAGER' , 8839, '1991-05-01' , 2850 , NULL , 30)
INSERT INTO empl VALUES (8839 , 'AMIR' , 'PRESIDENT' ,  NULL, '1991-11-18' , 5000 , NULL , 10)
INSERT INTO empl VALUES (8844 , 'KULDEEP' , 'SALESMAN' ,  8698, '1991-09-08' , 1500 , 0.00 , 30)
INSERT INTO empl VALUES (8882 , 'SHIAVNSH' , 'MANAGER' ,  8839, '1991-06-09' , 2450 , NULL , 10)
INSERT INTO empl VALUES (8886 , 'ANOOP' , 'CLERK' ,  8888, '1993-01-12' , 1100 , NULL , 20)
INSERT INTO empl VALUES (8888 , 'SCOTT' , 'ANALYST' ,  8566, '1992-12-09' , 3000 , NULL , 20)
INSERT INTO empl VALUES (8900 , 'JATIN' , 'CLERK' ,  8698, '1991-12-03' , 950 , NULL , 30)
INSERT INTO empl VALUES (8902 , 'FAKIR' , 'ANALYST' ,  8566, '1991-12-03' , 3000 , NULL , 20)
INSERT INTO empl VALUES (8934 , 'MITA' , 'CLERK' ,  8882, '1992-01-23' , 1300 , NULL , 10)


DESC empl

SELECT * FROM empl

/*This function will give the average of the salary form the employee table */

SELECT AVG(SAL) "Average" FROM empl;  /* the average function */

/* If we want the total number of records in the table , then we will be using the count function */

SELECT COUNT(*) "Total" FROM empl

/* There are total number of records : 14*/ 

SELECT COUNT(JOB) "Jobs" FROM empl;

/* Total jobs are 14 */

SELECT DISTINCT(JOB) "Jobs" FROM empl

/*Will give all types of jobs in the table */

SELECT  COUNT(DISTINCT JOB) "Jobs" FROM empl

SELECT MAX(SAL) "Maximum_salary" FROM empl  /* The max function will return the maximum amount form the column given*/

SELECT MIN(HIREDATE) "Senior_emp" FROM empl /* The minimum function will return the minimum amount form the column given*/


