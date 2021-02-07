public class Panier {
    Fruit[] fruits;

    public Panier (Fruit[] f) {
        fruits = f;
    }

    public Panier () {
        fruits = null;
    }

    public Panier (Fruit f, Panier p) {
        fruits = new Fruit[p.taille(p) + 1];
        for (int i = 0; i < p.taille(p); i++) {
            fruits[i] = p.fruits[i];
        }
        fruits[p.taille(p)] = f;
    }

    public static int taille(Panier p) {
        return p.fruits.length;
    }
    
    public static void afficher(Panier p) {
        for (int i = 0; i < p.taille(p); i++) {
            p.fruits[i].afficher(p.fruits[i]);
        }
    }

    public static Panier hybridePanier (Fruit f, Panier p) {
        Fruit[] fruitsHybridation = new Fruit[p.taille(p)];
        for (int i = 0; i < p.taille(p); i++) {
            fruitsHybridation[i] = Fruit.hybridation(f, p.fruits[i]);
            fruitsHybridation[i].afficher(fruitsHybridation[i]);
        }
        Panier resultatHybridation = new Panier(fruitsHybridation);
        return resultatHybridation;
    }

}
