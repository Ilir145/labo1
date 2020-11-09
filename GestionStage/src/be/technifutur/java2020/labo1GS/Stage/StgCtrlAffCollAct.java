package be.technifutur.java2020.labo1GS.Stage;

import be.technifutur.java2020.labo1GS.Activite.Activite;
import be.technifutur.java2020.labo1GS.Activite.ActiviteVue;
import be.technifutur.java2020.labo1GS.User.User;

public class StgCtrlAffCollAct {
    private Stages stages;
    private StageVue vueStg;
    private ActiviteVue vueAct;

    public void setVueAct(ActiviteVue vueAct) {
        this.vueAct = vueAct;
    }

    public void setVueStg(StageVue vueStg) {
        this.vueStg = vueStg;
    }

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public void afficheACtivites(User user){
        String nomStg = this.vueStg.saisirNom(user);
        for (Activite act:
                this.stages.getStages().get(nomStg).getActivites().values()) {
            this.vueAct.setActivite(act);
            vueAct.afficheActivite();
            System.out.println();
        }

    }
}
