REM   Script: Activity 9_10_11
REM   FST SQL

CREATE TABLE salesman (salesman_id int PRIMARY KEY,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

Describe salesman


INSERT INTO salesman VALUES(10,'REHANA','Bengaluru',20);

CREATE TABLE salesman (salesman_id int PRIMARY KEY,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

Describe salesman


INSERT INTO salesman VALUES(10,'REHANA','Bengaluru',20);

INSERT ALL 
  INTO salesman VALUES(200,'Vali','Bengaluru',30);

INTO salesman VALUES(200,'Vali','Bengaluru',30); 


INTO salesman VALUES(200,'Vali','Bengaluru',30); 


INTO salesman VALUES(200,'Vali','Bengaluru',30); 


INSERT ALL 
  INTO salesman VALUES(200,'Vali','Pune',100);

  INTO salesman VALUES(2100,'Madiha','Kochi',400); 


  INTO salesman VALUES(3200,'Mahir','Chennai',80); 


  INTO salesman VALUES(3500,'Husnain','Hyderabad',30);


INSERT ALL 
  INTO salesman VALUES(200,'Vali','Pune',100);

  INTO salesman VALUES(2100,'Madiha','Kochi',400); 


  INTO salesman VALUES(3200,'Mahir','Chennai',80); 


  INTO salesman VALUES(3500,'Husnain','Hyderabad',30); 


SELECT 1 FROM DUAL;

INSERT ALL 
  INTO salesman VALUES(200,'Vali','Pune',100) 
  INTO salesman VALUES(2100,'Madiha','Kochi',400) 
  INTO salesman VALUES(3200,'Mahir','Chennai',80) 
  INTO salesman VALUES(3500,'Husnain','Hyderabad',30) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id,salesman_city FROM salesman;

SELECT * from salesman where salesman_city='Hyderabad';

SELECT salesman_id,commission from salesman where salesman_name='Madiha';

UPDATE salesman SET salesman_id =1 where salesman_name='vali';

UPDATE salesman SET salesman_id =1 where salesman_name='Vali';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * from salesman;

UPDATE salesman SET grade=200 where salesman_name='Rehana';

UPDATE salesman SET grade=200 where salesman_name='REHANA';

UPDATE salesman SET grade=500 where salesman_name='Husnain';

UPDATE salesman SET salesman_name='TAJ' where salesman_name='Mahir';

SELECT * from salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

Select Distinct salesman_id from orders;

select order_no from orders where order_date asc;

select * from orders where purchase_amount<500;

select * from orders where purchase_amount between 1000 and 2000;

select order_no from orders ORDER BY order_date asc;

select order_no from orders ORDER BY order_date desc;

select order_no from orders ORDER BY order_date desc;

select order_no from orders ORDER BY purchase_amount desc;

select order_no,order_date  from orders ORDER BY order_date asc;

select order_no,purchase_amount from orders ORDER BY purchase_amount desc;

select * from orders where purchase_amount between 1000 and 2000 order by purchase_amount desc;

select * from Books;

select * from authors;

select * from editors;

select * from translators;

select * from Books;

select * from orders;

select * from orders;

Saahil Sharma 1/1/2025 3:40 PM •  


CREATE TABLE salesman ( 
salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int 
);

INSERT ALL 
INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from orders;

Saahil Sharma 1/1/2025 3:40 PM •  


CREATE TABLE salesman ( 
salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int 
);

INSERT ALL 
INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

CREATE TABLE salesman ( 
salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int 
);

INSERT ALL 
INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

select * from customers;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from customers;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from customers;

SELECT a.customer_name AS Customer_Name, a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from customers;

select * from salesman;

select * from customers;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman Name", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from salesman;

select * from customers;

select * from salesman;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13,200);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11,100) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14,300) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13,200) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12,100) 
SELECT 1 FROM DUAL;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman Name", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT * FROM salesman;

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='Bengaluru');

SELECT * FROM orders;

INSERT INTO salesman VALUES(5005, 'Nail Knite3', 'New York', 16,200);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11,100) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14,300) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13,200) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12,100) 
    INTO salesman VALUES(5005, 'Pit Alex1', 'New York', 11,100) 
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5005, 'Nail Knite3', 'New York', 16,200);

INSERT INTO salesman VALUES(5001, 'Nail Knite3', 'New York', 16,200);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE salesman_city='New York');

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='paris');

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE salesman_city='New York');

select * from customers;

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT MAX(commission) FROM salesman));

select * from salesman;

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
     INTO orders VALUES(70014, 3055.6, TO_DATE('2012/04/26', 'YYYY/MM/DD'), 3000, 2100) 
SELECT 1 FROM DUAL;

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
     INTO orders VALUES(70018, 3055.6, TO_DATE('2012/04/26', 'YYYY/MM/DD'), 3000, 2100) 
SELECT 1 FROM DUAL;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT  INTO orders VALUES(70018, 3055.6, TO_DATE('2012/04/26', 'YYYY/MM/DD'), 3000, 2100);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
     
SELECT 1 FROM DUAL;

select * from orders;

Saahil Sharma 1/1/2025 3:40 PM •  


CREATE TABLE salesman ( 
salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int 
);

INSERT ALL 
INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

select * from customers;

select * from salesman;

INSERT INTO salesman VALUES(5001, 'Nail Knite3', 'New York', 16,200);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11,100) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14,300) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13,200) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12,100) 
    INTO salesman VALUES(5005, 'Pit Alex1', 'New York', 11,100) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman Name", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT MAX(commission) FROM salesman));

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, a.salesman_name, b.order_no, 'lowest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT MAX(commission) FROM salesman));

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, a.salesman_name, b.order_no, 'lowest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

