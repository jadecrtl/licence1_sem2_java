public class Personne {
    private final String prenom;
    private final String nomDeFamille;
    private Personne mere;
    private Personne pere;

    public Personne getPere() {
        return pere;
    }

    public void setPere(Personne pere) {
        this.pere = pere;
    }

    public Personne getMere() {
        return mere;
    }

    public void setMere(Personne mere) {
        this.mere = mere;
    }

    public String getNomDeFamille() {
        return nomDeFamille;
    }

    public String getPrenom() {
        return prenom;
    }

    public Personne (String prenom, String nomDeFamille){
        this.prenom = prenom;
        this.nomDeFamille = nomDeFamille;
        this.setMere(null);
        this.setPere(null);
    }

    public Personne (String prenom, String nomDeFamille, Personne mere, Personne pere){
        this(prenom, nomDeFamille);
        this.mere = mere;
        this.pere = pere;
    }

    //Teste si la personne courante (this) est un frère ou une soeur de p
    public boolean estFrereDuSoeur (Personne p){
        if (p == null || this.pere == null || this.mere == null) {
            return false;
        }
        return (this.pere == p.pere && this.mere == p.mere);
    }

    //Teste si this et p sont cousins germain, donc si un parent de l'un et le frère ou la soeur d'un parent de l'autre
    public boolean estCousinGermain (Personne p){
        if (p == null || p == this || (this.pere == null && this.mere == null)) {
            return false;
        }
        if (this.pere == null && this.mere != null) {
            return this.mere.estFrereDuSoeur(p.mere) || this.mere.estFrereDuSoeur(p.pere);
        }
        if (this.pere != null && this.mere == null) {
            return this.pere.estFrereDuSoeur(p.mere) || this.pere.estFrereDuSoeur(p.pere);
        }
        return (this.pere.estFrereDuSoeur(p.pere) || this.mere.estFrereDuSoeur(p.pere) || this.pere.estFrereDuSoeur(p.mere) || this.mere.estFrereDuSoeur(p.mere));
    }

    //Renvoie le nombre d'ascendants de this
    public int nbAscendantsVivants(){
        int axMere = 0;
        int axPere = 0;
        if (this.mere != null) {
            axMere = this.mere.nbAscendantsVivants();
        }
        if (this.pere != null) {
            axPere = this.pere.nbAscendantsVivants();
        }
        return 1 + axMere + axPere;
    }

    //Teste si la personne courante (this) a pour ascendant p 
    //Ceci est un premier essai
    /*public boolean possedeCommeAscendant(Personne p){
        if (p == this) {
            return false;
        }
        if (this.mere == null && this.pere == null) {
            return false;
        }
        if (this.mere == null && this.pere != null) {
            return this.pere.possedeCommeAscendant(p);
        }
        if (this.mere != null && this.pere == null) {
            return this.mere.possedeCommeAscendant(p);
        }
        return this.mere.possedeCommeAscendant(p) || this.pere.possedeCommeAscendant(p);
    }*/
    //Maintenant voici le code de la fonction possedeCommeAscendant de manière plus compacte
    public boolean possedeCommeAscendant (Personne p){
        boolean axPere = false;
        boolean axMere = false;
        if (this.mere != null) {
            axMere = this.mere.possedeCommeAscendant(p);
        }
        if (this.pere != null) {
            axPere = this.pere.possedeCommeAscendant(p);
        }
        return (p == this) || axMere || axPere;
    }

    //Distance d'ascendance entre this et p
    public int distanceDAscendance(Personne p) {
        int dm = 0;
        int dp = 0;
        if (p == this) {
            return 0;
        }    
        if ((!this.possedeCommeAscendant(p)) && !(p.possedeCommeAscendant(this))) {
            return -1;
        }
        if (this.mere != null) {
            dm = this.mere.distanceDAscendance(p);
        }
        if (this.pere != null) {
            dp = this.pere.distanceDAscendance(p);
        }
        return 1 + Math.max(dm,dp);
    }

    //Si p est un ascendant direct de this affiche une ligne comme ceci:
    //Jean Dupont, enfant de Jeanne Martin, enfant de Michel Martin
    //JD qui est this et MM qui est p
    //Ce code prend trop de temps car dans if on appelle à chaques fois possedeCommeAscendant
    public void afficheAscendantUn(Personne p) {
        if (p == this) {
            System.out.println(this.prenom + " " + this.nomDeFamille);
        }
        if (this.mere != null && this.mere.possedeCommeAscendant(p)) {
            System.out.println(this.prenom + this.nomDeFamille + "enfant de ");
            this.mere.afficheAscendantUn(p);
        }
        if (this.pere != null && this.pere.possedeCommeAscendant(p)) {
            System.out.println(this.prenom + this.nomDeFamille + "enfant de ");
            this.pere.afficheAscendantUn(p);
        }
    }

    public void afficheAscendantAux (Personne p, String s) {
        if (p == this) {
            System.out.println(s + this.prenom + this.nomDeFamille);
        }
        if (this.mere != null) {
            this.mere.afficheAscendantAux( p, s+this.prenom+this.nomDeFamille+ "enfant de ");
        }
        if (this.pere != null) {
            this.pere.afficheAscendantAux( p, s+this.prenom+this.nomDeFamille+ "enfant de ");
        }
    }




}