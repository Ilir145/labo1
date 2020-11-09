package be.technifutur.java2020.labo1GS;

import java.util.Iterator;
import java.util.Scanner;

public class MenuGeneral {
    private MenuModif menuModif;
    private StageCtrlEncode ctrlEncode;
    private StageCtrlModifNom ctrlModifNom;
    private StgCtrlAffStg ctrlAffStg;
    private StgCtrlAffHoraire ctrlAffHoraire;


    public void setCtrlAffHoraire(StgCtrlAffHoraire ctrlAffHoraire) {
        this.ctrlAffHoraire = ctrlAffHoraire;
    }

    public void setCtrlAffStg(StgCtrlAffStg ctrlAffStg) {
        this.ctrlAffStg = ctrlAffStg;
    }

    public void setCtrlEncode(StageCtrlEncode ctrlEncode) {
        this.ctrlEncode = ctrlEncode;
    }

    public void setCtrlModif(StageCtrlModifNom ctrlModifNom) {
        this.ctrlModifNom = ctrlModifNom;
    }

    public void setMenuModif(MenuModif menuModif) {
        this.menuModif = menuModif;
    }

    public void start(User user){
        int choix = 0;


        while(choix != 7){
        System.out.println("           Menu ");
        System.out.println("1)  Créer stage");
        System.out.println("2)  Modifier stage");
        System.out.println("3)  Supprimer stage");
        System.out.println("4)  Afficher les stages");
        System.out.println("5)  Afficher un stage");
        System.out.println("6)  Afficher horaire");
        System.out.println("7)  Quitter");

        choix = Integer.parseInt(user.getString());
        switch(choix) {
            case 1:
                this.ctrlEncode.encodeStage(user);
                break;
            case 2:
                this.menuModif.start(user);
                break;
            case 3:
                System.out.println("Supprimer stage");
                break;
            case 4:
                this.ctrlAffStg.affStages();
                break;
            case 5:
                this.ctrlAffStg.affStg(user);
                break;
            case 6:
                this.ctrlAffHoraire.affHoraire(user);
                break;
            case 7:
                System.out.println("Au revoir");
                break;
            default:
                System.out.println("Choix erroné");
        }
    }
}
}
