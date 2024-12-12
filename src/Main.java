import javax.xml.transform.Source;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //VARIABLE
        String Joueur1;
        String Joueur2;
        String [][] Plateau=new String[3][3];
        int colonne;
        int ligne;
        boolean jouer;
        String rejouer;
        int tour;
        int nombreVictoireJ1;
        int nombreVictoireJ2;
        int nombreEgalite;
        boolean erreurJ1;
        boolean erreurJ2;

        //CODE

        tour=0;
        nombreVictoireJ1=0;
        nombreVictoireJ2=0;
        nombreEgalite=0;

        do {


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Plateau[i][j] = "-";
                }
            }


            System.out.println("Bienvenu dans ce jeu du Morpion,");
            System.out.println("Joueur 1, veuillez entrer votre Pseudo");
            Joueur1 = sc.nextLine();
            System.out.println("Joueur 2, veuillez entrer votre Pseudo");
            Joueur2 = sc.nextLine();


            System.out.println(Plateau[0][0] + " " + Plateau[0][1] + " " + Plateau[0][2]);
            System.out.println(Plateau[1][0] + " " + Plateau[1][1] + " " + Plateau[1][2]);
            System.out.println(Plateau[2][0] + " " + Plateau[2][1] + " " + Plateau[2][2]);

            System.out.println(Joueur1+" , parties gagné : "+nombreVictoireJ1);
            System.out.println(Joueur2+" , parties gagné : "+nombreVictoireJ2);
            System.out.println("Nombre d'égalité : "+nombreEgalite);

            jouer = true;
            while (jouer == true) {
                erreurJ2 = true;
                erreurJ1 = true;


                //JOUEUR 1
                if (tour%2==0) {
                    System.out.println("C'est à " + Joueur1);
                }else {
                    System.out.println("C'est à " + Joueur2);
                }
                do {
                    System.out.println("Où voulez vous placer votre X ? Entrez le numéro de la ligne puis de la colonne");
                    System.out.println("Position de la ligne : ");
                    ligne = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Position de la colonne : ");
                    colonne = sc.nextInt();
                    sc.nextLine();
                    if ((Plateau[ligne-1][colonne-1].equals("X") || Plateau[ligne-1][colonne-1].equals("O"))){
                        System.out.println("Erreur, position déja remplis !");
                    }else {
                        Plateau[ligne - 1][colonne - 1] = "X";
                        erreurJ1 = false;
                    }
                }while (erreurJ1==true);

                System.out.println(Plateau[0][0] + " " + Plateau[0][1] + " " + Plateau[0][2]);
                System.out.println(Plateau[1][0] + " " + Plateau[1][1] + " " + Plateau[1][2]);
                System.out.println(Plateau[2][0] + " " + Plateau[2][1] + " " + Plateau[2][2]);

                if ((Plateau[0][0].equals("X") && Plateau[0][1].equals("X") && Plateau[0][2].equals("X")) ||
                        (Plateau[1][0].equals("X") && Plateau[1][1].equals("X") && Plateau[1][2].equals("X")) ||
                        (Plateau[2][0].equals("X") && Plateau[2][1].equals("X") && Plateau[2][2].equals("X")) ||
                        (Plateau[0][0].equals("X") && Plateau[1][0].equals("X") && Plateau[2][0].equals("X")) ||
                        (Plateau[0][1].equals("X") && Plateau[1][1].equals("X") && Plateau[2][1].equals("X")) ||
                        (Plateau[0][2].equals("X") && Plateau[1][2].equals("X") && Plateau[2][2].equals("X")) ||
                        (Plateau[2][0].equals("X") && Plateau[1][1].equals("X") && Plateau[0][2].equals("X")) ||
                        (Plateau[0][0].equals("X") && Plateau[1][1].equals("X") && Plateau[2][2].equals("X"))) {
                    if (tour%2==0) {
                        System.out.println("Félicitation, " + Joueur1+" a gagné");
                        nombreVictoireJ1+=1;
                    }else {
                        System.out.println("Félicitation, " + Joueur2+" a gagné");
                        nombreVictoireJ2+=1;
                    }
                    jouer = false;
                    break;
                }

                //JOUEUR2
                if (tour%2==0) {
                    System.out.println("C'est à " + Joueur2);
                }else {
                    System.out.println("C'est à " + Joueur1);
                }
                do {
                    System.out.println("Où voulez vous placer votre O ? Entrez le numéro de la ligne puis de la colonne");
                    System.out.println("Position de la ligne : ");
                    ligne = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Position de la colonne : ");
                    colonne = sc.nextInt();
                    sc.nextLine();
                    if ((Plateau[ligne-1][colonne-1].equals("X") || Plateau[ligne-1][colonne-1].equals("O"))){
                        System.out.println("Erreur, position déja remplis !");
                    }else {
                        Plateau[ligne - 1][colonne - 1] = "O";
                        erreurJ2 = false;
                    }
                }while (erreurJ2==true);
                System.out.println(Plateau[0][0] + " " + Plateau[0][1] + " " + Plateau[0][2]);
                System.out.println(Plateau[1][0] + " " + Plateau[1][1] + " " + Plateau[1][2]);
                System.out.println(Plateau[2][0] + " " + Plateau[2][1] + " " + Plateau[2][2]);

                if ((Plateau[0][0].equals("O") && Plateau[0][1].equals("O") && Plateau[0][2].equals("O")) ||
                        (Plateau[1][0].equals("O") && Plateau[1][1].equals("O") && Plateau[1][2].equals("O")) ||
                        (Plateau[2][0].equals("O") && Plateau[2][1].equals("O") && Plateau[2][2].equals("O")) ||
                        (Plateau[0][0].equals("O") && Plateau[1][0].equals("O") && Plateau[2][0].equals("O")) ||
                        (Plateau[0][1].equals("O") && Plateau[1][1].equals("O") && Plateau[2][1].equals("O")) ||
                        (Plateau[0][2].equals("O") && Plateau[1][2].equals("O") && Plateau[2][2].equals("O")) ||
                        (Plateau[2][0].equals("O") && Plateau[1][1].equals("O") && Plateau[0][2].equals("O")) ||
                        (Plateau[0][0].equals("O") && Plateau[1][1].equals("O") && Plateau[2][2].equals("O"))) {
                    if (tour%2==0) {
                        System.out.println("Félicitation, " + Joueur2+" a gagné");
                        nombreVictoireJ2+=1;
                    }else {
                        System.out.println("Félicitation, " + Joueur1+" a gagné");
                        nombreVictoireJ1+=1;
                    }
                    jouer = false;
                    break;
                }

                if ((Plateau[0][0].equals("X")||Plateau[0][0].equals("O")) &&
                        (Plateau[0][1].equals("X")||Plateau[0][1].equals("O")) &&
                        (Plateau[0][2].equals("X")||Plateau[0][2].equals("O")) &&
                        (Plateau[1][0].equals("X")||Plateau[1][0].equals("O")) &&
                        (Plateau[1][1].equals("X")||Plateau[1][1].equals("O")) &&
                        (Plateau[1][2].equals("X")||Plateau[1][2].equals("O")) &&
                        (Plateau[2][0].equals("X")||Plateau[2][0].equals("O")) &&
                        (Plateau[2][1].equals("X")||Plateau[2][1].equals("O")) &&
                        (Plateau[2][2].equals("X")||Plateau[2][2].equals("O"))){
                    System.out.println("Match Nul !");
                    jouer =false;
                }
            }
            System.out.println("Voulez-vous rejouer ? (O/N)");
            rejouer = sc.nextLine().toUpperCase();
            tour=tour+1;
        }while(rejouer.equals("O"));
    }
}