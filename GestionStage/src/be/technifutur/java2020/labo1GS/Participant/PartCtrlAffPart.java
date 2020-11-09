package be.technifutur.java2020.labo1GS.Participant;

public class PartCtrlAffPart {
    Participants participants;
    ParticipantVue vue;


    public void setVue(ParticipantVue vue) {
        this.vue = vue;
    }

    public void setParticipants(Participants participants) {
        this.participants = participants;
    }

    public void affPart(){
        for (Participant part:
             this.participants.getParticipants().values()) {
            this.vue.setParticipant(part);
            this.vue.afficheParticipant();
            System.out.println();
        }
    }
}
