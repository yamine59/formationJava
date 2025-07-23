// Définir les scores des joueurs dans un tableau
const scores = [44, 53, 33, 99, 57];

function afficherScores(scores) {
    console.log("Scores des joueurs: ");
    console.log(scores);
}

function moyenne(scores) {
    let somme = 0;
    for (let i = 0; i < scores.length; i++) {
        somme += scores[i];
    }

    return somme / scores.length;
}

function meilleurScore(scores) {
    let max = scores[0];
    for (let i = 0; i < scores.length; i++) {
        if (scores[i] > max) {
            max = scores[i];
        }
    }

    return max;
}

function mention(score) {
    if (score < 50) {
        return "Insuffisant";
    } else if (score < 65) {
        return "Passable";
    } else if (score < 80) {
        return "Bien";
    } else if (score < 90) {
        return "Très bien";
    } else {
        return "Excellent";
    }
}


// 1. Afficher les scores
afficherScores(scores);

// 2. Afficher la moyenne
const moyenneScores = moyenne(scores);
console.log("Score moyen:", moyenneScores);

// 3. Afficher le meilleur score
const meilleur = meilleurScore(scores);
console.log("Meilleur score:", meilleur);

// 4. Afficher les mentions
console.log("Mentions: ");
for (let i = 0; i < scores.length; i++) {
    const m = mention(scores[i]);
    console.log(`Joueur ${i + 1}: ${m}`);
}
