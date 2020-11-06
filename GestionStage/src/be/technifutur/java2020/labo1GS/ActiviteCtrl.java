package be.technifutur.java2020.labo1GS;


import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActiviteCtrl {
    Activite activite;
    ActiviteVue vue;

    public void setVue(ActiviteVue vue) {
        this.vue = vue;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public Activite getActivite() {
        return activite;
    }

    public void encodeActivite(){
        Pattern patternDateTemps = Pattern.compile("([0-9][0-9][0-9][0-9])-([0-9][0-9])-([0-9][0-9])(T)([0-9][0-9]):([0-9][0-9]):([0-9][0-9])");
        String nom = vue.saisirNom();
        String debutS = vue.saisirDateTempsD();
        int duree = vue.saisirDuree();

        Matcher matcherD = patternDateTemps.matcher(debutS);
        if(matcherD.matches()){
            LocalDateTime debut = LocalDateTime.parse(debutS);
            this.activite = new Activite(nom,debut,duree);
        }
        else {
            System.out.println("Mauvais format d'encodage");
        }


    }


}
