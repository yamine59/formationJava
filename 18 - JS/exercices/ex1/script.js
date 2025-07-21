let scores = [];
scores.push(10, 20, 30, 40, 50)

function afficherScores(score){
    
    for (let i = 0; i < score.length; i++) {
        console.log(score[i])
        mentionScore(score[i])
    }
}

function moyenneScores(score){
    let somme = 0;
    for (let i = 0; i < score.length; i++) {
        somme += score[i];
    }
    return somme / score.length;
}

function meilleurScore(score){
    let meilleur = score[0];
    for (let i = 1; i < score.length; i++) {
        if (score[i] > meilleur) {
            meilleur = score[i];
        }
    } 
    return meilleur
}

function mentionScore(score) {
    switch (true) {
        case (score < 50):
            console.log("Insuffisant");
            break;
        case (score >= 50 && score <= 64):
            console.log("Passable");
            break;
        case (score >= 65 && score <= 79):
            console.log("Bien");
            break;
        case (score >= 80 && score <= 89):
            console.log("Très Bien");
            break;
        case (score >= 90 && score <= 100):
            console.log("Excellent");
            break;
       
    }
}




console.log(moyenneScores(scores))
console.log(meilleurScore(scores))