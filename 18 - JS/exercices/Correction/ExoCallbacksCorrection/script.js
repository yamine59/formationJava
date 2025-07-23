const scores = [92, 65, 79, 45, 100, 30, 53];

function filtrerScores(scores, callback) {
    const resultat = [];
    for (let i = 0; i < scores.length; i++) {
        if (callback(scores[i])) {
            resultat.push(scores[i]);
        }
    }

    return resultat;
}

function estExcellent(score) {
    return score >= 90;
}

const estMoyen = function(score) {
    return score >= 50 && score < 80;
}

const estInsuffisant = (score) => score < 50;

// Affichage

const excellents = filtrerScores(scores, estExcellent);
const moyens = filtrerScores(scores, estMoyen);
const insuffisants = filtrerScores(scores, estInsuffisant);

console.log("Scores excellents: ", excellents);
console.log("Scores moyens: ", moyens);
console.log("Scores insuffisants: ", insuffisants);


// Bonus

function traiterScores(scores, callback) {
    const resultat = [];
    for (let i = 0; i < scores.length; i++) {
        resultat.push(callback(scores[i]));
    }

    return resultat;
}

function doubler(score) { return score * 2; }
function arrondir(score) { return Math.round(score); }

const doubles = traiterScores(scores, doubler);
const arrondis = traiterScores(scores, arrondir);

console.log("Scores doublés: ", doubles);
console.log("Scores arrondis: ", arrondis);