public class Cellule {
    private Cellule precedente;
    private Cellule suivante;
    private boolean noire;
    private boolean prochainEtat;

    public Cellule getPrecedente() {
        return this.precedente;
    }
    public void setPrecedente (Cellule precedente) {
        this.precedente = precedente;
    }
    public Cellule getSuivante() {
        return this.suivante;
    }
    public void setSuivante (Cellule suivante) {
        this.suivante = suivante;
    }
    public boolean getProchaineEtat() {
        return this.prochainEtat;
    }
    public void setProchainEtat (boolean noire) {
        this.prochainEtat = noire;
    }
    public boolean getNoire() {
        return this.noire;
    }
    public void setNoire (boolean noire) {
        this.noire = noire;
    }

    public Cellule (boolean noire) {
        this.precedente = null;
        this.suivante = null;
        this.noire = noire;
    }
	
	public void afficher() {
		if(this.noire == true) {
			System.out.print("# ");
		} else {
			System.out.print("- ");
		}
	}
	
	public void affiche() {
		if(this.suivante != null) {
			this.afficher();
			this.suivante.affiche();
		} else {
			this.afficher();
		}
	}
	
	public void prochainEtat() {
		if(this.suivante.suivante != null) {
			if(this.noire == this.suivante.noire && this.suivante.noire == this.suivante.suivante.noire) {
				this.suivante.prochainEtat = false ;
			} else {
				this.suivante.prochainEtat = true ;
			}
			this.suivante.prochainEtat();
		} else {
			if(this.getNoire() == false && this.suivante.getNoire() == this.getNoire()) {
				this.suivante.setProchainEtat(false);
			} else {
				this.suivante.setProchainEtat(true);
			}
		}
	}
	
	public void prochainEtatMaj() {
		if(this.suivante.suivante != null) {
			if(this.noire == this.suivante.noire || this.suivante.noire == this.suivante.suivante.noire) {
				this.suivante.prochainEtat = this.suivante.noire ;
			} else {
				this.suivante.prochainEtat = !(this.suivante.noire) ;
			}
			this.suivante.prochainEtatMaj();
		} else {
			if(this.noire == true && this.suivante.noire == this.noire) {
				this.suivante.setProchainEtat(true);
			} else {
				this.suivante.setProchainEtat(false);
			}
		}
	}
	
	public void miseAJour() {
		if(this.suivante != null) {
			this.noire = this.prochainEtat ;
			this.suivante.miseAJour();
		} else {
			this.noire = this.prochainEtat ;
		}
	}


}