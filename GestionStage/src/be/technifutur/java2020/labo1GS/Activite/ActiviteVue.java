package be.technifutur.java2020.labo1GS.Activite;

import be.technifutur.java2020.labo1GS.User.User;

public class ActiviteVue {
    Activite activite;

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public void afficheActivite(){
        System.out.println("Nom:" + this.activite.getNom());
        System.out.println("Date de debut :" + this.activite.getDebut());
        System.out.println("Duree :" + this.activite.getDuree());
    }


    public  String saisirNom(User user){
        String saisie;
        System.out.println("Entrez le nom de l activité:");
        saisie = user.getString();
        return saisie;
    }

    public String saisirDateTempsD(User user){
        String saisie;
        System.out.println("Entrez la date de début (exemple : 2017-12-05T11:30:30) :");
        saisie = user.getString();
        return saisie;

    }


    public int saisirDuree(User user) {
        int saisie;
        System.out.println("Entrez la duree :");
        saisie = Integer.parseInt(user.getString());
        return saisie;
    }
}
