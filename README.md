# HelloJenkins
## Description
Le projet **Hello Jenkins** est une application Java Maven simple conçue pour démontrer le processus d'intégration continue avec Jenkins. Il s'agit d'une application console qui affiche "Hello Jenkins" et inclut un test unitaire pour valider son bon fonctionnement.

## Prérequis

- Java 8 ou supérieur
- Maven 3.6 ou supérieur

## Installation

1. **Cloner le projet :**
   ```bash
   git clone https://github.com/providjek/HelloJenkins.git

2. **Naviguer dans le répertoire du projet :**
   ```bash
    cd HelloJenkins
   
3. **Installer les dépendances Maven  :**
   ```bash
    mvn clean install

## Exécution du programme
Pour exécuter l'application principale qui affiche "Hello Jenkins", utilisez la commande Maven suivante :
```bash
    mvn exec:java -D"exec.mainClass"="org.ucac.icam.Main"
```

## Lancer les tests
Le projet contient un test unitaire simple pour valider le message affiché. Pour exécuter les tests, utilisez la commande suivante :
```bash
mvn test
```

## Auteur
Ce projet a été créé dans le cadre d'un workshop Jenkins pour les étudiants de  l'institut **UCAC-ICAM**.


