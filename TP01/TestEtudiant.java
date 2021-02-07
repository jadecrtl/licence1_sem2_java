public class TestEtudiant {
    public static void main (String[] args){
        Etudiant a = new Etudiant ("Cortial", "Jade", 22007013, 22);
        Etudiant b = new Etudiant ("Cortial", "Jade", 22007014, 9);
        Etudiant c = new Etudiant ("Cortial", "Jade", 22007013, 12);
        Etudiant d = new Etudiant ("Cortial", "Jade", 22007014, 15);
        Etudiant e = new Etudiant ("Cortial", "Jade", 22007013, 17);
        Etudiant f = new Etudiant ("Cortial", "Jade", 22007014, 14);
        Etudiant g = new Etudiant ("Cortial", "Jade", 22007013, 1);
        Etudiant h = new Etudiant ("Cortial", "Jade", 22007014, 10);
        
        Etudiant.afficher(a);

        testAdmis(a, false);
        testAdmis(b, false);
        testAdmis(c, true);
        testAdmis(d, true);
        testAdmis(e, true);
        testAdmis(f, true);
        testAdmis(g, false);
        testAdmis(h, true);

        testMention(a, "Note invalide");
        testMention(b, "Ajourné");
        testMention(c, "");
        testMention(d, "Bien");
        testMention(e, "Très bien");
        testMention(f, "");
        testMention(g, "Ajourné");
        testMention(h, "Passable");


    }
    public static boolean testAdmis(Etudiant etu, boolean resultatAttendu) {
        if (Etudiant.estAdmis(etu) == resultatAttendu ){
            System.out.println("Test OK");
            return true;
        }
        else {
            System.out.println("!!!!!!! Test KO : estAdmis = " + etu.note + " ne correspond pas au test envoyé (" + resultatAttendu + ").");
            Etudiant.afficher(etu);
            return false;
        }
    }

    public static boolean testMention(Etudiant etu, String resultatAttendu) {
        if (Etudiant.mention(etu) == resultatAttendu) {
            System.out.println("Test OK");
            return true;
        } else {
            System.out.println("!!!!!!! Test KO : mention = " + Etudiant.mention(etu) + " ne correspond pas au test envoyé ("+ resultatAttendu + ").");
            Etudiant.afficher(etu);
            return false;
        }
    }
}
