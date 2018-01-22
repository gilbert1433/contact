import java.util.Scanner;

/**
 * Created by GilRa1731814 on 2018-01-22.
 */
public class main {
    public static void main(String[] args) {

        int choix=0;
        tab


        Scanner sc=new Scanner(System.in);



        System.out.println("Bienvenue à votre liste de contact.\n Que voulez-vous faire?");
        System.out.println("1. Ajouter un contact.");
        System.out.println("2. Modifier un contact.");
        System.out.println("3. Afficher les contacts.");
        System.out.println("Quitter le programme.");
        choix=sc.nextInt();

        if(choix==1){
            for (int i=0;i)
                System.out.println("Ce contact sera entré à la position"+i+".\n" + "Veuillez entrer les informations suivantes :");
            System.out.println("");

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
