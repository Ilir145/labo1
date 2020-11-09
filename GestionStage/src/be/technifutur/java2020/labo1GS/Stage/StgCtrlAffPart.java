package be.technifutur.java2020.labo1GS.Stage;

import be.technifutur.java2020.labo1GS.Participant.Participant;
import be.technifutur.java2020.labo1GS.Participant.ParticipantVue;
import be.technifutur.java2020.labo1GS.User.User;

public class StgCtrlAffPart {
    Stages stages;
    StageVue vueStg;
    ParticipantVue vuePart;

    public void setVuePart(ParticipantVue vuePart) {
        this.vuePart = vuePart;
    }

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public void setVueStg(StageVue vueStg) {
        this.vueStg = vueStg;
    }

    public void affParticipants(User user){
        String nomStg = this.vueStg.saisirNom(user);
        for (Participant part:
                this.stages.getStages().get(nomStg).getParticipants().values()) {
            this.vuePart.setParticipant(part);
            vuePart.afficheParticipant();
            System.out.println();
        }

    }
}
