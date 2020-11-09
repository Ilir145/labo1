package be.technifutur.java2020.labo1GS;

public class ParticipantVue {
    Participant participant;

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public void afficheParticipant(){
        System.out.println("Nom:" + this.participant.getNom());
        System.out.println("Prenom:" + this.participant.getPrenom());

        if(this.participant.getEmail() != null){
            System.out.println("Email:" + this.participant.getEmail());
        }
        else
        {
            System.out.println("Email: /");
        }
        if(this.participant.getClub() != null){
            System.out.println("Club:" + this.participant.getClub());
        }
        else {
            System.out.println("Club: /");
        }

    }


    public  String saisirNom(User user){
        String saisie;
        System.out.println("Entrez le nom du participant:");
        saisie = user.getString();
        return saisie;
    }

    public  String saisirPrenom(User user){
        String saisie;
        System.out.println("Entrez le Prenom du participant:");
        saisie = user.getString();
        return saisie;
    }

    public  String saisirEmail(User user){
        String saisie;
        System.out.println("Entrez l'email du participant ou x si il n'en a pas:");
        saisie = user.getString();
        if(saisie == "x"){
            return null;
        }
        return saisie;
    }


    public  String saisirClub(User user){
        String saisie;
        System.out.println("Entrez le club du participant ou x si il n'en a pas:");
        saisie = user.getString();
        if(saisie == "x"){
            return null;
        }
        return saisie;
    }
}
