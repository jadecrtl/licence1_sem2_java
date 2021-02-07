public class Fruit {
    public String nom; //le nom du fruit
    public int poids; //le poids du fruit en grammes

    public Fruit (String n, int p) {
        this.nom = n;
        this.poids = p;
    }

    public static void afficher (Fruit f) {
        System.out.println("Ce fruit est un(e) "+ f.nom +" et pèse "+ f.poids +" grammes.");
    } 

    public static Fruit hybridation (Fruit f1, Fruit f2) {
          String nouveauNom = f1.nom+f2.nom;    
          int nouveauPoids= f1.poids+f2.poids;
          Fruit a = new Fruit(nouveauNom,nouveauPoids);
          return a;
    }

}