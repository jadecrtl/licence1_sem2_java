public class Cellule {
    private Enfant enfant;
    private Cellule suivant;
    private Cellule precedent;
    public  Cellule (Enfant e) {
        this.setEnfant(e);
        this.suivant = this;
        this.precedent = this;
    }
    public Enfant getEnfant() {
        return enfant;
    }
    public void setEnfant(Enfant enfant) {
        this.enfant = enfant;
    }
    public Cellule getSuivant() {
        return this.suivant;
    }
    public void setSuivant(Cellule suivant) {
        this.suivant = suivant;
    }
    public Cellule getPrecedent() {
        return this.precedent;
    }
    public void setPrecedent(Cellule precedent) {
        this.precedent = precedent;
    }
    public void ajouter (Enfant e) {
        Cellule c = new Cellule(e);
        c.suivant = this;
        c.precedent = this.precedent;
        this.precedent.suivant = c;
        this.precedent = c; 
    }
    public void supprimer (String nom) {
        Cellule tmp = this.suivant;
        while (tmp != this) {
            if (tmp.enfant.getNom().equals(nom)) {
                tmp .suivant.precedent = tmp.precedent;
                tmp.precedent.suivant = tmp.suivant;
                return;
            }else {
                tmp = tmp.suivant;
            }
        }
    }
    public void affiche() {
        this.enfant.affiche();
        Cellule tmp = this.suivant;
        while (tmp != this) {
            tmp.enfant.affiche();
            tmp = tmp.suivant;
        }
    }

}
