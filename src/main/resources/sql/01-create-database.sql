create database employeedb;

create table employee (
	id bigserial not null,
	address varchar(255),
	date_of_birth timestamp,
	gender varchar(255),
	name varchar(255),
	primary key (id)
);