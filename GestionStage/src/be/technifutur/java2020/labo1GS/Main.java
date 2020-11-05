package be.technifutur.java2020.labo1GS;

import java.awt.*;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lancement de la Factory

        Factory factory = new Factory();
        factory.getMenuG().start();
        factory = null;

        //Lancement via initialisation dans des variables



        //Lancement direct

        //factory.getMenuG().start(factory.getStageCtrlEncode(),factory.getStageCtrlModif(),factory.getMenuM());
    }
}
