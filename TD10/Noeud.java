public class Noeud {
    private Noeud gauche;
    private Noeud droit;

    public Noeud getDroit() {
        return droit;
    }

    public void setDroit(Noeud droit) {
        this.droit = droit;
    }

    public Noeud getGauche() {
        return gauche;
    }

    public void setGauche(Noeud gauche) {
        this.gauche = gauche;
    }

    public Noeud () {
        this.setGauche(null);
        this.setDroit(null);
    }

    public Noeud (Noeud g, Noeud d) {
        this.setGauche(g);
        this.setDroit(d);
    }

    public boolean estFeuille() {
        return this.gauche == null && this.droit == null;
    }

    public void bourgeons() {
        if (this.estFeuille()) {
            this.gauche = new Noeud();
            this.droit = new Noeud();
        }else {
            if (this.gauche != null) {
                this.gauche.bourgeons();
            }
            if (this.droit != null) {
                this.droit.bourgeons();
            }
        }
    }

    public void elagage() {
        if (this.gauche != null) {
            if (this.gauche.estFeuille()) {
                this.gauche = null;
            }else {
                this.gauche.elagage();
            }
        }
        if (this.droit != null) {
            if (this.droit.estFeuille()) {
                this.droit = null;
            }else {
                this.droit.elagage();
            }
        }
    }

    public void croissance() {
        if (this.gauche != null) {
            Noeud G = this.gauche;
            this.gauche = new Noeud(G,null);
            G.croissance();
        }
        if (this.droit != null) {
            Noeud D = this.droit;
            this.droit = new Noeud(D,null);
            D.croissance();
        }
    }

    







}
