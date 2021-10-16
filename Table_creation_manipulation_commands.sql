/* Creating the table */
CREATE TABLE child(
    ecode INT NOT NULL,
    /* This cant be null */
    ename VARCHAR(20) NOT NULL,
    /* This cant be null */
    sex VARCHAR(20) NOT NULL,
    /* This cant be null */
    grade VARCHAR(2),
    gross DECIMAL
);
DROP TABLE child;
/* Keys */
-- Primary Key :- 
-- PRIMARY KEY in DBMS is a column or group of columns in a table that uniquely identify every row in that table. The Primary Key can't be a duplicate meaning the same value can't appear more than once in the table.
--  A table cannot have more than one primary key.
-- Default constarint :-
-- The DEFAULT Constraint is used to fill a column with a default and fixed value. The value will be added to all new records when no other value is provided. 
-- Dropping the default constraint will not affect the current data in the table, it will only apply to new rows.
-- Check constraint :-

SELECT * FROM child

DESC child;
INSERT INTO child values (1, 'shahnawaz' , 'Male' , 'A' , 96.78);
INSERT INTO child values (2, 'hamza' , 'Male' , 'B' , 95.44);
INSERT INTO child values (3, 'Rahul' , 'Male' , 'C' , 67.90);
INSERT INTO child values (4, 'Meenal' , 'Female' , 'D' , 89.90)
SELECT ecode FROM child
SELECT * FROM child WHERE ename = 'shahnawaz'

SELECT * FROM child

