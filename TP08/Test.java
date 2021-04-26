public class Test {
    public static void main (String[] args) {
        Robot r = new Robot('5', "Je suis un des robots et plus particulièrement le premier");
        Robot r2 = new Robot('6', "Je suis un des robots et plus particulièrement le deuxième");
        Robot r3 = new Robot('3', "Je suis un des robots et plus particulièrement le troisième");
        Robot r4 = new Robot('1', "Je suis un des robots et plus particulièrement le quatrième");
        TableRonde t = new TableRonde(r);
        TableRonde t2 = new TableRonde(r3);
        t.ajouterRob(r2);
        t2.ajouterRob(r4);
        r.description();
        r2.description();
        r3.description();
        r4.description();

    }    
}
