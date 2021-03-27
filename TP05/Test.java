public class Test {
    
    public static void main(String[] args) {
        Employe emp = new Employe("Jade", 4200);
        Employe emp2 = new Employe("Rayana", 5200);
        Employe emp3 = new Employe("Yacine", 3000);
        Employe emp4 = new Employe("Paris", 4000);
        Cellule c = new Cellule(emp);
        Cellule c2 = new Cellule(emp2,c);
        Entreprise f = new Entreprise("Webedia", c);
        f.affiche();
        System.out.println(f.appartient("Jade"));
        System.out.println(f.appartient("Rayana"));
        //f.ajout(emp2);
        System.out.println(f.appartient("Rayana"));
        f.affiche();
        //f.demission(emp2.getNom());
        System.out.println(f.appartient("Rayana"));
        f.augmente("Jade", 1000);
        f.affiche();
        //f.ajout(emp3);
        //f.ajout(emp4);
        f.affiche();
        f.choixSalaire(3000, 5000).affiche();
        System.out.println(f.croissante());
        //f.demission("Yacine");
        f.ajout(emp3);
        f.ajout(emp4);
        f.affiche();
        Employe e = new Employe("Julien", 3100);
        Employe e2 = new Employe("Fabien", 1100);        
        Entreprise f2 = new Entreprise("Google");
        f2.ajout(e);
        f2.ajout(e2);
        f2.affiche();
        f.acquisition_version_1(f2);
        f.affiche();
    }



}
