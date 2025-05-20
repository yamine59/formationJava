create table professeur(
	professeur_id int primary key not null auto_increment,
    prenom varchar(50) not null,
    nom varchar(50) not null,
    n_classe int not null ,
    n_departement int not null ,
    email varchar(255) not null unique,
    telephone varchar(12) not null unique
);



create table etudiant(
	etudiant_id int primary key not null auto_increment,
	prenom varchar(50) not null,
    nom varchar(50) not null,
    n_classe int not null ,
    telephone varchar(12) not null unique,
    date_obtention_diplome date
); 
ALTER TABLE etudiant_professeur
	MODIFY  date_ajoute datetime  default now();
    
create table etudiant_professeur(
	etudiant_id int not null,
	professeur_id int not null,
	date_ajoute datetime not null,
	CONSTRAINT fk_professeur_id FOREIGN KEY (professeur_id) REFERENCES professeur(professeur_id),
	CONSTRAINT fk_etudiant_id FOREIGN KEY (etudiant_id) REFERENCES etudiant(etudiant_id)

);


INSERT INTO professeur(prenom, nom, n_classe, n_departement, email, telephone) VALUES ('toto', 'tata', 214, '59', 'toto@gmail.com', 0753474050);
select * from etudiant_professeur;
INSERT INTO etudiant(prenom, nom, n_classe, telephone) VALUES ('aaaa', 'taata', 214, 0753474050);



insert into etudiant_professeur(etudiant_id,professeur_id)
values (1,1)