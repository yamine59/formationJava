const contentDiv = document.querySelector('#content') as HTMLDivElement;
const btn = document.querySelector('#btn') as HTMLButtonElement;

btn.addEventListener('click', () => {
    contentDiv.textContent = "le contenu a changé"; 
})