package be.technifutur.java2020.labo1GS;


import java.time.LocalDateTime;
import java.util.HashMap;

public class Stage {
    private String nom;
    private LocalDateTime debut;
    private LocalDateTime fin;
    private HashMap<String,Activite> activites;

    public Stage(String nom,LocalDateTime debut,LocalDateTime fin){
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.activites = new HashMap<>();
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

    // A rendre nn modifiable
    public HashMap<String, Activite> getActivites() {
        return activites;
    }

    public boolean ajouteActivite(Activite activite){
        boolean verif = true;
        if(!activites.containsKey(activite.getNom())) {
            if(activite.getDebut().isAfter(this.getDebut()) && activite.getFin().isBefore(this.getFin())){
                this.activites.putIfAbsent(activite.getNom(), activite);
                verif = true;
            }
            else {
                System.out.println("La période n'est pas comprise dans la durée du stage");
            }

        }
        return verif;
    }


}
