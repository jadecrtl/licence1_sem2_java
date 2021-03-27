public class Test {
    public static void main (String[] args) {
        Liste a = new Liste();
        Element e2 = new Element (6, null, null);
        Element e = new Element (3, e2, null);
        a.afficher();
    }
}
