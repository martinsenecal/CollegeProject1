
// Projet de Martin Senécal (1737787)



package pkgTP1;
import java.util.Scanner; //importation de la classe Scanner
public class TP1MartinSenécal {

    public static void main(String[] args) {
        
        
        Scanner entree= new Scanner (System.in);//Clavier servant à écrire des valeurs numériques
        Scanner entrees= new Scanner (System.in);//Clavier servant à écrire des caractères (string)
        
//Déclaration de variables/constantes
final double LIMITE_MAIGREUR_IMC=16.0,LIMITE_POIDS_NORMAL_IMC=19.0 ,LIMITE_EMBONPOINT_IMC=25.0,LIMITE_OBESITE_MODEREE_IMC=30.0, LIMITE_OBESITE_SEVERE_IMC=35.0, LIMITE_OBESITE_MASSIVE_IMC=40.0;//constantes d'IMC (classification) 
final double LIMITE_NORMALE_FEMMES_IMG=25.0 ,LIMITE_EXCES_FEMMES_IMG=30.0 ,LIMITE_NORMALE_HOMMES_IMG=15.0 ,LIMITE_EXCES_HOMMES_IMG=20.0 ;//constantes d'IMG (classification)
double imc,img; //variables de type sortie
double poids,tailles; //variables de type entrée
int age,choix; //variables de type entrée 
String prenom;//variables de type String entrée (prénom)
String genre;//variables de type String (ce que l'utilisateur écrira comme sexe)
String restart;//variables de type String (réponse de l'utilisateur quant à arrêter le programme ou non)
char rep;//variables de type Char (prend première lettre de ce que l'utilisateur veut faire à la fin)
char g;//variables de type Char (prend première lettre du genre)

do {//grande boucle While tant que l'utilisateur veut faire le programme
        System.out.println("************************************************"); // Message de bienvenue
        System.out.println("* Bienvenue dans le calculateur  « IMC,IMG »   *"+
                "\n* Veuillez entrer votre prénom                 *");
        System.out.println("************************************************");
               
    prenom=entrees.nextLine();//on récolte son prénom
   
    System.out.println("*********************************************");
    System.out.println("* Entrez votre poids positif en kilogramme: *");//Demander le poids de l'utilisateur tant que inférieur ou égal à 0
    System.out.println("*********************************************");
    poids=entree.nextDouble();
    while (poids<=0)  {//si inférieur ou égal à 0, on redemande le poids.
        System.out.println("Veuillez entrer un poids valide SVP");
    poids=entree.nextDouble();}
    
    System.out.println("*********************************************");
    System.out.println("*      Entrez votre taille en mètre:        *");//Demander la taille de l'utilisateur 
    System.out.println("*********************************************");
    tailles=entree.nextDouble();
    while(tailles<=0 || tailles>2.10 ){//si inférieur ou égal à 0 ou supérieur à 2.10, on redemande sa taille.
        System.out.println("Veuillez entrer une taille valide.");
        tailles=entree.nextDouble();}

do { //Choix de l'utilisateur à soit calculer son IMC ou son IMG (faire tant que choix n'est pas 1 ou 2
     System.out.println("**********************************************"); 
            System.out.println("*       Que voulez-vous calculer? :          *"+ 
                    "\n*     -----------------                      *" );
            System.out.println("* 1.IMC                                      *"+
                    "\n* 2.IMG                                      *");
            System.out.println("**********************************************");
            System.out.println("Entrez votre choix (1 ou 2):");
            choix=entree.nextInt();
     }
while (choix!=1 && choix!=2);

imc=poids/(tailles*tailles); //Calculer IMC avec les valeurs données par l'utilisateur (poids/tailles)
    
 //Calculateur de IMC 
 
if (choix==1)  { //On affiche les résultats de l'IMC si utilisateur choisit le choix #1
  System.out.println("*********************************************");
    System.out.println("*           Calculateur d'IMC               *");
    System.out.println("*********************************************");
   
    
    System.out.printf("Votre IMC est de= %.2f.",imc);//Afficher son IMC arrondis
    System.out.println("");//saut de ligne
   
  
 
if (imc < LIMITE_MAIGREUR_IMC) {//Afficher son indice de santé selon sa valeur
            System.out.println("Votre IMC est classifiée comme maigreur extrême (dénutrition). ");
            System.out.println("Votre risque de maladie est élevé!!");
}
        
else if (imc>=LIMITE_MAIGREUR_IMC && imc<LIMITE_POIDS_NORMAL_IMC) { //Afficher son indice de santé selon sa valeur
    System.out.println("Votre IMC est classifiée comme maigreur.");
    System.out.println("Votre risque de maladie est accru.");
 }

 
else if (imc>=LIMITE_POIDS_NORMAL_IMC && imc<LIMITE_EMBONPOINT_IMC) { //Afficher son indice de santé selon sa valeur
    System.out.println ("Votre IMC est classifiée comme un poids normal!"); 
    System.out.println("Votre risque de maladie est faible! "); 
 }

else if ((imc>=LIMITE_EMBONPOINT_IMC) && (imc<LIMITE_OBESITE_MODEREE_IMC)) { //Afficher son indice de santé selon sa valeur
    System.out.println("Votre IMC est classifiée comme embonpoint."); 
    System.out.println("Votre risque de maladie est accru! "); 
 }
 
else if (imc>=LIMITE_OBESITE_MODEREE_IMC && imc<LIMITE_OBESITE_SEVERE_IMC) { //Afficher son indice de santé selon sa valeur
    System.out.println("Votre IMC est classifiée comme obésité modérée."); 
    System.out.println("Votre risque de maladie est élevé! "); 
 }

else if (imc>=LIMITE_OBESITE_SEVERE_IMC && imc<LIMITE_OBESITE_MASSIVE_IMC) { //Afficher son indice de santé selon sa valeur
    System.out.println("Votre IMC est classifiée comme obésité sévère."); 
    System.out.println("Votre risque de maladie est très élevé! "); 
}
else if (imc>=LIMITE_OBESITE_MASSIVE_IMC) { //Afficher son indice de santé selon sa valeur
    System.out.println("Votre IMC est classifiée comme obésité massive!."); 
    System.out.println("Votre risque de maladie est extrêmement élevé!! "); 
 }
 }
 
//Calculateur IMG 
 
if (choix==2)  { //On affiche/calcule les résultats de l'IMG si utilisateur choisit le choix #2
 
       
 System.out.println("*********************************************");
 System.out.println("*            Entrez votre âge:              *");//Demander l'âge de l'utilisateur
 System.out.println("*********************************************");        
age=entree.nextInt();

    while (age<18 || age>65)  {//Si âge correspond pas aux critères, on redemande.
        System.out.println("Veuillez entrer un âge valide.");
        age=entree.nextInt();}
    
do { //Déterminer le genre de l'utilisateur si Homme ou Femme
     System.out.println("**********************************************"); 
            System.out.println("*      Veuillez entrer votre genre :         *"+ 
                    "\n*     -----------------                      *" );
            System.out.println("* F ou f pour femme                          *"+
                    "\n* H ou h pour homme                          *");
            System.out.println("**********************************************");
            System.out.println("Entrez votre choix :");
    genre=entrees.nextLine();
    g=genre.charAt(0);//prend premier caractère écrit de l'utilisateur
}
while(g!='h'&& g!='H' && g!='f' && g!='F'); //si ce n'est pas un homme ou une femme, on recommence la boucle.

    
switch (g) { //selon le premier caractère du genre, on attribue une valeur à g
case 'h': 
case 'H': 
g=1; break; //si homme donc g=1
 
case 'F': 
case 'f': 
g=0; break;//si femme donc g=0
}


img=(1.2*imc)+(0.23*age)-(10.8*g)-5.4; //calculer IMG avec valeurs rentrés(âge et sexe (0 ou 1) et déjà calculé (IMC))
 System.out.println("*********************************************");
    System.out.println("*           Calculateur d'IMG               *");
    System.out.println("*********************************************");
System.out.printf("Votre IMG est de= %.2f%%",img);//Afficher son IMG arrondis 
System.out.println("");//saut de ligne
 
if (g==0) { //Si c'est une femme on rentre dans cette série de IF 
 
  if (img<LIMITE_NORMALE_FEMMES_IMG) //Afficher son indice de masse grasse selon sa valeur entrée
        System.out.println("Vous avez un IMG classé: maigreur.");

  
  else if (img >=LIMITE_NORMALE_FEMMES_IMG && img< LIMITE_EXCES_FEMMES_IMG) //Afficher son indice de masse grasse selon sa valeur entrée
          
        System.out.println("Vous avez un IMG classé : normal."); 
          
  else if (img >=LIMITE_EXCES_FEMMES_IMG) //Afficher son indice de masse grasse selon sa valeur entrée
        System.out.println("Vous avez un IMG classé : excès de masse grasse."); 
 }
if(g==1) { //Si c'est une femme on rentre dans cette série de IF
   
if (img<LIMITE_NORMALE_HOMMES_IMG) //Afficher son indice de masse grasse selon sa valeur entrée
        System.out.println("Vous avez un IMG classé :maigreur."); 
else if (img >=LIMITE_NORMALE_HOMMES_IMG && img< LIMITE_EXCES_HOMMES_IMG)  //Afficher son indice de masse grasse selon sa valeur entrée
        System.out.println("Vous avez un IMG classé : normal. "); 
else if (img >=LIMITE_EXCES_HOMMES_IMG) //Afficher son indice de masse grasse selon sa valeur entrée
        System.out.println("Vous avez un IMG classé : excès de masse grasse."); 
} 
}
 //Demander à l'utilisateur s'il veut recommencer son programme.
  System.out.println("***********************************************");  
  System.out.println("*      Voulez-vous recommencer :              *"+ 
                    "\n*     -----------------                       *" );
  System.out.println("* O ou o pour Oui                             *"+
                    "\n* Autres caractères pour Non                  *");
      System.out.println("***********************************************");
      System.out.println("Entrez votre choix :");
 restart=entrees.nextLine();
 rep=restart.charAt(0);//Prendre premier caractère de la réponse de l'utilisateur
 
 } 

while (rep=='o' || rep=='O'); //On refais la grosse boucle du début tant que sa réponse est Oui! 

//Si l'utilisateur sort de la boucle, on lui affiche un message de Au Revoir! 
System.out.println("************************************************************");
System.out.println("*Merci! "+prenom+" d'avoir utilisé notre programme. Au Revoir! *");
System.out.println("************************************************************");
}
  
 }
    

