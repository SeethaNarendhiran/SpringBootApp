create table person(

	id integer not null,
	name varchar(255),
	dob timestamp,
	location varchar(255),
	primary key(id)
	);
	
	create table employee(
	id integer not null,
	location varchar(255),
	salary double(25),
	dept varchar(255),
	domain varchar(255),
	primary key(id)
	);
	
	
insert into person(id,name,dob,location) values(10001,'seetha',sysdate(),'chennai');

insert into person(id,name,dob,location) values(10002,'sanya',sysdate(),'Bangalore'),
(10003,'sadhana',sysdate(),'Hyderabad'),
(10004,'seetha',sysdate(),'chennai');