package be.technifutur.java2020.labo1GS.Stage;

import be.technifutur.java2020.labo1GS.User.User;

public class StageVue {
    Stages collStages;

    public void setCollStages(Stages collStages) {
        this.collStages = collStages;
    }

    public void afficheStage(Stage stage){
        System.out.println("Nom:" + this.collStages.getStages().get(stage.getNom()).getNom());
        System.out.println("Date de debut :" + this.collStages.getStages().get(stage.getNom()).getDebut());
        System.out.println("Date de fin :" + this.collStages.getStages().get(stage.getNom()).getFin());
        System.out.println("Nbre d'activite :" + this.collStages.getStages().get(stage.getNom()).getActivites().size());
    }

    public  void afficheStages(){
        for (Stage st:
             this.collStages.getStages().values()) {
            afficheStage(st);
            System.out.println();
        }
    }

    public  String saisirNom(User user){
        String saisie;
        System.out.println("Entrez le nom du stage:");
        saisie = user.getString();
        return saisie;
    }

    public String saisirDateTempsD(User user){
        String saisie;
        System.out.println("Entrez la date de début (exemple : 2017-12-05T11:30:30) :");
        saisie = user.getString();
        return saisie;

    }

    public String saisirDateTempsF(User user){
        String saisie;
        System.out.println("Entrez la date de fin (exemple : 2017-12-05T11:30:30) :");
        saisie = user.getString();
        return saisie;

    }


}
