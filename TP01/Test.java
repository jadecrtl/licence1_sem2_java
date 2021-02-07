public class Test {
    
    public static void main (String[] args) {
        Fruit f = new Fruit ("pamplemousse1",330);
        Fruit g = new Fruit ("pamplemousse2",330);
        Fruit h = f;

        Fruit.afficher(f);
        Fruit.afficher(Fruit.hybridation(f,g));

        Fruit[] tableauFruit1 = new Fruit[2];
        tableauFruit1[0] = f;
        tableauFruit1[1] = g;
        Panier panier1 = new Panier (tableauFruit1);

        panier1.taille(panier1);
        System.out.println(panier1.taille(panier1));

        Panier panier2 = new Panier (h, panier1);
        System.out.println(panier2.taille(panier2));
        panier2.afficher(panier2);

        Panier panier3 = new Panier(panier1.fruits);
        panier3.hybridePanier(f, panier1);
        panier3.afficher(panier3);
        System.out.println("Test Termine");
    }  
    


}

