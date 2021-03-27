public class Liste{
    private Element premier;
    private Element dernier;

    public Liste() {
        this.premier = null;
        this.dernier = null;
    }

    public Element getPremier() {
        return this.premier;
    }

    public void setPremier(Element premier) {
        this.premier = premier;
    }

    public Element getDernier() {
        return this.dernier;
    }

    public void setDernier(Element dernier) {
        this.dernier = dernier;
    }

    public int longueur() {
        if (this.premier == null) {
            return 0;
        }
        return this.premier.longueur();
    }

    public void afficher() {
        if (this.premier == null) {
            System.out.println("()");
        }
        System.out.println(" ( "+this.premier.afficher()+" ) ");
    }

    //Version itérative
    /*public void afficherInverse() {
        if (this.dernier == null) {
            System.out.println("()");
        }else {
            System.out.println(" ( " + this.dernier.afficherInverse() + " ) ");
        }
    }*/

    //Version récursive
    public void afficherInverse() {
        if (this.dernier == null) {
            System.out.println("()");
            return;
        }
        System.out.println("(");
        this.dernier.afficherInverse();
        System.out.println(")");

    }

    public void ajouterDebut(int valeur) {
        Element e = new Element (valeur, this.premier, null);
        if (this.premier == null) {
            this.premier = e;
            this.dernier = e;
        }else {
            this.premier.setPrecedent(e);
            this.premier = e;
        }
    }

    public void ajouterFin(int valeur) {
        Element e = new Element (valeur, null, this.dernier);
        if (this.dernier == null) {
            this.premier = e;
            this.dernier = e;
        }else {
            this.dernier.setSuivant(e);
            this.dernier = e;
        }
    }

    public void ajouterAvant(Element e, int valeur) {
        if (this.premier != null) {
            if (this.premier.equals(e)) {
                this.ajouterDebut(valeur);
            }else {
                this.premier.ajouterAvant(e, valeur);
            }
        }
    }



}