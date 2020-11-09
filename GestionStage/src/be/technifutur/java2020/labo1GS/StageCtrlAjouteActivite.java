package be.technifutur.java2020.labo1GS;

public class StageCtrlAjouteActivite {
    private Stages stages;
    private StageVue vueStage;
    private ActiviteCtrl ctrlActivite;
    private ActiviteVue vueAct;

    public void setVueAct(ActiviteVue vueAct) {
        this.vueAct = vueAct;
    }

    public void setVueStage(StageVue vueStage) {
        this.vueStage = vueStage;
    }

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public void setCtrlActivite(ActiviteCtrl ctrlActivite) {
        this.ctrlActivite = ctrlActivite;
    }

    public void  ajouteActivite(User user){
        String nomStage = this.vueStage.saisirNom(user);
        this.ctrlActivite.encodeActivite(user);
        stages.getStages().get(nomStage).ajouteActivite(this.ctrlActivite.getActivite());
    }
}
