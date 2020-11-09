package be.technifutur.java2020.labo1GS.Stage;

import be.technifutur.java2020.labo1GS.Participant.ParticipantCtrl;
import be.technifutur.java2020.labo1GS.Participant.ParticipantVue;
import be.technifutur.java2020.labo1GS.Participant.Participants;
import be.technifutur.java2020.labo1GS.User.User;

public class StageCtrlAjouteParticipants {
    private Stages stages;
    private StageVue vueStage;
    private Participants participants;
    private ParticipantCtrl ctrlPart;
    private ParticipantVue vuePart;

    public void setParticipants(Participants participants) {
        this.participants = participants;
    }

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
        this.stages.getStages().get(nomStage).ajouteParticipant(this.ctrlPart.getParticipant());
        this.participants.ajoutePart(this.ctrlPart.getParticipant());
    }
}
