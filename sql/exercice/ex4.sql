 create database ex4;
 USE ex4;
 -- ex1
CREATE TABLE livre (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    titre VARCHAR(150),
    auteur VARCHAR(50),
    editeur VARCHAR(50),
    date_publication DATE,
    isbn_10 VARCHAR(10),
    isbn_13 VARCHAR(15)
);
 

-- ex3
SELECT 
    *
FROM
    livre
ORDER BY date_publication 
LIMIT 10;

-- ex4 
SELECT 
    date_publication, auteur, titre
FROM
    livre
ORDER BY date_publication
LIMIT 10;

-- ex5 
SELECT 
    *
FROM
    livre
WHERE
    auteur = 'Agatha Christie';

-- ex6 
UPDATE livre 
SET 
    auteur = 'Agatha Christie'
WHERE
    auteur = 'Agatha Christies';


-- ex7

insert into 
	livre
    (titre,auteur,editeur,date_publication,isbn_10,isbn_13)
values 
('la mort de ?????','yamine ben','livre de poche',now(),'a01005640X','a01005640X');

SELECT 
    *
FROM
    livre
WHERE
    auteur = 'yamine ben';

-- ex8
DELETE FROM livre 
WHERE
    auteur = 'Agatha Christie'
    AND titre = 'Mort sur le Nil';

