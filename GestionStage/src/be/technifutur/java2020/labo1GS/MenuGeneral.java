package be.technifutur.java2020.labo1GS;

import java.util.Iterator;
import java.util.Scanner;

public class MenuGeneral {
    private MenuModif menuModif;
    private StageCtrlEncode ctrlEncode;
    private StageCtrlModifNom ctrlModifNom;

    public void setCtrlEncode(StageCtrlEncode ctrlEncode) {
        this.ctrlEncode = ctrlEncode;
    }

    public void setCtrlModif(StageCtrlModifNom ctrlModifNom) {
        this.ctrlModifNom = ctrlModifNom;
    }

    public void setMenuModif(MenuModif menuModif) {
        this.menuModif = menuModif;
    }

    public void start(){
        int choix = 0;
    Scanner sc = new Scanner(System.in);

        while(choix != 4){
        System.out.println("           Menu ");
        System.out.println("1)  Créer stage");
        System.out.println("2)  Modifier stage");
        System.out.println("3)  Supprimer stage");
        System.out.println("4)  Quitter");

        choix = sc.nextInt();
        switch(choix) {
            case 1:
                this.ctrlEncode.encodeStage();
                break;
            case 2:
                menuModif.start();
                break;
            case 3:
                System.out.println("Supprimer stage");
                break;
            case 4:
                System.out.println("Au revoir");
                break;
            default:
                System.out.println("Choix erroné");
        }
    }
}
}
