public class CellRob {
    private Robot rob;
    private CellRob suiv;
    private CellRob prec;
    public CellRob (Robot rob, CellRob suiv, CellRob prec) {
        this.rob = rob;
        this.suiv = suiv;
        this.prec = prec;
    }
    public Robot getRob() {
        return rob;
    }
    public CellRob getPrec() {
        return prec;
    }
    public void setPrec(CellRob prec) {
        this.prec = prec;
    }
    public CellRob getSuiv() {
        return suiv;
    }
    public void setSuiv(CellRob suiv) {
        this.suiv = suiv;
    }
    public void setRob(Robot rob) {
        this.rob = rob;
    }
    public void affiche() {
        CellRob tmp = this.suiv;
        this.rob.description();
        while (tmp != this) {
            tmp.rob.description();
            tmp = tmp.suiv;
        }
    }
    public void ajouterRob(Robot r) {
        CellRob c = new CellRob(r, this, this.prec);
        this.prec.suiv = c;
        this.prec = c;
    }
    public boolean supprimer (int id) {
        CellRob tmp = this.suiv;
        while (tmp != this) {
            if (tmp.rob.getId() == id) {
                tmp.suiv.prec = tmp.prec;
                tmp.prec.suiv = tmp.suiv;
                return true;
            }
            tmp = tmp.suiv;
        }
        return false;
    }

    public boolean supprimer (char nom) {
        CellRob tmp = this.suiv;
        while (tmp != this) {
            if (tmp.rob.getId() == Character.getNumericValue(nom)) {
                tmp.suiv.prec = tmp.prec;
                tmp.prec.suiv = tmp.suiv;
                return true;
            }
            tmp = tmp.suiv;
        }
        return false;
    }

    public void eloquence(TableRonde tab) {
        CellRob tmp = this;
        while (tab.getCourant() != null) {
            if (tmp.rob.finiDeParler()) {
                tab.supprimer(tmp.rob.getId());
            }else {
                tmp.rob.parle(5);
            }
            tmp = tmp.suiv;
        }
    }

    
}
