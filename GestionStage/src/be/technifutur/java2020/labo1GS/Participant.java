package be.technifutur.java2020.labo1GS;

public class Participant {
    private String nom;
    private String prenom;
    private int id;

    public Participant(String nom,String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getId() {
        return id;
    }




}
