public class Entreprise {
    
    private String nom;
    private Cellule premier;
    
    public String getNom() {
        return nom;
    }
    public Cellule getPremier() {
        return premier;
    }
    
    public void setPremier(Cellule premier) {
        this.premier = premier;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Entreprise(String nom, Cellule premier) {
        this.nom = nom;
        this.premier = premier;
    }

    public void affiche() {
        if (this.premier != null) {
            this.premier.affiche();
        }
    }

    public boolean appartient(String n) {
        if (this.premier == null) {
            return false;
        }
        return this.premier.appartient();
    }





}
