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
        System.out.println(Etudiant.estAdmis(a));
        System.out.println(Etudiant.estAdmis(b));
        Etudiant.mention(a);
        Etudiant.mention(b);
        Etudiant.mention(c);
        Etudiant.mention(d);
        Etudiant.mention(e);
        Etudiant.mention(f);
        Etudiant.mention(g);
        Etudiant.mention(h);
    }

}
