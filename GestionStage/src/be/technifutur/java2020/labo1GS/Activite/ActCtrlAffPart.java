package be.technifutur.java2020.labo1GS.Activite;

import be.technifutur.java2020.labo1GS.Participant.Participant;
import be.technifutur.java2020.labo1GS.Participant.ParticipantVue;
import be.technifutur.java2020.labo1GS.Stage.Stages;
import be.technifutur.java2020.labo1GS.User.User;

public class ActCtrlAffPart {
    Stages stages;
    ParticipantVue vuePart;

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public void setVuePart(ParticipantVue vuePart) {
        this.vuePart = vuePart;
    }

    public void affPart(User user){
        String nomStg = user.getString();
        String nomAct = user.getString();
        for (Participant part:this.stages.getStages().get(nomStg).getActivites().get(nomAct).getParticipants().values()
             ) {
            this.vuePart.setParticipant(part);
            this.vuePart.afficheParticipant();
        }
    }
}
