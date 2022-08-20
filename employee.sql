drop database if exists employee_db;
create database if not exists employee_db;
use employee_db;

create table employee (
EMPNO varchar(100) ,
EMPName varchar(100),
DEPT varchar(100),
SALARY int,
DOJ varchar(100),
BRANCH varchar(100),
);
desc employee;

insert into Employee values(E101,'Amit','Production',45000,'12-Mar-00','Banglore'); 
insert into Employee values(E102,'Amit','HR',70000,'12-Mar-00','Banglore'); 
insert into Employee values(E103,'Sunita','Manager',12000,'12-Mar-00','Mysore'); 
insert into Employee values(E104,'Sunita','IT',67000,'12-Mar-00','Mysore'); 
insert into Employee values(E105,'Mahesh','Civil',145000,'12-Mar-00','Mumbai'); 



select * from employee;



