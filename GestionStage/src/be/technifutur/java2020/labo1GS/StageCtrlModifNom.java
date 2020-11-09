package be.technifutur.java2020.labo1GS;

import java.time.LocalDateTime;

public class StageCtrlModifNom {
    private Stages stages;
    private StageVue vue;


    public void setVue(StageVue vue) {
        this.vue = vue;
    }

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public void modifNom(User user){
        System.out.println("Nom du stage");
        String nom = this.vue.saisirNom(user);
        System.out.println("Nouveau nom");
        String newNom = this.vue.saisirNom(user);
    }
}
