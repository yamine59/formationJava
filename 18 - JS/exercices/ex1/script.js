const scores = [];
scores.push(45, 100, 69, 85, 50)

function afficherscores(scores){
    return scores
}

function moyennescores(scores){
    let somme = 0;
    for (let i = 0; i < scores.length; i++) {
        somme += scores[i];
    }
    const moyennescores = somme/scores.length;
    return moyennescores;
}

function meilleurscores(scores){
    let meilleur = scores[0];
    for (let i = 1; i < scores.length; i++) {
        if (scores[i] > meilleur) {
            meilleur = scores[i];
        }
    } 
    return meilleur;
}
function mentionscores(scores) {
    let result = []
    for (let i = 0 ; i < scores.length; i++) {
        let index = i+1
        switch (true) {
            case (scores[i] < 50):
                result.push("Joueur "+ index+" : Insuffisant");
                break;
            case (scores[i] >= 50 && scores[i] <= 64):
                result.push("Joueur "+ index+" : Passable");
                break;
            case (scores[i] >= 65 && scores[i] <= 79):
                result.push("Joueur "+ index+" : Bien");
                break;
            case (scores[i] >= 80 && scores[i] <= 89):
                result.push("Joueur "+ index+" : Très bien");
                break;
            case (scores[i] >= 90 && scores[i] <= 100):
                result.push("Joueur "+ index+" : Excellent");
                break;
            
           
        }
        
    }
    return result
    
}

console.log("scores des joueurs : ",afficherscores(scores));
console.log("scores moyen : " , moyennescores(scores));
console.log("Meilleur scores : " , meilleurscores(scores));
console.log("mentions des joueurs : ",mentionscores(scores));



//with console.table
// console.log("scores des joueurs : ");
// console.table(afficherscores(scores));
// console.log("scores moyen : " , moyennescores(scores));
// console.log("Meilleur scores : " , meilleurscores(scores));
// console.table(mentionscores(scores));

function estExcellent(score){
    if (score>= 90) {
        return true
    }
    return false
}
function estMoyen(score){
    if (score >= 50 && score <= 80) {
        return true
    }
    return false
}
function estInsuffisant(score){
    if (score < 50) {
        return true
    }
    return false
}

function filtersScores(scores,callback){
    let result = []
    for (let i = 0; i < scores.length; i++) {
         result.push(scores[i]+" est " + callback(scores[i]) ) 
    }
    return result
    
}
console.log(scores);
console.log("Filtres des scores")
console.log("les scores excellents : ");
console.table(filtersScores(scores,estExcellent));
console.log("les scores moyens : ");
console.table(filtersScores(scores,estMoyen));
console.log("les scores insuffisants : ");
console.table(filtersScores(scores,estInsuffisant));
