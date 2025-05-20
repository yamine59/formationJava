create database demo;
USE demo ;

create table tableA(
id int primary key,
name varchar(50)
);

create table tableB(
id int primary key,
name varchar(50)
);

-- Insertion des données dans TableA
INSERT INTO tablea (id, name) VALUES
(1, 'Pirate'),
(2, 'Monkey'),
(3, 'Ninja'),
(4, 'Spaghetti');

-- Insertion des données dans TableB
INSERT INTO tableb (id, name) VALUES
(1, 'Rutabaga'),
(2, 'Pirate'),
(3, 'Darth Vader'),
(4, 'Ninja');

select * from
 tablea inner join tableb on tablea.name = tableb.name;
select * from
 tablea left outer join tableb on tablea.name = tableb.name;

select * from
 tablea left join tableb on tablea.name = tableb.name
 union
 select * from
 tablea right join tableb on  tablea.name = tableb.name