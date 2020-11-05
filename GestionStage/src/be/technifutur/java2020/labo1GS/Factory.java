package be.technifutur.java2020.labo1GS;

import java.util.Iterator;
import java.util.Scanner;

public class Factory {
    private StageCtrl ctrl;


    public void start() {
        StageVue vue = new StageVue();
        this.ctrl = new StageCtrl();
        Stages stages = new Stages();

        vue.setCollStages(stages);
        this.ctrl.setVue(vue);
        this.ctrl.setStages(stages);

    }

    public StageCtrl getStageCtrl(){
        return this.ctrl;
    }
}
