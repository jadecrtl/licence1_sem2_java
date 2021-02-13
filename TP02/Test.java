public class Test {
    public static void main (String[] args) {

        //Exercice 1

        Etudiant e1 = new Etudiant ("Luke", "Skywalker", 8.25);
        Etudiant e2 = new Etudiant ("Leia", "Organa", 11.75);
        Etudiant e3 = new Etudiant ("Jade", "Cortial", 18);
        System.out.println("nb d'etudiants: "+Etudiant.getNombreEtudiants);
            //nb d'etudiants: 3
        System.out.println("Somme des notes: "+Etudiant.sommeDesNotes);
            //somme des notes: 38
        e1.afficher();//Skywalker Luke: 8.25
        e2.afficher();//Organa Leia: 11.75

        System.out.println(e1.estAdmis());//Renvoie false
        System.out.println(e2.estAdmis());//Renvoie true
        System.out.println(Etudiant.moyenne());

        System.out.println(e1.meilleurQueLaMoyenne());
        System.out.println(e3.meilleurQueLaMoyenne());

        e2.modifierNote(19.5);
        e2.afficher();
            //Organa Leia: 19.5
        System.out.println("moyenne: "+Etudiant.moyenne());

        //Exercice 2

        Trio trio1 = new Trio (e1, e2, e3);
        trio1.premier().afficher();

    }
}