public class Etudiant {
    final String prenom; //le prénom
    final String nom; //le nom et
    double note; //la note de l'etudiant (sur 20)


    //*****réponse à la question 2 *****
    //Les attributs prenom et nom resteront inchangé peu importe ce qu'il se passe dans le code
    //Le mot clé final signifie que l'attribut ne pourra plus être modifié.

    private static int nombreEtudiants = 0; //le nombre d'etudiants dans la promo
    static double sommeDesNotes = 0; //la somme des notes des étudiants
	public static String getNombreEtudiants;

    public static int getNombreEtudiant() {
        return nombreEtudiants;
    }

    public Etudiant (String prenom, String nom, double note) {
        this.prenom = prenom;
        this.nom = nom;
        this.note = note;
        nombreEtudiants++;
        sommeDesNotes += note;
    }

    public void afficher() {
        System.out.println(this.nom+" "+this.prenom+": "+this.note);
    }

    public boolean estAdmis() {
        if (this.note < 10) {
            return false;
        }
        else {
            return true;
        }
    }

    public static double moyenne() {
        return sommeDesNotes/nombreEtudiants;        
    }

    public boolean meilleurQueLaMoyenne() {
        if (this.note > Etudiant.moyenne()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void modifierNote(double nouvelleNote) {
        sommeDesNotes = sommeDesNotes - this.note + nouvelleNote;
        this.note = nouvelleNote;
    }

}
