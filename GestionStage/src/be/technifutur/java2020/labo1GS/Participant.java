package be.technifutur.java2020.labo1GS;

public class Participant {
    private String nom;
    private String prenom;
    private String club;
    private String email;


    public Participant(String nom,String prenom,String email,String club){
        this.nom = nom;
        this.prenom = prenom;
        this.club = email;
        this.email = club;
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getClub() {
        return club;
    }

    public String getEmail() {
        return email;
    }

    public String getNomPrenom(){
        String nomPrenom = this.nom + this.prenom;
        return nomPrenom;
    }




}
