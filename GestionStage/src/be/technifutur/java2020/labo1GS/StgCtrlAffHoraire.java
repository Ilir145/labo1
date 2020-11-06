package be.technifutur.java2020.labo1GS;

import java.time.LocalDateTime;
import java.util.List;

public class StgCtrlAffHoraire {
    private Stages stages;
    private StageVue vueStg;
    private ActiviteVue vueAct;

    public void setVueAct(ActiviteVue vueAct) {
        this.vueAct = vueAct;
    }

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public void setVueStg(StageVue vueStg) {
        this.vueStg = vueStg;
    }

    public void affHoraire(){
        String nom = this.vueStg.saisirNom();
        Activite[] tabAct = new Activite[this.stages.getStages().get(nom).getActivites().size()];
        int i = 0;
        for (Activite act : this.stages.getStages().get(nom).getActivites().values()) {
            tabAct[i] = act;
            i++;
        }
        tabAct = triTabAct(tabAct);
        this.afficheActTab(tabAct);
    }

    public void afficheActTab(Activite[] activites){
        for (int i = 0; i < activites.length;i++){
            this.vueAct.setActivite(activites[i]);
            this.vueAct.afficheActivite();
        }
    }

    public Activite[] triTabAct(Activite[] activites){
        Activite[] tabActRetour = activites;
        for (int i = 0;i < tabActRetour.length;i++){
            for(int j = i;j < tabActRetour.length;j++){
                if(tabActRetour[i].getDebut().isAfter(tabActRetour[j].getDebut())){
                    echangeAct(tabActRetour,i,j);
                }
            }
        }
        return tabActRetour;
    }

    public void echangeAct(Activite[] activite,int ind1,int ind2){
        Activite pivot = activite[ind1];
        activite[ind1] = activite[ind2];
        activite[ind2] = pivot;

    }
}
