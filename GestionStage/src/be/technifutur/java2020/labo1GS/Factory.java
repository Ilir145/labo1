package be.technifutur.java2020.labo1GS;


import be.technifutur.java2020.labo1GS.Activite.ActiviteCtrl;
import be.technifutur.java2020.labo1GS.Activite.ActiviteVue;
import be.technifutur.java2020.labo1GS.Menu.MenuGeneral;
import be.technifutur.java2020.labo1GS.Menu.MenuModif;
import be.technifutur.java2020.labo1GS.Participant.PartCtrlAffPart;
import be.technifutur.java2020.labo1GS.Participant.ParticipantCtrl;
import be.technifutur.java2020.labo1GS.Participant.ParticipantVue;
import be.technifutur.java2020.labo1GS.Participant.Participants;
import be.technifutur.java2020.labo1GS.Stage.*;

public class Factory {
    private StageCtrlEncode ctrlEncode;
    private StageCtrlModifNom ctrlModifNom;
    private StageCtrlAjouteActivite ctrlAjouteActivite;
    private  StgCtrlAffCollAct ctrlAffCollAct;
    private  StgCtrlAffStg ctrlAffStg;
    private  StgCtrlAffHoraire ctrlAffHoraire;
    private StgCtrlAffPart ctrlAffPart;
    private StageCtrlAjouteParticipants ctrlAjouteParticipants;
    private PartCtrlAffPart partCtrlAffPart;
    private MenuGeneral menuG;
    private MenuModif menuM;
    private Stages stages;
    private  StageVue vueStage;
    private ActiviteVue vueAct;
    private ActiviteCtrl ctrlAct;
    private Participants participants;
    private HoraireVue vueHoraire;
    private ParticipantVue participantVue;
    private ParticipantCtrl participantCtrl;

    public MenuGeneral getMenuG() {
        if(this.menuG == null){
            this.menuG = new MenuGeneral();
            this.menuG.setCtrlEncode(this.getCtrlEncode());
            this.menuG.setCtrlModif(this.getCtrlModifNom());
            this.menuG.setMenuModif(this.getMenuM());
            this.menuG.setCtrlAffStg(this.getCtrlAffStg());
            this.menuG.setCtrlAffHoraire(this.getCtrlAffHoraire());
            this.menuG.setCtrlAffPart(this.getCtrlAffPart());
            this.menuG.setPartCtrlAffPart(this.getPartCtrlAffPart());
        }
        return menuG;
    }

    public MenuModif getMenuM() {
        if(this.menuM == null){
            this.menuM = new MenuModif();
            this.menuM.setCtrlModifNom(this.getCtrlModifNom());
            this.menuM.setCtrlAjouteActivite(this.getCtrlAjouteActivite());
            this.menuM.setCtrlAffCollAct(this.getCtrlAffCollAct());
            this.menuM.setCtrlAjouteParticipants(this.getCtrlAjouteParticipants());
        }
        return menuM;
    }

    public StageCtrlEncode getCtrlEncode() {
        if(this.ctrlEncode == null){
            this.ctrlEncode = new StageCtrlEncode();
            this.ctrlEncode.setStages(this.getStages());
            this.ctrlEncode.setVue(this.getVueStage());
        }
        return ctrlEncode;
    }

    public StageCtrlModifNom getCtrlModifNom() {
        if(this.ctrlModifNom == null){
            this.ctrlModifNom = new StageCtrlModifNom();
            this.ctrlModifNom.setStages(this.getStages());
            this.ctrlModifNom.setVue(this.getVueStage());
        }
        return ctrlModifNom;
    }

    public  StageCtrlAjouteActivite getCtrlAjouteActivite(){
        if(this.ctrlAjouteActivite == null){
            this.ctrlAjouteActivite = new StageCtrlAjouteActivite();
            this.ctrlAjouteActivite.setStages(this.getStages());
            this.ctrlAjouteActivite.setVueStage(this.getVueStage());
            this.ctrlAjouteActivite.setCtrlActivite(this.getCtrlAct());
            this.ctrlAjouteActivite.setVueAct(this.getVueAct());
        }
        return this.ctrlAjouteActivite;
    }

