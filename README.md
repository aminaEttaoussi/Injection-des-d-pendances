# Injection des dépendances avec Java et Spring

Ce projet est une démonstration de l'injection des dépendances en Java, réalisée dans le cadre du module de programmation avec Spring. Il illustre plusieurs manières d’instancier des objets (couplage fort, couplage faible, et Spring).

##  Objectif

Mettre en œuvre différentes méthodes d'injection des dépendances :

-  **Instanciation statique** (couplage fort)
-  **Instanciation dynamique** (couplage faible)
-  **Injection via Spring XML**
-  **Injection via Spring Annotations**

##  Structure du projet

```bash
App1/
├── metier/
│   ├── IMetier.java
│   └── MetierImpl.java
├── dao/
│   ├── IDao.java
│   └── DaoImpl.java
├── presentation/
│   ├── Pres1.java          # instanciation statique
│   ├── Pres2.java          # instanciation dynamique
│   ├── PresSpringXml.java  # injection via Spring XML
│   └── PresSpringAnnotation.java # injection via annotations
└── config.xml              # fichier de configuration Spring XML
