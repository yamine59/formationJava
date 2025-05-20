create database if not exists exercice1; 
create table personne(
	personne_id int not null primary key auto_increment,
    titre enum('M','Mme'),
    prenom varchar(50) not null,
    nom varchar(50) not null,
    
    telephone int not null ,
    mail varchar(255) not null unique

);

ALTER TABLE personne
	MODIFY  titre enum('Mr','Mme');

create table addresses(*
	address_id int primary key not null auto_increment,
    rue varchar(255) not null,
    code_postal int not null,
    ville varchar(255),
    personne_id int not null ,
     CONSTRAINT fk_personne_id foreign key (personne_id) references personne(personne_id)
);

drop table role;

insert into 
	personne
    (titre,prenom,nom,telephone,mail)
values
	('Mme','lila','dentar','0645070707','lila@gmail.com' );


select * from personne;
select * from adresse;
insert into 
	adresse
    (rue,code_postal,ville,personne_id)
values
    ('rue des ecole',59100,'roubaix',3);
    
DELETE FROM adresse 
WHERE
    personne_id = 3;
DELETE FROM personne 
WHERE
    prenom = 'lila';
    
UPDATE personne 
SET 
    telephone = '0609030201'
WHERE
    nom = 'tayeb';
    
select * from personne order by nom desc;
select * from personne order by titre desc;
select * from personne where mail = 'test@gmail.com';

select * from personne where titre = 'Mme' 
