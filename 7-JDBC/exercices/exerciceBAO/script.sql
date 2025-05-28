CREATE DATABASE execiceBAO ;
USE execiceBAO ;

CREATE TABLE clients (
	idClient int auto_increment primary key,
    lastname varchar(150) not null,
    firstname varchar(150) not null,
    phone varchar(12) not null
);

CREATE TABLE accounts (
	idAccount int auto_increment primary key,
    idClient int not null,
    totalAmount double ,
    foreign key (idClient) references clients(idClient) on delete cascade 
);

CREATE TABLE operation(
	idOperation int auto_increment primary key,
    amount double not null,
    status enum("DEPOSIT","WITHDRAWAL"),
    idAccount int not null,
    foreign key (idAccount) references accounts(idAccount) on delete cascade 
);

select * from clients;
select * from accounts;