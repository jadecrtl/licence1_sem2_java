public class Element {
    private int valeur;
    private Element suivant;
    private Element precedent;

    public Element(int valeur, Element suivant, Element precedent) {
        this.valeur = valeur;
        this. suivant = suivant;
        this.precedent = precedent;
    }

    public int getValeur() {
        return this.valeur;
    }
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public Element getSuivant() {
        return this.suivant;
    }
    public void setSuivant(Element suivant) {
        this.suivant = suivant;
    }
    public Element getPrecedent() {
        return this.precedent;
    }
    public void setPrecedent(Element precedent) {
        this.precedent = precedent;
    }

    public int longueur() {
        if (this.suivant == null) {
            return 1;
        }
        return 1 + this.suivant.longueur();
    }

    public String afficher() {
        if (this.suivant == null) {
            return Integer.toString(this.valeur);
        }
        return this.valeur + " ; " + this.suivant.afficher();
    }

    //version itérative
    /*public String afficherInverse() {
        String res = "";
        Element tmp = this;
        while (tmp.precedent != null) {
            res += tmp.valeur + " ; ";
            tmp = tmp.precedent;
        }
        res += this.valeur; //On rajoute le premier element qui est le dernier dans la liste en sens inverse
        return res;
    }*/

    //version récursive
    public void afficherInverse() {
        if (this.precedent == null) {
            System.out.println(this.valeur);
            return;
        }
        System.out.println(this.valeur + " ; ");
        this.precedent.afficherInverse();
    }

    public void ajouterAvant(Element e, int valeur) {
        if(this.suivant == null) {
            return;
        }
        if (this.suivant.equals(e)) {
            Element e2 = new Element (valeur, this.suivant, this);
            this.suivant.precedent = e2;
            this.suivant = e2;
        }
    }

}