    public StgCtrlAffCollAct getCtrlAffCollAct() {
        if(this.ctrlAffCollAct == null){
            this.ctrlAffCollAct = new StgCtrlAffCollAct();
            this.ctrlAffCollAct.setStages(this.getStages());
            this.ctrlAffCollAct.setVueAct(this.getVueAct());
            this.ctrlAffCollAct.setVueStg(this.getVueStage());
        }
        return ctrlAffCollAct;
    }

    public StgCtrlAffStg getCtrlAffStg() {
        if(this.ctrlAffStg == null){
            this.ctrlAffStg = new StgCtrlAffStg();
            this.ctrlAffStg.setStages(this.getStages());
            this.ctrlAffStg.setVue(this.getVueStage());
        }
        return ctrlAffStg;
    }

    public StgCtrlAffHoraire getCtrlAffHoraire() {
        if(this.ctrlAffHoraire == null){
            this.ctrlAffHoraire = new StgCtrlAffHoraire();
            this.ctrlAffHoraire.setVueStg(this.getVueStage());
            this.ctrlAffHoraire.setStages(this.getStages());
            this.ctrlAffHoraire.setVueAct(this.getVueAct());
            this.ctrlAffHoraire.setVueHoraire(this.getVueHoraire());
        }
        return ctrlAffHoraire;
    }

    public StgCtrlAffPart getCtrlAffPart() {
        if(this.ctrlAffPart == null){
            this.ctrlAffPart = new StgCtrlAffPart();
            this.ctrlAffPart.setStages(this.getStages());
            this.ctrlAffPart.setVuePart(this.getParticipantVue());
            this.ctrlAffPart.setVueStg(this.getVueStage());
        }
        return ctrlAffPart;
    }

    public StageCtrlAjouteParticipants getCtrlAjouteParticipants() {
        if(this.ctrlAjouteParticipants == null){
            this.ctrlAjouteParticipants = new StageCtrlAjouteParticipants();
            this.ctrlAjouteParticipants.setCtrlPart(this.getParticipantCtrl());
            this.ctrlAjouteParticipants.setVuePart(this.getParticipantVue());
            this.ctrlAjouteParticipants.setStages(this.getStages());
            this.ctrlAjouteParticipants.setVueStage(this.getVueStage());
            this.ctrlAjouteParticipants.setParticipants(this.getParticipants());
        }
        return ctrlAjouteParticipants;
    }

    public PartCtrlAffPart getPartCtrlAffPart() {
        if(this.partCtrlAffPart == null){
            this.partCtrlAffPart = new PartCtrlAffPart();
            this.partCtrlAffPart.setParticipants(this.getParticipants());
            this.partCtrlAffPart.setVue(this.getParticipantVue());
        }
        return partCtrlAffPart;
    }

    public Stages getStages() {
        if(this.stages == null){
            this.stages = new Stages();
        }
        return stages;
    }

    public StageVue getVueStage() {
        if(this.vueStage == null){
            this.vueStage = new StageVue();
            this.vueStage.setCollStages(this.getStages());
        }
        return vueStage;
    }

    public ActiviteVue getVueAct(){
        if(this.vueAct == null){
            this.vueAct = new ActiviteVue();
        }
        return this.vueAct;
    }

    public  ActiviteCtrl getCtrlAct(){
        if(this.ctrlAct == null){
            this.ctrlAct = new ActiviteCtrl();
            this.ctrlAct.setVue(this.getVueAct());
        }
        return this.ctrlAct;
    }

    public HoraireVue getVueHoraire() {
        if(this.vueHoraire == null){
            this.vueHoraire = new HoraireVue();
        }
        return vueHoraire;
    }

    public Participants getParticipants() {
        if(this.participants == null){
            this.participants = new Participants();
        }
        return participants;
    }

    public ParticipantCtrl getParticipantCtrl() {
        if(this.participantCtrl == null){
            this.participantCtrl = new ParticipantCtrl();
            this.participantCtrl.setVue(this.getParticipantVue());
            this.participantCtrl.setParticipants(this.getParticipants());
        }
        return participantCtrl;
    }

    public ParticipantVue getParticipantVue() {
        if(this.participantVue == null){
            this.participantVue = new ParticipantVue();
        }
        return participantVue;
    }
}
