package be.technifutur.java2020.labo1GS.Activite;

import be.technifutur.java2020.labo1GS.Participant.Participant;
import be.technifutur.java2020.labo1GS.Participant.Participants;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Activite {
    private String nom;
    private LocalDateTime debut;
    private int duree;
    private HashMap<String,Participant> participants;


    public Activite(){
        super();
    }

    public Activite(String nom,LocalDateTime debut,int duree){
        this.nom = nom;
        this.debut = debut;
        this.duree = duree;
        this.participants = new HashMap<>();
    }

    public boolean ajouteParticipants(Participant participant){
        boolean verif = true;
        if(!participants.containsKey(participant.getNomPrenom())) {
            this.participants.putIfAbsent(participant.getNomPrenom(), participant);
            verif = true;
        }
        return verif;
    }

    public String getNom() {
        return nom;
    }

    public LocalDateTime getDebut() {
        return debut;
    }

    public int getDuree() {
        return duree;
    }


}
