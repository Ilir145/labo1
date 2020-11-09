package be.technifutur.java2020.labo1GS;

public class StageCtrlAjouteParticipants {
    private Stages stages;
    private StageVue vueStage;
    private ParticipantCtrl ctrlPart;
    private ParticipantVue vuePart;


    public void setVueStage(StageVue vueStage) {
        this.vueStage = vueStage;
    }

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public void setCtrlPart(ParticipantCtrl ctrlPart) {
        this.ctrlPart = ctrlPart;
    }

    public void setVuePart(ParticipantVue vuePart) {
        this.vuePart = vuePart;
    }

    public void  ajouteParticipant(User user){
        String nomStage = this.vueStage.saisirNom(user);
        this.ctrlPart.encodeParticipant(user);
        stages.getStages().get(nomStage).ajouteParticipant(this.ctrlPart.getParticipant());
    }
}
