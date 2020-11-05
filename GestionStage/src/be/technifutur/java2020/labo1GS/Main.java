package be.technifutur.java2020.labo1GS;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.start();
        StageCtrl ctrl = factory.getStageCtrl();
        Menu menu = new Menu();
        menu.start(ctrl);
    }
}
