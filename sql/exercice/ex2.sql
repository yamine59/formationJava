create table compte(
	compte_id int primary key not null auto_increment,
    pseudo varchar(50) not null,
    mot_de_passe varchar(50) not null,
    email varchar(255) not null,
    date_creation datetime not null,
    dernier_connexion varchar(50) not null
);
create table role(
	role_id int primary key not null auto_increment,
	libelle varchar(50) not null 
);

create table compte_role(
	compte_id int not null,
	role_id int not null,
	date_ajoute datetime default now() not null,
	CONSTRAINT fk_compte_id FOREIGN KEY (compte_id) REFERENCES compte(compte_id), -- Contrainte nommé d'une clé etrangere
	CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES role(role_id) -- Contrainte nommé d'une clé etrangere

);
 ALTER TABLE compte_role
	MODIFY  date_ajoute datetime default now() not null;