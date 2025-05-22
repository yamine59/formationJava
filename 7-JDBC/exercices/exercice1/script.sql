
create database exercice_jdbc;

USE exercice_jdbc;



CREATE TABLE student(
	id int auto_increment primary key ,
	firstname VARCHAR(150),
    lastname VARCHAR(150),
    class_number int,
    diplome_date VARCHAR(10)
);

select * from student;