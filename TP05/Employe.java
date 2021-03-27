public class Employe {
    private final String nom;
    private int salaire;

    public Employe (String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String affiche() {
        return this.nom + " gagne: " + this.salaire + " ;";
    }



}