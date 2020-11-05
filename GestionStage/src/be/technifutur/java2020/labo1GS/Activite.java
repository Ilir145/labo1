package be.technifutur.java2020.labo1GS;

import java.time.LocalDateTime;

public class Activite {
    private String nom;
    private LocalDateTime debut;
    private LocalDateTime fin;

    public Activite(){
        super();
    }

    public Activite(String nom,LocalDateTime debut,LocalDateTime fin){
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
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


}
