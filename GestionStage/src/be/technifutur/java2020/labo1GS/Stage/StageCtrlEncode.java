package be.technifutur.java2020.labo1GS.Stage;

import be.technifutur.java2020.labo1GS.User.User;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StageCtrlEncode {
    private Stages stages;
    private StageVue vue;


    public void setVue(StageVue vue) {
        this.vue = vue;
    }

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public void encodeStage(User user){
        Pattern patternDateTemps = Pattern.compile("([0-9][0-9][0-9][0-9])-([0-9][0-9])-([0-9][0-9])(T)([0-9][0-9]):([0-9][0-9]):([0-9][0-9])");

        String nom = vue.saisirNom(user);
        String debutS = vue.saisirDateTempsD(user);
        String finS = vue.saisirDateTempsF(user);

        Matcher matcherD = patternDateTemps.matcher(debutS);
        Matcher matcherF = patternDateTemps.matcher(finS);
        if(matcherD.matches() && matcherF.matches()){
                LocalDateTime debut = LocalDateTime.parse(debutS);
                LocalDateTime fin = LocalDateTime.parse(finS);
                if(!debut.isAfter(fin)) {
                    this.stages.ajouteStage(new Stage(nom, debut, fin));
                    System.out.println("Le stage a bien été encoder");
                }
                else System.out.println("Dates invalide!!!!!");
        }
        else {
            System.out.println("Mauvais format d'encodage");
        }


    }
}
