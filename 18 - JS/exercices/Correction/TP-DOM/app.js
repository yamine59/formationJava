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
// ---------------
themeToggleCheckbox.addEventListener("change", () => {
  const isDark = themeToggleCheckbox.checked;
  body.classList.toggle("dark", isDark);
  body.classList.toggle("light", !isDark);
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

function savePreferences(pseudo, description, avatar, theme) {
  const data = {
    pseudo,
    description,
    avatar,
    theme
  };
  localStorage.setItem("userPreferences", JSON.stringify(data) )
}

function showProfileCard({pseudo, description, avatar, theme}) {
  body.classList.toggle("dark", theme === "dark");
  body.classList.toggle("light", theme !== "dark");
  
  const card = document.createElement("div");
  card.className = "card";

  const img = document.createElement("img");
  img.src = avatar;
  img.style.width = "100px";

  const name = document.createElement("h2");
  name.textContent = pseudo;

  const desc = document.createElement("p");
  desc.textContent = description;

  const restartBtn = document.createElement("button");
  restartBtn.textContent = "Recommencer";
  restartBtn.addEventListener("click", () => {
    localStorage.removeItem("userPreferences");
    window.location.reload()
  });

  card.appendChild(img);
  card.appendChild(name);
  card.appendChild(desc);
  card.appendChild(restartBtn);

  document.body.innerHTML = ""; // Supprime tout
  document.body.appendChild(card);
  document.body.appendChild(themeToggle); // On garde le toggle thème
}

// ---------------
// Validation finale
// ---------------
nextBtn.addEventListener("click", () => {
  const pseudo = pseudoInput.value;
  const theme = themeToggleCheckbox.checked ? "dark" : "light";

  savePreferences(pseudo, currentDescription, selectedAvatar, theme);
  showProfileCard({
    pseudo,
    description : currentDescription,
    avatar : selectedAvatar,
    theme
  });


});

// -------------
// Chargement initial
// -------------
window.addEventListener("DOMContentLoaded", () => {
  const saved = localStorage.getItem("userPreferences");
  if (saved) {
    const data = JSON.parse(saved);
    showProfileCard(data);
  } else {
    setRandomDescription();
  }
})
