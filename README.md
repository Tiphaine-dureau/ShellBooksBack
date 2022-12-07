# Mini Bibliothèque

Il s'agit d'un mini-projet, front et back séparé, intégrant les fonctionnalités principales d'une bibliothèque  
Ici est concernée la partie back réalisée avec Java Spring Boot et Maven.

## Configuration du Back-end

- Java JDK 17
- Gestion et automatisation avec MAVEN
- Spring Boot Starter Web
- Spring Boot Starter JPA
- Spring Boot Starter JDBC
- Liquibase pour le versioning de la base de données
- Postgres SQL via un container docker : 
`docker run --name shellbooks-postgres -e POSTGRES_PASSWORD=********* -p 5432:5432  -d postgres`

## Partie Front

Vous la trouverez sur un autre repository. Elle est réalisée avec Angular 14 et Angular Material.  
Pour les tests front une dépendance Jest a été configurée.

## Trello du projet
https://trello.com/b/gThqoRsU/shellbooks
