let scores = [];
scores.push(10, 20, 30, 40, 50)

function afficherScores(score){
    
    for (let i = 0; i < score.length; i++) {
        console.log(score[i])
        mentionScore(score[i])
    }
}

function moyenneScores(scores){
    let somme = 0;
    for (let i = 0; i < scores.length; i++) {
        somme += scores[i];
    }
    return somme / scores.length;
}

function meilleurScore(scores){
    let meilleur = scores[0];
    for (let i = 1; i < scores.length; i++) {
        if (scores[i] > meilleur) {
            meilleur = scores[i];
        }
    } 
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


afficherScores(scores)

moyenneScores.scores
meilleurScore.scores