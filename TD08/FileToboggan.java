public class FileToboggan {
    private Cellule courant;
    private int nbMax;
    public FileToboggan (int nbMax) {
        this.setNbMax(nbMax);
        this.courant = null;
    }    
    public int getNbMax() {
        return nbMax;
    }
    public void setNbMax(int nbMax) {
        this.nbMax = nbMax;
    }
    public Cellule getCourant() {
        return courant;
    }
    public void setCourant(Cellule courant) {
        this.courant = courant;
    }
    public void ajouter (String nom, int nb) {
        Enfant e = new Enfant (nom);
        e.setNb(nb);
        if (this.courant == null) {
            this.courant = new Cellule(e);
        } else {
            this.courant.ajouter(e);
        }
    }
    public void supprimer (String nom) {
        if (this.courant == null) {
            System.out.println("La liste est vide donc il n'y a rien à supprimer");
        }
        else if (this.courant.getEnfant().getNom().equals(nom)) {
            if (this.courant == this.courant.getSuivant()) {
                this.courant = null;
            } else {
                this.courant.getSuivant().setPrecedent(this.courant.getPrecedent());
                this.courant.getPrecedent().setSuivant(this.courant.getSuivant());
                this.courant = this.courant.getSuivant();
            }
        }else {
            this.courant.supprimer(nom);
        }
    }
    public void affiche() {
        if (this.courant == null) {
            System.out.println("( )");
            return;
        }
        this.courant.affiche();
    }
    public Enfant unTour() {
        if (this.courant == null) {
            return null;
        }
        Enfant e = this.courant.getEnfant();
        e.setNb(e.getNb()+1);
        if (e.getNb() >= nbMax) {
            supprimer(e.getNom());
            return (e);
        }else {
            this.courant = this.courant.getSuivant();
            return null;
        }
    }



}
