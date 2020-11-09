package be.technifutur.java2020.labo1GS.Stage;

import be.technifutur.java2020.labo1GS.Activite.Activite;

public class HoraireVue {


    public  void afficheHoraire(Activite[] activites){
        System.out.println(activites[0].getDebut().getDayOfWeek() + " " + activites[0].getDebut().getDayOfMonth() + " " + activites[0].getDebut().getMonth() + " " + activites[0].getDebut().getYear());
        System.out.println("         " + activites[0].getDebut().getHour() + "h" + activites[0].getDebut().getMinute() + " - " +activites[0].getDebut().plusMinutes(activites[0].getDuree()).getHour() + "h" +activites[0].getDebut().plusMinutes(activites[0].getDuree()).getMinute()+ "  " + activites[0].getNom() + " (" + activites[0].getDuree() + " min )");
        for (int i = 1; i < activites.length;i++){

            if(!(activites[i].getDebut().getDayOfYear() == activites[i-1].getDebut().getDayOfYear() && activites[i].getDebut().getYear() == activites[i].getDebut().getYear())) {
                System.out.println(activites[i].getDebut().getDayOfWeek() + " " + activites[i].getDebut().getDayOfMonth() + " " + activites[i].getDebut().getMonth() + " " + activites[i].getDebut().getYear());
            }
            System.out.println("         " + activites[i].getDebut().getHour() + "h" + activites[i].getDebut().getMinute() + " - " +activites[i].getDebut().plusMinutes(activites[i].getDuree()).getHour() + "h" +activites[i].getDebut().plusMinutes(activites[i].getDuree()).getMinute() + "  " + activites[i].getNom() + " (" + activites[i].getDuree() + " min )");
        }
    }

}
