REM   Script: Activity 6
REM   This is for FST

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
