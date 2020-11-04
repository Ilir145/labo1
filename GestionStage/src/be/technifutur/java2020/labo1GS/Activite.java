package be.technifutur.java2020.labo1GS;

import java.time.LocalDateTime;

public class Activite {
    private String nom;
    private LocalDateTime debut;
    private LocalDateTime fin;

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
