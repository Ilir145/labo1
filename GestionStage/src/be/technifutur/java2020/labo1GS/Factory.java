package be.technifutur.java2020.labo1GS;


public class Factory {
    private  StageCtrlEncode ctrlEncode;
    private  StageCtrlModifNom ctrlModifNom;
    private  StageCtrlAjouteActivite ctrlAjouteActivite;
    private  StgCtrlAffCollAct ctrlAffCollAct;
    private  MenuGeneral menuG;
    private  MenuModif menuM;
    private  Stages stages;
    private  StageVue vueStage;
    private  ActiviteVue vueAct;
    private ActiviteCtrl ctrlAct;

    public MenuGeneral getMenuG() {
        if(this.menuG == null){
            this.menuG = new MenuGeneral();
            this.menuG.setCtrlEncode(this.getCtrlEncode());
            this.menuG.setCtrlModif(this.getCtrlModifNom());
            this.menuG.setMenuModif(this.getMenuM());
        }
        return menuG;
    }

    public MenuModif getMenuM() {
        if(this.menuM == null){
            this.menuM = new MenuModif();
            this.menuM.setCtrlModifNom(this.getCtrlModifNom());
            this.menuM.setCtrlAjouteActivite(this.getCtrlAjouteActivite());
            this.menuM.setCtrlAffCollAct(this.getCtrlAffCollAct());
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

    public Stages getStages() {
        if(this.stages == null){
            this.stages = new Stages();
        }
        return stages;
    }

    public StageVue getVueStage() {
        if(this.vueStage == null){
            this.vueStage = new StageVue();
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

}
