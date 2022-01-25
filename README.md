# poo
Instructions:

Ce travail est individuel, vous pouvez faire des recherches sur internet ou demander de l’aide mais demander du code à son camarade n’est pas autorisé. Essaie de monter en compétences par toi-même et je suis là pour t’accompagner, te débloquer en cas de bug… Le but est d’apprendre.


Énoncé: 


Vous êtes embauché dans une banque. À votre arrivée, la banque souhaite mettre en place une application de gestion de ses activités.  En tant que Développeur(se) Java qui s’y  connaît en Programmation Orientée Objet, vous êtes affecté(e) au composant qui pourra gérer ses clients, les comptes bancaires des clients et les RIB.

Votre mission:

Épisode 1 

Créer des Classes indépendantes mais qui échangent des informations(couplage des composants) pour permettre l’extension de l’application plus tard et afficher les données de test à la fin de votre étape. N’oubliez pas les constructeurs,getters…


Les données à gérer:

La banque

Les clients

Les compte bancaires

Les Rib






Voici Les données(attribut) de chaque classe

Class Customer

private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private int age;
    private char gender;//F ou M
    private double monthSalary;









Class Bank

private String name;
    private String logo;
    private String address;
    private String phoneNumber;
    private String countryIdentifier;
    private int bankIdentifier;
    private String swiftCode;//BIC
    private int officeCode;// branche
    Customer customer;
    





Class Account

           Bank bank;
     Customer customer;



Class Rib

Account account;




Vous êtes libres d’organiser votre UML comme vous le souhaitez pour arriver au résultat mais soyez le plus logique possible pour que votre application puisse  communiquer avec une base de données relationnelle plus tard.


Vous pouvez commencer par schématiser ce que vous allez implémenter.


Point d’entrée de l’application

Comme toutes les applications qui se respectent, votre application devra avoir un point d’entrée pour afficher vos données de test.


À la fin de cette étape, vous afficherez les données d’un RIB sachant qu'un RIB contient un compte bancaire et qu’un compte bancaire contient un client et qu’une banque contient un compte et un client.






La sortie de votre résultat affichera ces informations du RIB Complet:




Nom de la banque + Numéro identifiant de la banque(bankIdentifier) + Adresse de la banque 
Nom + Prenom du client
IBAN précédé par un String “IBAN” + identifiant international de la banque(exemple FR76 pour la France) + Numéro identifiant de la banque(bankIdentifier) + numéro de l’agence(officeCode)

La sortie de vos résultats sur cette étape affichera un RIB Complet comme ci-dessous:







