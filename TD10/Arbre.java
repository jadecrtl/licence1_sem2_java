public class Arbre {
    private Noeud racine;
    
    public Arbre() {
        this.racine = null;
    }

    public Noeud getRacine() {
        return racine;
    }

    public void setRacine(Noeud racine) {
        this.racine = racine;
    }

    public void bourgeons() {
        if (this.racine != null) {
            this.racine.bourgeons();
        }
    }
    
    public void elagage() {
        if (this.racine != null) {
            if (this.racine.estFeuille()) {
                this.racine = null;
            }else {
                this.racine.elagage();
            }
        }
    }
}

