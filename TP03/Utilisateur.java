public class Utilisateur {
    private String pseudo;
    private String motDePasse;
    private final String adresseMail;
    public Utilisateur (String pseudo, String motDePasse, String adresseMail) {
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.adresseMail = adresseMail;
    }
    public boolean testMotDePasse (String mdp) {
        if (mdp == this.motDePasse) {
            return true;
        }
        return false;
    }

    public String changerMotDePasse (String motDePasse, String nouveauMotDePasse) {
        if (testMotDePasse(motDePasse)){
            this.motDePasse = nouveauMotDePasse;
        }
        return nouveauMotDePasse;
    }

    public String getPseudonyme () {
        return this.pseudo;
    }

    public void setPseudonyme (String pseudo) {
        this.pseudo = pseudo;
    }

}