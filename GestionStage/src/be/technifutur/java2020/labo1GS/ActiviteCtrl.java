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

    public void encodeActivite(){
        Pattern patternDateTemps = Pattern.compile("([0-9][0-9][0-9][0-9])-([0-9][0-9])-([0-9][0-9])(T)([0-9][0-9]):([0-9][0-9]):([0-9][0-9])");

        String nom = vue.saisirNom();
        String debutS = vue.saisirDateTempsD();
        String finS = vue.saisirDateTempsF();

        Matcher matcherD = patternDateTemps.matcher(debutS);
        Matcher matcherF = patternDateTemps.matcher(finS);
        if(matcherD.matches() && matcherF.matches()){
            LocalDateTime debut = LocalDateTime.parse(debutS);
            LocalDateTime fin = LocalDateTime.parse(finS);
            this.activite = new Activite(nom,debut,fin);
        }
        else {
            System.out.println("Mauvais format d'encodage");
        }


    }

}
