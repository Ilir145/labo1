package be.technifutur.java2020.labo1GS;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuModif {
    private StageCtrlModifNom ctrlModifNom;
    private StageCtrlAjouteActivite ctrlAjouteActivite;
    private StgCtrlAffCollAct ctrlAffCollAct;

    public void setCtrlAffCollAct(StgCtrlAffCollAct ctrlAffCollAct) {
        this.ctrlAffCollAct = ctrlAffCollAct;
    }

    public void setCtrlAjouteActivite(StageCtrlAjouteActivite ctrlAjouteActivite) {
        this.ctrlAjouteActivite = ctrlAjouteActivite;
    }

    public void setCtrlModifNom(StageCtrlModifNom ctrlModifNom) {
        this.ctrlModifNom = ctrlModifNom;
    }

    public void start() {
        int choix = 0;
        String nom;
        Scanner sc = new Scanner(System.in);

        while (choix != 6) {
            System.out.println("        Menu modif ");
            System.out.println("1)  Modif nom");
            System.out.println("2)  Modif date de debut");
            System.out.println("3)  Modif date de fin");
            System.out.println("4)  Ajouter une activité");
            System.out.println("5)  Afficher les activites d un stage");
            System.out.println("6)  Revenir au menu principal");

            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Entrez le nom du stage :");
                    nom = sc.next();
                    System.out.println("Entrez le nouveau nom :");
                    String newNom = sc.next();
                    ctrlModifNom.modifNom();
                    break;
                case 2:
                    /*System.out.println("Entrez le nom du stage :");
                    nom = sc.next();

                    ctrl.modifDateDebut();
                    break;*/
                case 3:
                   /* ctrl.modifDateFin();*/
                    break;
                case 4:
                    ctrlAjouteActivite.ajouteActivite();
                    break;
                case 5:
                    ctrlAffCollAct.afficheACtivites();
                    break;
                case 6:
                    System.out.println("<-");
                    break;
                default:
                    System.out.println("Choix erroné");
            }
        }
    }
}
