public class TableRonde {
    private CellRob courant;
    
    public TableRonde (Robot rob) {
        this.courant = new CellRob(rob, this.courant, this.courant);
    }
    public CellRob getCourant() {
        return courant;
    }

    public void setCourant(CellRob courant) {
        this.courant = courant;
    }

    public void affiche() {
        if (this.courant == null) {
            System.out.println("La liste est vide.");
            return;
        }
        this.courant.affiche();
    }
    public void ajouterRob(Robot r) {
        if (this.courant == null) {
            this.courant = new CellRob(r, this.courant, this.courant);
        }else if (this.courant.getSuiv() == null) {
            CellRob c = new CellRob(r, this.courant, this.courant);
            this.courant.setPrec(c);
            this.courant.setSuiv(c);
        } else {
            this.courant.ajouterRob(r);
        }
    }
    public boolean supprimer (int id) {
        if (this.courant == null) {
            return false;
        }else if (this.courant.getRob().getId() == id){
            if (this.courant == this.courant.getSuiv()){
                this.courant = null;
                return true;
            }else {
                this.courant.getSuiv().setPrec(this.courant.getPrec());
                this.courant.getPrec().setSuiv(this.courant.getSuiv());
                this.courant = this.courant.getSuiv();
                return true;
            }
        }else {
            return this.courant.supprimer(id);
        }
    }

    public boolean supprimer (char nom) {
        if (this.courant == null) {
            return false;
        }else if (this.courant.getRob().getId() == Character.getNumericValue(nom)) {
            if (this.courant.getSuiv() == this.courant) {
                this.courant = null;
                return true;
            }else {
                this.courant.getSuiv().setPrec(this.courant.getPrec());
                this.courant.getPrec().setSuiv(this.courant.getSuiv());
                this.courant = this.courant.getSuiv();
                return true;
            }
        }else {
            return this.courant.supprimer(nom);
        }
    }

    public void eloquence() {
        if (this.courant == null) {
            System.out.println("J'ai rien à dire.");
            return;
        }
        this.courant.eloquence(this);
    }

}
