package be.technifutur.java2020.labo1GS;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParticipantCtrl {
    Participant participant;
    ParticipantVue vue;

    public void setVue(ParticipantVue vue) {
        this.vue = vue;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Participant getParticipant() {
        return this.participant;
    }

    public void encodeParticipant(User user){
        String nom = this.vue.saisirNom(user);
        String prenom = this.vue.saisirPrenom(user);
        String email = this.vue.saisirEmail(user);
        String club = this.vue.saisirClub(user);
        this.participant = new Participant(nom,prenom,email,club);
    }
}
