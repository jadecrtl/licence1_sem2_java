
public class Automate {
	private Cellule premier ;
	private Cellule dernier ;
	
	public Automate() {
		this.premier = null ;
		this.dernier = null ;
	}
	
	public Automate(String str) {
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) != '#' && str.charAt(i) != '-') {
				System.out.println("Argument non correct !");
				return ;
			}
		}
		if(str.charAt(0) == '#') {
			this.ajouterDebut(true);
		} else {
			this.ajouterDebut(false);
		}
		for(int i = 1 ; i < str.length() ; i++) {
			if(str.charAt(i) == '#') {
				this.ajouterFin(true);
			} else {
				this.ajouterFin(false);
			}
		}
	}
	
	public void ajouterDebut(boolean noire) {
		if(this.premier == null) {
			this.premier = new Cellule(noire);
		} else {
			Cellule c = new Cellule(noire);
			c.setSuivante(this.premier);
			this.premier.setPrecedente(c);
			this.premier = c ;
		}
	}
	
	public void ajouterFin(boolean noire) {
		if(this.premier == null) {
			this.premier.setNoire(noire);
			this.dernier.setNoire(noire);
		} else {
			if(this.dernier != null) {
				Cellule c = new Cellule(noire);
				this.dernier.setSuivante(c);
				c.setPrecedente(this.dernier);
				this.dernier = c ;
			} else {
				Cellule c = new Cellule(noire);
				c.setPrecedente(this.premier);
				this.dernier = c ;
				this.premier.setSuivante(c);
			}
		} 
	}
	
	public void affiche() {
		if(this.premier == null) {
			return ;
		}
		this.premier.affiche();
	}
	
	public void prochainEtat() {
		if(this.premier == null) {
			return ;
		}
		if(this.premier.getNoire() == false && this.premier.getNoire() == this.premier.getSuivante().getNoire()) {
			this.premier.setProchainEtat(false);
		} else {
			this.premier.setProchainEtat(true);
		}
		this.premier.prochainEtat();
	}
	
	public void prochainEtatMaj() {
		if(this.premier == null) {
			return ;
		}
		if(this.premier.getNoire() == true && this.premier.getNoire() == this.premier.getSuivante().getNoire()) {
			this.premier.setProchainEtat(true);
		} else {
			this.premier.setProchainEtat(false);
		}
		this.premier.prochainEtatMaj();
	}
	
	public void miseAJour() {
		if(this.premier == null) {
			return ;
		}
		this.premier.miseAJour();
	}
	
	public void initialisation() {
		this.ajouterDebut(true);
		this.ajouterFin(true);
		this.ajouterFin(true);
		this.ajouterFin(false);
		this.ajouterFin(false);
		this.ajouterFin(false);
		this.ajouterFin(true);
		this.ajouterFin(false);
		this.ajouterFin(false);
		this.ajouterFin(false);
		this.ajouterFin(false);
	}
	
	public void uneEtape() {
		if(this.premier == null) {
			return ;
		}
		this.prochainEtat();
		this.miseAJour();
	}
	
	public void uneEtapeMaj() {
		if(this.premier == null) {
			return ;
		}
		this.prochainEtatMaj();
		this.miseAJour();
	}
	
	public void nEtapes(int n) {
		this.affiche();
		System.out.println();
		for(int i = 0 ; i < n ; i++) {
			this.uneEtape();
			this.affiche();
			System.out.println();
		}
	}
	
	public void nEtapesMaj(int n) {
		this.affiche();
		System.out.println();
		for(int i = 0 ; i < n ; i++) {
			this.uneEtapeMaj();
			this.affiche();
			System.out.println();
		}
	}
	
	public static void main(String[] arg) {
		Automate a = new Automate();
		Automate bis = new Automate("-----#-----");
		Automate maj = new Automate("###-#-#--#-");
		a.initialisation();
		/*a.affiche();
		a.prochainEtat();
		a.miseAJour();
		System.out.println();
		a.uneEtape();
		a.affiche();*/
		a.nEtapes(4);
		System.out.println("==========================");
		bis.nEtapes(10);
		System.out.println("==========================");
		maj.nEtapesMaj(4);
	}
}
