package be.technifutur.java2020.labo1GS.User;

import be.technifutur.java2020.labo1GS.User.User;

import java.util.Scanner;

public class UserConsole implements User {

    Scanner sc = new Scanner(System.in);
    @Override
    public String getString() {
        return sc.nextLine();
    }
}
