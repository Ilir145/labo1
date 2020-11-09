package be.technifutur.java2020.labo1GS.Menu;

import be.technifutur.java2020.labo1GS.Stage.StageCtrlAjouteActivite;
import be.technifutur.java2020.labo1GS.Stage.StageCtrlAjouteParticipants;
import be.technifutur.java2020.labo1GS.Stage.StageCtrlModifNom;
import be.technifutur.java2020.labo1GS.Stage.StgCtrlAffCollAct;
import be.technifutur.java2020.labo1GS.User.User;

public class MenuModif {
    private StageCtrlModifNom ctrlModifNom;
    private StageCtrlAjouteActivite ctrlAjouteActivite;
    private StgCtrlAffCollAct ctrlAffCollAct;
    private StageCtrlAjouteParticipants ctrlAjouteParticipants;

    public void setCtrlAjouteParticipants(StageCtrlAjouteParticipants ctrlAjouteParticipants) {
        this.ctrlAjouteParticipants = ctrlAjouteParticipants;
    }

    public void setCtrlAffCollAct(StgCtrlAffCollAct ctrlAffCollAct) {
        this.ctrlAffCollAct = ctrlAffCollAct;
    }

    public void setCtrlAjouteActivite(StageCtrlAjouteActivite ctrlAjouteActivite) {
        this.ctrlAjouteActivite = ctrlAjouteActivite;
    }

    public void setCtrlModifNom(StageCtrlModifNom ctrlModifNom) {
        this.ctrlModifNom = ctrlModifNom;
    }

    public void start(User user) {
        int choix = 0;

        while (choix != 7) {
            System.out.println("        Menu modif ");
            System.out.println("1)  Modif nom");
            System.out.println("2)  Modif date de debut");
            System.out.println("3)  Modif date de fin");
            System.out.println("4)  Ajouter une activité");
            System.out.println("5)  Ajouter un participant");
            System.out.println("6)  Afficher les activites d un stage");
            System.out.println("7)  Revenir au menu principal");

            choix = Integer.parseInt(user.getString());
            switch (choix) {
                case 1:
                    ctrlModifNom.modifNom(user);
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
                    this.ctrlAjouteActivite.ajouteActivite(user);
                    break;
                case 5:
                    this.ctrlAffCollAct.afficheACtivites(user);
                    break;
                case 6:
                    this.ctrlAjouteParticipants.ajouteParticipant(user);
                    break;
                case 7:
                    System.out.println("<-");
                    break;
                default:
                    System.out.println("Choix erroné");
            }
        }
    }
}
