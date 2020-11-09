package be.technifutur.java2020.labo1GS.Stage;

import be.technifutur.java2020.labo1GS.Stage.Stage;

import java.util.HashMap;

public class Stages {
    private  HashMap<String, Stage> stages;

    public Stages(){
        stages = new HashMap<>();
    }

    public HashMap<String, Stage> getStages() {
        return stages;
    }

    public boolean ajouteStage(Stage stage){
        boolean verif = true;
        if(!this.stages.containsKey(stage.getNom())){
            stages.put(stage.getNom(),stage);
            verif = true;
        }
        return verif;
    }
}
