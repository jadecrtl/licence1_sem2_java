public class Elementdeux {
    private int valeur;
    private Elementdeux suivant;
    private Elementdeux precedent;

    public Elementdeux(int valeur, Elementdeux suivant, Elementdeux precedent) {
        this.valeur = valeur;
        this.suivant = suivant;
        this.precedent = precedent;
    }

    public int getValeur() {
        return valeur;
    }
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Elementdeux getSuivant() {
        return suivant;
    }
    public void setSuivant(Elementdeux suivant) {
        this.suivant = suivant;
    }

    public Elementdeux getPrecedent() {
        return precedent;
    }
    public void setPrecedent(Elementdeux precedent) {
        this.precedent = precedent;
    }

    public int longueur() {
        if (this.suivant == null) {
            return 1;
        }
        else {
            return 1 + this.suivant.longueur();
        }
    }



}
