
public class Cellule {
	private boolean noire ;
	private Cellule suivante ;
	private Cellule precedente ;
	private boolean prochainEtat ;
	
	public Cellule getSuivante() {
		return this.suivante;
	}
	
	public Cellule getPrecedente() {
		return this.precedente;
	}
	
	public boolean getNoire() {
		return this.noire;
	}
	
	public boolean getProchainEtat() {
		return this.prochainEtat;
	}
	
	public void setNoire(boolean noire) {
		this.noire = noire;
	}
	
	public void setProchainEtat(boolean noire) {
		this.prochainEtat = noire ;
	}
	
	public void setSuivante(Cellule suivante) {
		this.suivante = suivante;
	}
	
	public void setPrecedente(Cellule precedente) {
		this.precedente = precedente ;
	}
	
	public Cellule(boolean noire) {
		this.noire = noire;
		this.suivante = null;
		this.precedente = null;
		this.prochainEtat = false ;
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
