A FAIRE:


- [ ] Faire un Gitflow
- [ ] Mettre en cache
- [ ] Generer APK

————————————————————————————————————————————————————————————————
————————————————————————————————————————————————————————————————
GITHUB:


# Android Application Pantone© :

Créateur: Augustin Mørieux (3A3)

## Présentation :

Application sous Android studio permettant de connaitre les couleurs associé a des éléments, ceci en faisant appel à des images contenues dans une API.


## Consignes respectées :

* Architecture MVC
* Appel WebService à une API Rest.
* Recycler View
* Faire Gitflow
* Animations
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


## Remarques:

	Si en cliquant sur l’image 

## Fonctionnalités:





