public class Enfant {
    private String nom;
    private int nb;
    public Enfant (String nom) {
        this.setNom(nom);
        this.setNb(0);
    }
    public int getNb() {
        return nb;
    }
    public void setNb(int nb) {
        this.nb = nb;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void affiche() {
        System.out.println(this.nom+" a glissé "+this.nb+" de fois.");
    }
    
}