package be.technifutur.java2020.labo1GS;

import java.util.Iterator;
import java.util.Scanner;

public class MenuGeneral {
    private MenuModif menuModif;
    private StageCtrlEncode ctrlEncode;
    private StageCtrlModifNom ctrlModifNom;
    private StgCtrlAffStg ctrlAffStg;
    private StgCtrlAffHoraire ctrlAffHoraire;
    private StgCtrlAffPart ctrlAffPart;
    private PartCtrlAffPart partCtrlAffPart;

    public void setPartCtrlAffPart(PartCtrlAffPart partCtrlAffPart) {
        this.partCtrlAffPart = partCtrlAffPart;
    }

    public void setCtrlAffPart(StgCtrlAffPart ctrlAffPart) {
        this.ctrlAffPart = ctrlAffPart;
    }

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


        while(choix != 9){
        System.out.println("           Menu ");
        System.out.println("1)  Créer stage");
        System.out.println("2)  Modifier stage");
        System.out.println("3)  Supprimer stage");
        System.out.println("4)  Afficher les stages");
        System.out.println("5)  Afficher un stage");
        System.out.println("6)  Affichant participants d'un stage");
        System.out.println("7)  Afficher tous les participants");
        System.out.println("8)  Afficher horaire");
        System.out.println("9)  Quitter");

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
                this.ctrlAffPart.affParticipants(user);
                break;
            case 7:
                this.partCtrlAffPart.affPart();
                break;
            case 8:
                this.ctrlAffHoraire.affHoraire(user);
                break;
            case 9:
                System.out.println("Au revoir");
                break;
            default:
                System.out.println("Choix erroné");
        }
    }
}
}
