package be.technifutur.java2020.labo1GS;

import be.technifutur.java2020.labo1GS.User.User;
import be.technifutur.java2020.labo1GS.User.UserTest;

public class Main {
    public static void main(String[] args) {
        //Lancement de la Factory
        User user = new UserTest();
        Factory factory = new Factory();
        factory.getMenuG().start(user);
        factory = null;

        //Lancement via initialisation dans des variables



        //Lancement direct

        //factory.getMenuG().start(factory.getStageCtrlEncode(),factory.getStageCtrlModif(),factory.getMenuM());
    }
}
