let jourSemaine = [];
jourSemaine.push("Lundi");
jourSemaine.push("Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche");

console.log(jourSemaine);
console.table(jourSemaine);



let indexMardi = jourSemaine.indexOf("Mardi");
console.log(`L'index de Mardi est : ${indexMardi}`);



console.table(jourSemaine.slice(0, 3));



