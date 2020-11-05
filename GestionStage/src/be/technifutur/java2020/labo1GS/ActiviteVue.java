package be.technifutur.java2020.labo1GS;

import java.util.Scanner;

public class ActiviteVue {
    Activite activite;

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public void afficheActivite(){
        System.out.println("Nom:" + this.activite.getNom());
        System.out.println("Date de debut :" + this.activite.getDebut());
        System.out.println("Date de fin :" + this.activite.getFin());
    }


    public  String saisirNom(){
        String saisie;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom du stage:");
        saisie = sc.next();
        return saisie;
    }

    public String saisirDateTempsD(){
        String saisie;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la date de début (exemple : 2017-12-05T11:30:30) :");
        saisie = sc.next();
        return saisie;

    }

    public String saisirDateTempsF(){
        String saisie;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la date de fin (exemple : 2017-12-05T11:30:30) :");
        saisie = sc.next();
        return saisie;

    }
}
