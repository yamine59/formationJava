
const mission = document.querySelector(`#launch`);
const resultat = document.querySelector(`#resultat`);
 
function attendre(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

async function animerProgress(id, duree) {  
    const progress = document.querySelector(`#${id} progress`);
    const stage = document.querySelector(`#${id}`);
    
    progress.max = duree;
    let i = 0;
    const interval = setInterval(() => {
        i += 0.01;
        progress.value = i;
        if (i >= duree) {
            stage.innerText = `La mission de ${id} est terminée !`;
            clearInterval(interval);
        }
    }, 10 );
}

async function lancerMission() {
 
    try {
    
        animerProgress("preparation",5)
        await attendre(5000)
        animerProgress("expedition",2)
        await attendre(2000)
        animerProgress("livraison",10)
        await attendre(10000)
        resultat.innerText = `Tout les mission sont terminée avec succès !`;
    } catch (error) {
        resultat.innerText = `Erreur lors de les missions !`;
        console.error(error)
    }
    
}
mission.addEventListener("click", () => {    
    lancerMission()
})

