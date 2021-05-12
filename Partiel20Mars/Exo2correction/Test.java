public class Test {
    public static void main (String[] args) {
        LignePascal t;
        t = new LignePascal();
        for (int i=0; i<10; i++) {
            System.out.println(t.toString());
            t.buildNextLine();
        }
        System.out.println(t.toString());
    }
}
