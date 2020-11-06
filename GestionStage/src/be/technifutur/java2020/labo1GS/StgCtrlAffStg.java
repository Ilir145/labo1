package be.technifutur.java2020.labo1GS;

public class StgCtrlAffStg {
    private Stages stages;
    private StageVue vue;

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public void setVue(StageVue vue) {
        this.vue = vue;
    }

    public void affStg(){
        String nom = this.vue.saisirNom();
        this.vue.afficheStage(this.stages.getStages().get(nom));
    }

    public void affStages(){
        this.vue.afficheStages();
    }
}
