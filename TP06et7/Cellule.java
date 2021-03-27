public class Cellule {
    private Cellule precedente;
    private Cellule suivante;
    private boolean noire;

    public Cellule getPrecedente() {
        return this.precedente;
    }
    public void setPrecedente (Cellule precedente) {
        this.precedente = precedente;
    }
    public Cellule getSuivante() {
        return this.suivante;
    }
    public void setSuivante (Cellule suivante) {
        this.suivante = suivante;
    }
    public boolean getNoire() {
        return this.noire;
    }
    public void setNoire (boolean noire) {
        this.noire = noire;
    }

    public Cellule (boolean noire) {
        this.precedente = null;
        this.suivante = null;
        this.noire = noire;
    }
    

}