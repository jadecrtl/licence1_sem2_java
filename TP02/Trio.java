public class Trio {
    Etudiant[] membres;
    public Trio(Etudiant e1, Etudiant e2, Etudiant e3) {
        this.membres = new Etudiant[3];
        membres[0]=e1;
        membres[1]=e2;
        membres[2]=e3;
    }

    public Etudiant premier() {
        int meilleur = 0;
        for (int i=1; i<3; i++) {
            if (membres[meilleur].note < membres[i].note) {
                meilleur = i;
            }
        }
        return membres[meilleur];
    }

    public int classement(String prenom, String nom) {
        Etudiant eleve1 = membres[0];
        if (membres[1].note > eleve1.note) {
            eleve1 = membres[1];
        }
        else if(membres[2].note > eleve1.note) {
            eleve1 = membres[2];
        }
        return 0;
    }

    public double moyenne() {
        return 0;
    }

    public boolean meilleurQueLaMoyenne() {
        return false;
    }


}
