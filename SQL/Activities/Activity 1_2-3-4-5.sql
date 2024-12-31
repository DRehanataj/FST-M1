REM   Script: Activity1_2_3_4_5
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

