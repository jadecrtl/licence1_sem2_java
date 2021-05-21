public class Listedeux {
    private Elementdeux premier;
    private Elementdeux dernier;

    public Listedeux() {
        this.premier = null;
        this.dernier = null;
    }

    public Elementdeux getPremier() {
        return premier;
    }
    public void setPremier (Elementdeux premier) {
        this.premier = premier;
    }

    public Elementdeux getDernier() {
        return dernier;
    }
    public void setDernier (Elementdeux dernier) {
        this.dernier = dernier;
    }

    public int longueur() {
        if (this.premier == null) {
            return 0;
        }
        else {
            return this.premier.longueur();
        }
    }

    public void afficher() {
        if (this.premier == null) {
            System.out.println("()");
        }
        else {
            System.out.println("(")
        }
    }

}
