insert into
	service
values
    (null,'RH',NOW());

select * from service;
    
INSERT INTO
	service
    (libelle,date_modification)
VALUES
	('Developpement','2024-08-15');
    
    ALTER TABLE service
	MODIFY  date_modification date not null ;