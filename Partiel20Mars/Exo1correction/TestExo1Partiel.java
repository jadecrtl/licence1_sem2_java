public class TestExo1Partiel {
    public static void main (String[] args) {
        Ballon b = new Ballon ("Rouge");
        Ballon c = new Ballon ("Bleu");
        System.out.println("construction du ballon " + b.toString());
        System.out.println("construction du ballon " + c);
        b.souffler();
        b.souffler();
        System.out.println("état après avoir soufflé 2 fois dedans: " + b);
        b.souffler();
        System.out.println("et maintenant voici son état: " + b);
        b.souffler();
        b.souffler();
        b.souffler();
        b.souffler();
        System.out.println("voici son état même si on continue de souffler dedans: " + b);
        c.souffler();
        c.souffler();
        System.out.println("état après avoir soufflé 2 fois dedans: " + c);        
        c.degonfler();
        System.out.println("vérifions qu'il a bien dégonflé: " + c);
        c.faireNoeud();
        c.degonfler();
        System.out.println("le ballon c doit avoir une pression de 1: " + c);
    }
}
