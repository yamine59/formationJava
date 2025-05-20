insert into
	service
values
    (null,'RH',NOW());

select * from salarie;
select * from service;
INSERT INTO
	service
    (libelle,date_modification)
VALUES
	('Developpement','2024-08-15');
    
    ALTER TABLE service
	MODIFY  date_modification date not null ;
    
UPDATE service 
SET 
    libelle = 'Recherche et développement',
    date_modification = NOW()
WHERE
    service_id = 3;
    
SELECT 
    nom_salarie, prenom_salarie
FROM
    (SELECT 
        *
    FROM
        salarie
    WHERE
        prenom_salarie LIKE 'y%') AS nom_en_y
WHERE
    age > 20;
    
select nom_salarie,prenom_salarie,salaire,service.libelle
from salarie
join service
on salarie.service_id = service.service_id


