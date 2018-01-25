import java.util.Scanner;

/**
 * Created by GilRa1731814 on 2018-01-22.
 */
public class main {
    public static void main(String[] args) {

        int choix=0;
        contact tabcontact[]=new contact[20];
        int nbcontact=0;



        Scanner sc=new Scanner(System.in);



        System.out.println("Bienvenue à votre liste de contact.\n Que voulez-vous faire?");
        System.out.println("1. Ajouter un contact.");
        System.out.println("2. Modifier un contact.");
        System.out.println("3. Afficher les contacts.");
        System.out.println("4. Quitter le programme.");
        choix=sc.nextInt();

        if(choix==1) {

            nbcontact++;
            tabcontact[nbcontact-1]=new contact();
            System.out.println("Ce contact sera entré à la position" + nbcontact + ".\n" + "Veuillez entrer les informations suivantes :");
            System.out.print("Prénom:");
            tabcontact[nbcontact-1].setPrénom(sc.next());
            System.out.print("Nom;");
            tabcontact[nbcontact-1].setNom(sc.next());
            //adresse
            System.out.print("Adresse: \n   Numéro de porte:");
            tabcontact[nbcontact-1].setAdresse1(new adresse());
            tabcontact[nbcontact-1].getAdresse1().setNumadresse(sc.nextInt());
            System.out.print("   Rue:");
            tabcontact[nbcontact-1].getAdresse1().setNomderue(sc.next());
            System.out.print("   Appartement:");
            tabcontact[nbcontact-1].getAdresse1().setAppartement(sc.nextInt());
            System.out.print("   Ville:");
            tabcontact[nbcontact-1].getAdresse1().setVille(sc.next());
            System.out.print("   Province:");
            tabcontact[nbcontact-1].getAdresse1().setProvince(sc.next());
            System.out.print("   Pays:");
            tabcontact[nbcontact-1].getAdresse1().setpays(sc.next());
            //Occupation
            System.out.println("Occupation: ");
            tabcontact[nbcontact-1].setOccupation1(new occupation());
            System.out.print("   Poste:");
            tabcontact[nbcontact-1].getOccupation1().setPoste(sc.next());
            //entreprise
            System.out.println("   Entreprise:");
            tabcontact[nbcontact-1].getOccupation1().setEntreprise1(new entreprise());
            System.out.print("   Nom:");
            tabcontact[nbcontact-1].getOccupation1().getEntreprise1().setNom(sc.next());
            System.out.println("   Adresse:");
            //adresse de l'entreprise
            tabcontact[nbcontact-1].getOccupation1().getEntreprise1().setAdresse1(new adresse());
            System.out.print("      Numéro de porte:");
            tabcontact[nbcontact-1].getOccupation1().getEntreprise1().getAdresse1().setNumadresse(sc.nextInt());
            System.out.print("      Rue:");
            tabcontact[nbcontact-1].getOccupation1().getEntreprise1().getAdresse1().setNomderue(sc.next());
            System.out.print("      Ville:");
            tabcontact[nbcontact-1].getOccupation1().getEntreprise1().getAdresse1().setVille(sc.next());
            System.out.print("      Province:");
            tabcontact[nbcontact-1].getOccupation1().getEntreprise1().getAdresse1().setProvince(sc.next());
            System.out.print("      Pays");
            tabcontact[nbcontact-1].getOccupation1().getEntreprise1().getAdresse1().setpays(sc.next());

            System.out.println("Entrer un numéro de téléphone (1-oui 2-non)");
            choix=sc.nextInt();
            System.out.println("À quoi correcpond ce numéro?(information):");
            tabcontact[nbcontact-1].getOccupation1();




        }
        else if(choix==2){

        }
        else if (choix==3){

        }
        else if (choix==4){
            System.exit(0);
        }
        else
            System.out.println("Error.");


    }
}
