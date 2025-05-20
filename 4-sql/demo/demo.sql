/************************
MANIPULATION DES BASE DE DONNEES
*************************/

-- Creation d'une base de données 
CREATE DATABASE entreprise_demo;

-- Creation d'une base de données si celle-ci n'existe pas
CREATE DATABASE IF NOT EXISTS entreprise_demo;

-- Permet d'afficher toutes les base de donneees
SHOW DATABASES;

-- Suppression de la base de donéées si celle-ci existe
-- DROP DATABASE entreprise_demo;
DROP DATABASE IF EXISTS entreprise_demo;

-- Afficher les schémas des base de données
SELECT * FROM information_schema.SCHEMATA;

-- Modification d'une base de données
-- ALTER DATABASE entreprise_demo ENCRYPTION ='Y';

-- Utiliser une bas de données
USE entreprise_demo;

/************************
MANIPULATION DES Tables
*************************/

-- Création d'une table service
CREATE TABLE IF NOT EXISTS service(
	service_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	libelle VARCHAR(150) NOT NULL
);

-- CRéation d'une seconde table
CREATE TABLE IF NOT EXISTS salarie(
	salarie_id INT NOT NULL AUTO_INCREMENT, -- clé primaire qui s'auto incremente
    prenom VARCHAR(50) NOT NULL, -- Obligation de fournir une valeur
    nom VARCHAR(50) NOT NULL,
    age INT NOT NULL CHECK(age > 18 AND age < 65), -- Contrainte pour verifier l'age
    salaire FLOAT NOT NULL DEFAULT 1500, -- Valeur par défaut
    service_id INT NOT NULL, -- Clé etrangere
    PRIMARY KEY (salarie_id), -- contrainte de clé primaire
    CONSTRAINT fk_service_id FOREIGN KEY (service_id) REFERENCES service(service_id) -- Contrainte nommé d'une clé etrangere
);

-- CRéation d'une seconde table sans contrainte nommé
CREATE TABLE IF NOT EXISTS salarie(
	salarie_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, -- clé primaire qui s'auto incremente
    prenom VARCHAR(50) NOT NULL, -- Obligation de fournir une valeur
    nom VARCHAR(50) NOT NULL,
    age INT NOT NULL CHECK(age > 18 AND age < 65), -- Contrainte pour verifier l'age
    salaire FLOAT NOT NULL DEFAULT 1500, -- Valeur par défaut
    service_id INT NOT NULL, -- Clé etrangere
    FOREIGN KEY (service_id) REFERENCES service(service_id) -- Contrainte nommé d'une clé etrangere
);

-- Suppression de la table si elle existe
DROP TABLE IF EXISTS service;
DROP TABLE IF EXISTS salarie;

-- Afficher les tables de la base de données
SHOW TABLES;

-- Afficher les details des colonnes de la table choisie
SHOW COLUMNS FROM service;
SHOW COLUMNS FROM salarie;

-- Ajouter une colonne date-heure
ALTER TABLE service ADD COLUMN date_modification DATETIME;

-- Modifier une collonne
ALTER TABLE service
	MODIFY COLUMN date_modification DATE;




