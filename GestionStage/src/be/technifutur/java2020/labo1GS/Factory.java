package be.technifutur.java2020.labo1GS;

import java.util.Scanner;

public class Factory {
    private StageCtrl ctrl;
    private StageVue vue;
    private Stages stages;

    public void start(){
        this.vue = new StageVue();
        this.ctrl = new StageCtrl();
        this.stages = new Stages();
        Scanner sc = new Scanner(System.in);

        int choix = 0;

        while(choix != 4){
            System.out.println("           Menu ");
            System.out.println("1)  Créer un Stage");
            System.out.println("2)  Créer une Activite");
            System.out.println("3)  Ajouter une Acticvite a un stage");
            System.out.println("4)  Quitter");

             choix = sc.nextInt();
            switch(choix) {
                case 1:
                    vue.setCollStages(stages);
                    ctrl.setStages(stages);
                    ctrl.setVue(vue);
                    ctrl.encodeStage();
                    vue.afficheStages();

                    break;
                case 2:
                    System.out.println("Créer une activité");
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

    public StageCtrl getStageCtrl(){
        return this.ctrl;
    }
}
