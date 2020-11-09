package be.technifutur.java2020.labo1GS;

import java.util.HashMap;

public class Participants {
    HashMap<String,Participant> participants;

    public Participants(){
        this.participants = new HashMap<>();
    }

    public HashMap<String, Participant> getParticipants() {
        return participants;
    }

    public void ajoutePart(Participant participant){
        participants.putIfAbsent(participant.getNomPrenom(),participant);
    }
}
