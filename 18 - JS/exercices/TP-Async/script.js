
const mission = document.querySelector(`#launch`);

 
function attendre(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

async function animerProgress(id, duree) {  
   
  const progress = document.querySelector(`#${id}Progress`);
    progress.max = duree
    try {
        
        let i = 0;
        setInterval(() => {
            i++;
            progress.value = i;
            if (i >= duree) {
                clearInterval();
            }
        }, 1000 );
        
    } catch (error) {
        console.error(error)
    }
     
 
}

async function lancerMission() {
 
    try {
        animerProgress("preparation",2)
        await attendre(2000)
        animerProgress("expedition",1.5)
        await attendre(1500)
        animerProgress("livraison",2.5)
    } catch (error) {
        console.error(error)
    }
    
}
mission.addEventListener("click", () => {    
    lancerMission()
})

