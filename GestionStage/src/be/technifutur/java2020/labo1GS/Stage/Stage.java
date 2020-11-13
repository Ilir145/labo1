package be.technifutur.java2020.labo1GS.Stage;


import be.technifutur.java2020.labo1GS.Activite.Activite;
import be.technifutur.java2020.labo1GS.Activite.ActiviteVue;
import be.technifutur.java2020.labo1GS.Participant.Participant;
import be.technifutur.java2020.labo1GS.User.User;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Stage {
    private String nom;
    private LocalDateTime debut;
    private LocalDateTime fin;
    private ActiviteVue vueAct;
    private HashMap<String, Activite> activites;
    private HashMap<String, Participant> participants;

    public Stage(String nom,LocalDateTime debut,LocalDateTime fin){
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.activites = new HashMap<>();
        this.participants = new HashMap<>();
        this.vueAct = new ActiviteVue();
    }

    public HashMap<String, Participant> getParticipants() {
        return participants;
    }

    public String getNom() {
        return nom;
    }

    public LocalDateTime getDebut() {
        return debut;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setVueAct(ActiviteVue vueAct) {
        this.vueAct = vueAct;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDebut(LocalDateTime debut) {
        this.debut = debut;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }


    // A rendre nn modifiable
    public HashMap<String, Activite> getActivites() {
        return activites;
    }

    public boolean ajouteActivite(Activite activite){
        boolean verif = true;
        if(!activites.containsKey(activite.getNom())) {
            if(!activite.getDebut().isBefore(this.getDebut()) && !activite.getDebut().plusMinutes(activite.getDuree()).isAfter(this.getFin())){
                this.activites.putIfAbsent(activite.getNom(), activite);
                verif = true;
            }
            else {
                System.out.println("La période n'est pas comprise dans la durée du stage");
            }

        }
        return verif;
    }

    public boolean ajouteParticipant(Participant participant, User user){
        boolean verif = true;
        if(!participants.containsKey(participant.getNomPrenom())) {
            this.participants.putIfAbsent(participant.getNomPrenom(), participant);
            verif = true;
            System.out.println("Choisissez les activités dans lesquels il sera inscrit :");
            for (Activite act : this.activites.values()
            ) {
                this.vueAct.setActivite(act);
                this.vueAct.afficheActivite();
                System.out.println("Voulez vous l inscrire a cette activité ? (o/n)");
                String choix = user.getString();
                if (choix == "o") {
                    act.ajouteParticipants(participant);
                }
            }
        }
        return verif;
    }



}
