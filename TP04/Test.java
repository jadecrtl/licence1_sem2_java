public class Test {
    public static void main (String[] args) {
        Robot r = new Robot ('a', "Je m'appelle Nono le robot");
        Robot r2 = new Robot ('b', "Je m'appelle Nono2 le robot");
        Robot d2 = new Robot ('c', "Je m'appelle Nono3 le robot");
        Groupe g = new Groupe();
        g.prendreTete(r);
        g.prendreTete(r2);
        g.ajouterNouveau(d2);
        g.affiche();
        System.out.println(g.numerologie());
        System.out.println(g.bandName());
        d2.chante();
        g.chantez();
    }
}
