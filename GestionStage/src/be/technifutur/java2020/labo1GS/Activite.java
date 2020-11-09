package be.technifutur.java2020.labo1GS;

import java.time.LocalDateTime;

public class Activite {
    private String nom;
    private LocalDateTime debut;
    private int duree;

    public Activite(){
        super();
    }

    public Activite(String nom,LocalDateTime debut,int duree){
        this.nom = nom;
        this.debut = debut;
        this.duree = duree;
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
