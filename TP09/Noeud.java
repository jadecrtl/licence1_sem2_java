public class Noeud {
    private int etiquette ;
    private Noeud gauche ;
    private Noeud droit ;
    
    public Noeud ( int etiquette , Noeud g , Noeud d ) {
        this.setEtiquette(etiquette) ;
        this.setGauche(g) ;
        this.setDroit(d) ;
    }
    public int getEtiquette() {
        return etiquette;
    }
    public void setEtiquette(int etiquette) {
        this.etiquette = etiquette;
    }
    public Noeud getGauche() {
        return gauche;
    }
    public void setGauche(Noeud gauche) {
        this.gauche = gauche;
    }
    public Noeud getDroit() {
        return droit;
    }
    public void setDroit(Noeud droit) {
        this.droit = droit;
    }
    public Noeud ( int etiquette ) {
        this ( etiquette , null , null );
    }

    public void afficheInfixe() {
        if (this.gauche != null) {
            this.gauche.afficheInfixe();
        }
        System.out.print(this.etiquette + " ");
        if (this.droit != null) {
            this.droit.afficheInfixe();
        }
    }

    public void affichePrefixe() {
        System.out.print(this.etiquette + " ");
        if (this.gauche != null) {
            this.gauche.affichePrefixe();
        }
        if (this.droit != null) {
            this.droit.affichePrefixe();
        }
    }

    public void afficheSuffixe() {
        if (this.gauche != null) {
            this.gauche.afficheSuffixe();
        }
        if (this.droit != null) {
            this.droit.afficheSuffixe();
        }
        System.out.print(this.etiquette + " ");        
    }

    public int nbDeNoeuds() {
        int res = 1;
        if (this.gauche != null) {
            res += this.gauche.nbDeNoeuds();
        }
        if (this.droit != null) {
            res += this.droit.nbDeNoeuds();
        }
        return res;
    }

    public int somme() {
        int res = this.etiquette;
        if (this.gauche != null) {
            res += this.gauche.somme();
        }
        if (this.droit != null) {
            res += this.droit.somme();
        }
        return res;
    }

    public int profondeur() {
        int profGauche = 0;
        int profDroit = 0;
        if (gauche != null) {
            profGauche = gauche.profondeur();
        }
        if (droit != null) {
            profDroit = droit.profondeur();
        }
        return 1 + Math.max(profDroit, profGauche);
    }

    public boolean recherche (int e) {
        if (this.etiquette == e) {
            return true;
        }
        boolean res = false;
        if (gauche != null) {
            res |= gauche.recherche(e); // | signifie OR donc ça veut dire res = res OR gauche.recherche(e)
        }
        if (droit != null) {
            res |= droit.recherche(e);
        }
        return res;
    }

    public Noeud copieProfonde() {
        Noeud g = null;
        Noeud d = null;
        if (gauche != null) {
            g = gauche.copieProfonde();
        }
        if (droit != null) {
            d = droit.copieProfonde();
        }
        return new Noeud(this.etiquette, g, d);
    }




}