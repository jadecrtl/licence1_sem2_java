public class Arbre {
    private Noeud sommet ;

    public Arbre ( Noeud sommet ) {
    this.setSommet(sommet) ;
    }

    public Arbre () {
        this.sommet = null;
    }

    public Arbre (Arbre a) {
        if (a.sommet == null) {
            sommet = null;
        }
        else {
            this.sommet = a.sommet.copieProfonde();
        }
    }

    public Noeud getSommet() {
        return sommet;
    }

    public void setSommet(Noeud sommet) {
        this.sommet = sommet;
    }

    public void afficheInfixe() {
        if (sommet == null) {
            System.out.print("vide");
        }
        else {
            sommet.afficheInfixe();
        }
        System.out.println("");
    }

    public void affichePrefixe() {
        if (sommet == null) {
            System.out.print("vide");
        }
        else {
            sommet.affichePrefixe();
        }
        System.out.println("");
    }

    public void afficheSuffixe() {
        if (sommet == null) {
            System.out.print("vide");
        }
        else {
            sommet.afficheSuffixe();
        }
        System.out.println("");
    }

    public int nbDeNoeuds() {
        if (sommet == null) {
            return 0;
        }
        else {
            return sommet.nbDeNoeuds();
        }
    }

    public int somme() {
        if (sommet == null) {
            return 0;
        }
        else {
            return sommet.somme();
        }
    }

    public int profondeur() {
        if (sommet == null) {
            return 0;
        }
        return sommet.profondeur() - 1;
    }

    public boolean recherche (int e) {
        if (sommet == null) {
            return false;
        }
        return sommet.recherche(e);
    }






}
