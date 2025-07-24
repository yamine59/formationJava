import { Lion } from "./Lion.js";
import { Perroquet } from "./Perroquet.js";

const ajouter = document.querySelector("#ajouter");
const nom = document.querySelector("#nom");
const age = document.querySelector("#age");
const espece = document.querySelector("#espece");
const cardsContainer = document.querySelector("#cards");
const actionContainer = document.querySelector("#action");

let tab = [];

ajouter.addEventListener("click", (e) => {
    e.preventDefault();

    let animal;
    const selectedEspece = espece.value;

    if (selectedEspece === "Lion") {
        animal = new Lion(nom.value, age.value);
    } else if (selectedEspece === "Perroquet") {
        animal = new Perroquet(nom.value, age.value);
    } else {
        animal = {
            nom: nom.value,
            age: age.value,
            crier() {
                return `${this.nom} dit ${this.cri}`;
            }
        };
    }

    tab.push(animal);

    const card = document.createElement("div");
    card.className = "bg-white rounded-lg shadow-lg p-4 m-2 w-64";

    // Génère un bouton unique par carte
    const btnId = `btn-${tab.length - 1}`; // Ex: btn-0, btn-1...

    card.innerHTML = `
        <div class="flex items-center">
            <h5 class="text-lg font-bold text-blue-500">${animal.nom} (${animal.constructor.name})</h5>
        </div>
        <p class="text-gray-700 text-sm mt-2">Age: ${animal.age}</p>
        <p class="text-gray-700 text-sm">Cri: ${animal.crier()}</p>
        <button id="${btnId}" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded mt-2">Crier</button>
    `;

    cardsContainer.appendChild(card);
    

    // Attache un écouteur sur le bouton "Crier"
    document.querySelector(`#${btnId}`).addEventListener("click", (e) => {
        e.preventDefault();
        
        const criCard = document.createElement("div");
        criCard.className = "bg-yellow-100 rounded-lg shadow p-4 m-2 w-64 text-center";
        criCard.innerHTML = `<p class="font-semibold text-lg">${animal.chasser()}</p>`;
        actionContainer.appendChild(criCard);
    });
});
