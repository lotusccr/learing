create database MedicalPy;

create table doctorinfo
(
	dno varchar(12) not null,
	dname varchar(5) not null,
	dsex int(1) not null,
	department varchar(5) not null,
	position varchar(3) not null,
	phone varchar(11) not null,
	count int(1) not null
);
create table patientinfo
(
	pno varchar(20) not null primary key,
	pname varchar(5) not null,
	identity varchar(18) not null,
	psex int(1) not null,
	age int(3) not null,
	dname varchar(5) not null,
	department varchar(5) not null,
	totalcost double(18,2) not null,
	treatdate date not null,
	arrivedate date,
	notes varchar(30)
);


insert into doctorinfo values ('123','张三',1,'外科','操刀手','183232',3);



