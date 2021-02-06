public class Etudiant {
    
    String nom, prenom; //les nom et prenom de l'étudiant
    int num; //le numéro d'étudiant
    int note; //la note de l'étudiant(sur 20)
    
    public Etudiant (String n, String p, int e, int r) {
        nom = n;
        prenom = p;
        num = e;
        if (note<0) {
            note=0;
        }else {
            if (note>20) {
                note=20;
            }else {
                note=r;
            }
        }
    }

    public static void afficher (Etudiant etu) {
        System.out.println ("Nom "+etu.nom+" Prénom "+etu.prenom+" (Numéro d'étudiant "+etu.num+" ) : Note "+etu.note+" .");
    }

    public static boolean estAdmis (Etudiant etu) {
        if (etu.note < 0 || etu.note > 20) {
            return false;
        } else {
            if (etu.note < 10) {
                return false;
            }else {
                return true;
            }
        }
    }

    public static void mention (Etudiant etu) {
        if (etu.note < 0 || etu.note > 20) {
            System.out.println ("Note invalide");
        } else {
            if (etu.note >= 0 && etu.note < 10) {
                System.out.println ("Ajournée");
            }
            if (etu.note >= 10 && etu.note < 12) {
                System.out.println ("Passable");
            }
            if (etu.note >= 12 && etu.note < 14) {
                System.out.println ("Assez bien");
            }
            if (etu.note >= 14 && etu.note < 16) {
                System.out.println ("Bien");
            }
            if (etu.note >= 16 && etu.note <= 20) {
                System.out.println ("Très bien");
            }
        }

    }

}
