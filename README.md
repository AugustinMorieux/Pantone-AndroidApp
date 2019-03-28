# Android Application Pantone© :

Créateur: Augustin Mørieux (3A3)

## Présentation :

Application sous Android studio permettant de connaitre les couleurs associé a des éléments, ceci en faisant appel à des images contenues dans une API.


## Consignes respectées :

* Architecture MVC
* Appel WebService à une API Rest.
* Recycler View
* Faire Gitflow
* Animation
*  Création d’une API (https://augustinmorieux.github.io/Pantone.Json)
* Deux Écrans : Un écran avec une liste et un écran avec un détail de détail de l’item
* Determiner la couleur moyenne d’une image et l’afficher comme background dans l’activité 2



### Architecture:
* Model
	- Pokemon
	- PokeResponse
* View
	- Main2Activity
	- MainActivity 
* Controller
	- Moscou
- MyAdapter
- PokeAPI

### Appel WebService à  une API Rest:
J’ai fait appel à June API que j’ai créer qui regroupe d’aliment Pantones© que j’ai publié sur GitHub (https://augustinmorieux.github.io/Pantone.Json).

La structure de mon API est la suivante:

```
{
	"count":15,

	"results":[
	….
	{
			"name":"Epices",
			"img":"https://jefouinetufouines.fr/wp-content/uploads/2016/09/food-pantone-epices.jpg",
			"hex":"#CC0033",
			"rgb":"rgb(255, 178, 38)"
	},
	….
}

```

### RecyclerView:
Ici la recycler View permet d’afficher:
- Les éléments dont on souhaite connaitre la couleur
- La valeur Hexadecimal de la couleur
- L’affichage de la couleur depuis sa valeur  Hexadecimal 

### Faire GitFlow:
Le GItFlow à été développé avec GitKraken et contient deux branches:
	- master
	- dev

### Animation:
Lorsque l’on clique sur un élément, l’activité actuel se slide vers la droite. Pour se Faure j’ai utilisé les bibliothèques créent par Mohammadatif (https://github.com/mohammadatif/Animatoo)

![IMG_1](https://github.com/AugustinMorieux/Pantone-AndroidApp/blob/Dev/IMG_1.gif)

### Deux Ecrans:
![IMG_3](https://github.com/AugustinMorieux/Pantone-AndroidApp/blob/Dev/IMG_3.png)


## Remarques:

	Si en cliquant sur l’image 

## Fonctionnalités:





