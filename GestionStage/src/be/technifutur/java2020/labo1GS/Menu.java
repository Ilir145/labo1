package be.technifutur.java2020.labo1GS;

import java.util.Iterator;
import java.util.Scanner;

public class Menu {

    public void start(StageCtrl ctrl){
        int choix = 0;
    Scanner sc = new Scanner(System.in);

        while(choix != 4){
        System.out.println("           Menu ");
        System.out.println("1)  Créer un Stage");
        System.out.println("2)  Créer une Activite");
        System.out.println("3)  Ajouter une Acticvite a un stage");
        System.out.println("4)  Quitter");

        choix = sc.nextInt();
        switch(choix) {
            case 1:
                ctrl.encodeStage();
                break;
            case 2:
                /*
                System.out.println("A quel stage voulez vous ajouter cette activité?");
                Iterator<Stage> iterator = stages.getStages().values().iterator();
                while (iterator.hasNext()){
                    Stage s = iterator.next();
                    System.out.println("Au stage " + s.getNom() + " (O / N)");
                }*/

                break;
            case 3:
                System.out.println("Ajouter une activité a un stage");
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
