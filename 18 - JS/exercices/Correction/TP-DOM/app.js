// ---------------
// Initialisation
// ---------------
const body = document.body;
const themeToggle = document.getElementById("toggleTheme");
const themeToggleCheckbox = document.getElementById("toggleThemeCheckbox");
const descDisplay = document.getElementById("description");
const changeDescBtn = document.getElementById("changeDescriptionBtn");
const pseudoInput = document.getElementById("pseudo");
const pseudoError = document.getElementById("pseudoError");
const avatarPreviews = document.querySelectorAll(".avatar-preview");
const nextBtn = document.getElementById("nextBtn");
const profileCard = document.getElementById("profileCard");

const descriptions = [
  "Probablement accroc au café...",
  "Développeur java en formation",
  "Futur maître du DOM."
];

let selectedAvatar = null;
let currentDescription = "";

// ---------------
// Thème
// ---------------*
let checked;
themeToggleCheckbox.addEventListener("change", () => {
  const isDark = themeToggleCheckbox.checked;
  body.classList.toggle("dark", isDark);
  body.classList.toggle("light", !isDark);
  checked = themeToggleCheckbox.value;
  
});


// ---------------
// Description aléatoire
// ---------------
function setRandomDescription() {
  let newDesc;
  do {
    newDesc = descriptions[Math.floor(Math.random() * descriptions.length)];
  } while (newDesc === currentDescription);

  currentDescription = newDesc;
  descDisplay.textContent = newDesc;
}

window.addEventListener("DOMContentLoaded", setRandomDescription);
changeDescBtn.addEventListener("click", setRandomDescription);

// ---------------
// Pseudo
// ---------------
function isPseudoValid(str) {
  return /^[a-zA-Z]+$/.test(str);
}


pseudoInput.addEventListener("input", () => {
  if (isPseudoValid(pseudoInput.value)) {
    pseudoError.style.display = "none";
  } else {
    pseudoError.style.display = "inline";
  }
  updateNextButtonState();
});

// ---------------
// Avatar
// ---------------
avatarPreviews.forEach(img => {
  img.addEventListener("click", () => {
    avatarPreviews.forEach(i => i.classList.remove("selected"));
    img.classList.add("selected");
    selectedAvatar = img.src;

    updateNextButtonState();
  });
});

// ---------------
// Activation du bouton
// ---------------
function updateNextButtonState() {
  const isReady =
    isPseudoValid(pseudoInput.value) &&
    currentDescription !== "" &&
    selectedAvatar !== null;

  nextBtn.disabled = !isReady;
}






// ---------------
// Validation finale
// ---------------
nextBtn.addEventListener("click", () => {
  const pseudo = pseudoInput.value;

  const card = document.createElement("div");
  card.className = "card";

  const avatar = document.createElement("img");
  avatar.src = selectedAvatar;
  avatar.style.width = "100px";

  const name = document.createElement("h2");
  name.textContent = pseudo;

  const desc = document.createElement("p");
  desc.textContent = currentDescription;

  const restartBtn = document.createElement("button");
  restartBtn.textContent = "Recommencer";
  restartBtn.addEventListener("click", () => window.location.reload());

  const user = {
    pseudoUser : pseudoInput.value,
    descriptionUser : currentDescription,
    avatarUser: selectedAvatar,
    themeUser: themeToggle
  }
  
  localStorage.setItem("user",JSON.stringify(user))

 
  
  card.appendChild(avatar);
  card.appendChild(name);
  card.appendChild(desc);
  card.appendChild(restartBtn);

  
  document.body.innerHTML = ""; // Supprime tout
  document.body.appendChild(card);
  document.body.appendChild(themeToggle); // On garde le toggle thème
});


window.addEventListener("DOMContentLoaded", () => {
 
  const saved = localStorage.getItem("user")
  if (saved) {
    const userObj = JSON.parse(saved)

    const card = document.createElement("div");
    card.className = "card";

    const avatar = document.createElement("img");
    avatar.src = userObj.avatarUser;
    avatar.style.width = "100px";

    const name = document.createElement("h2");
    name.textContent = userObj.pseudoUser;

    const desc = document.createElement("p");
    desc.textContent = userObj.descriptionUser;

    const restartBtn = document.createElement("button");
    restartBtn.textContent = "Recommencer";
    restartBtn.addEventListener("click", () => {
      window.location.reload()
      localStorage.removeItem("user")
    });



    card.appendChild(avatar);
    card.appendChild(name);
    card.appendChild(desc);
    card.appendChild(restartBtn);
    document.body.innerHTML = ""; // Supprime tout
    document.body.appendChild(card);
    document.body.appendChild(themeToggle); // On garde le toggle thème
  }
})