create database ex5;
use ex5;
select * from villes_france_free;
select * from departement;
/*
En utilisant les fichiers villes_frances.sql et departement.sql :
1. Obtenir la liste des 10 villes les plus peuplées en 2012
2. Obtenir la liste des 50 villes ayant la plus faible superficie
3. Obtenir la liste des départements d’outre-mer, c’est-à-dire ceux dont le numéro de département commençant par “97”
4. Obtenir le nom des 10 villes les plus peuplées en 2012, ainsi que le nom du département associé
5. Obtenir la liste du nom de chaque département, associé à son code et du nombre de commune au sein de ces
départements, en triant afin d’obtenir en priorité les départements qui possèdent le plus de communes
6. Obtenir la liste des 10 plus grands départements, en termes de superficie
7. Compter le nombre de villes dont le nom commence par “Saint”
8. Obtenir la liste des villes qui ont un nom existants plusieurs fois, et trier afin d’obtenir en premier celles dont le nom est le
plus souvent utilisé par plusieurs communes
9. Obtenir en une seule requête SQL la liste des villes dont la superficie est supérieure à la superficie moyenne
10. Obtenir la liste des départements qui possèdent plus de 2 millions d’habitants
11. Remplacez les tirets par un espace vide, pour toutes les villes commençant par “SAINT-” (dans la colonne qui contient les
noms en majuscule)
*/
-- Q1
SELECT ville_nom,ville_population_2012  FROM villes_france_free order by ville_population_2012 desc limit 10;

-- Q2
SELECT ville_nom,ville_surface as 'superficie'  FROM villes_france_free order by ville_surface  limit 50;

-- Q3
select * from departement  where departement_code like '97%';

-- Q4
SELECT ville_nom,ville_population_2012,departement.departement_nom , departement.departement_code
FROM villes_france_free 
join departement on departement.departement_code = villes_france_free.ville_departement 
order by ville_population_2012 desc limit 10 ;

-- Q5  Obtenir la liste du nom de chaque département, associé à son code et du nombre de commune au sein de ces
-- départements, en triant afin d’obtenir en priorité les départements qui possèdent le plus de communes

SELECT 
    departement_nom ,
    departement_code, 
    count(departement_code) as 'nombre_communes'
FROM villes_france_free
join departement on departement_code = ville_departement
group by 
	departement_nom ,
    departement_code 
ORDER BY 
    nombre_communes DESC;
    
-- Q6
SELECT sum(round(ville_surface)) as superficie  ,
		departement_nom,
        departement_code
FROM villes_france_free 
join departement on departement_code = ville_departement
group by departement_nom,
         departement_code
order by superficie desc limit 10;

-- Q7
select count(ville_nom) as 'ville commencant par saint'
from villes_france_free
where ville_nom like 'Saint%'
union
select ville_nom from villes_france_free where ville_nom like 'Saint%';


-- Q8
select ville_nom, count(ville_nom) as nbr_ville
from villes_france_free  as ville
GROUP BY ville_nom
HAVING nbr_ville >1
order by nbr_ville desc;

-- 9. Obtenir en une seule requête SQL la liste des villes dont la superficie est supérieure à la superficie moyenne
SELECT ville_nom,ville_surface  FROM villes_france_free 
where ville_surface > 
(SELECT avg(ville_surface) as superficie FROM villes_france_free )
;

-- Q10. Obtenir la liste des départements qui possèdent plus de 2 millions d’habitants

SELECT 	departement.departement_nom ,
	 sum(ville.ville_population_2012 ) as 'nombre d’habitants'
FROM villes_france_free  as ville
join departement on departement.departement_code = ville.ville_departement
group by departement.departement_nom 
having sum(ville.ville_population_2012 ) >2000000;

-- Q11 

update villes_france_free set ville_nom = REPLACE (ville_nom,'-',' ') where ville_nom like 'saint-%';
