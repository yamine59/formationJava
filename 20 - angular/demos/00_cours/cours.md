## Les commandes de bases 

- Installer Angular :

```bash
npm install -g @angular/cli
```

- Création d'un nouveau projet :

```bash
ng new <nom_projet>
```

- Récupération d'un projet existant :
    - Installer les dépendances avec `npm install` ou `npm i`

- On lance le serveur avec `npm start` ou `ng serve`

- Création d'un nouveau composant
pour eviter de créer le fichier de test (spec.ts), il faut ajouter l'option `--skip-tests`

```bash
ng g c dossier/nom-composant --skip-tests
```

## L'interpolation

C'est le fait d'interpréter du ts dans le template. Pour ça, on utilise les balises `{{}}`. On peut aficher n'importe quelle expression js tant qu'elle retourne quelque chose.

## Data Binding

Permet d'interpêter du js dans les attributs HTML. On peut interpréter du js dans n'importe quel attribut à condition de mettre l'attribut entre crochets.

```angular2html
<img [src]="nom_variable" >
```