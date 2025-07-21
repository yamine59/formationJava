let scores = [];
scores.push(45, 100, 69, 85, 50)

function afficherScores(score){
  console.log("Scores des joueurs : ");
  console.log(score)
}

function moyenneScores(score){
    let somme = 0;
    for (let i = 0; i < score.length; i++) {
        somme += score[i];
    }
    console.log("Score moyen : " + somme/score.length);
}

function meilleurScore(score){
    let meilleur = score[0];
    for (let i = 1; i < score.length; i++) {
        if (score[i] > meilleur) {
            meilleur = score[i];
        }
    } 
    console.log("Score moyen : " + meilleur);
}

function mentionScore(score) {
    for (let i = 0 ; i < scores.length; i++) {
        let index = i+1
        switch (true) {
            case (score[i] < 50):
                console.log("Joueur "+ index+" : Insuffisant");
                break;
            case (score[i] >= 50 && score[i] <= 64):
                console.log("Joueur "+ index+" : Passable");
                break;
            case (score[i] >= 65 && score[i] <= 79):
                console.log("Joueur "+ index+" : Bien");
                break;
            case (score[i] >= 80 && score[i] <= 89):
                console.log("Joueur "+ index+" : Très bien");
                break;
            case (score[i] >= 90 && score[i] <= 100):
                console.log("Joueur "+ index+" : Excellent");
                break;
           
        }
        
    }
    
}



afficherScores(scores)
moyenneScores(scores)
meilleurScore(scores)
mentionScore(scores)