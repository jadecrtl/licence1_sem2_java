public class Test {
    
    public static void main (String[] args) {
        Fruit f = new Fruit ("pamplemousse",330);
        Fruit g = new Fruit ("pamplemousse",330);
        Fruit h = f;
        System.out.println("Test Termine");
        Fruit.afficher(f);
        Fruit.afficher(Fruit.hybridation(f,g));
        Fruit.hybridation(f,g);
    }  
    
}

