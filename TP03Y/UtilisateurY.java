
public class Utilisateur {
	private String pseudo;
	private String motDePasse;
	private final String adresseMail;
	
	public Utilisateur(String pseudo, String motDePasse, String adresseMail){
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.adresseMail = adresseMail;
	}
	
	public boolean testMotDePasse(String mdp){
		if(this.motDePasse.equals(mdp)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void changerMotDePasse(String motDePasse, String nouveauMotDePasse) {
		if(this.testMotDePasse(motDePasse)){
			this.motDePasse = nouveauMotDePasse ;
		}
	}
	
	public String getPseudonyme() {
		return this.pseudo;
	}
	
	public void setPseudonyme(String nouveauPseudo) {
		this.pseudo = nouveauPseudo;
	}
}
