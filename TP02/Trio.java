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
        //on va classer les notes et les ex-aequo ont le même rang 
        int etudiant = chercheEtudiant(prenom, nom);
        if (etudiant == -1) {
            return 0;
        }
        double[] notes = {membres[0].note, membres[1].note, membres[2].note};
        notes = triBulle(notes);
        for (int i=0; i<3; i++) {
            if (membres[etudiant].note == notes[i]) {
                return i+1;
            }
        }
        return 0;
    }
    
    public int chercheEtudiant (String prenom, String nom) {
       for (int i=0; i<3; i++) {
            if (membres[i].prenom == prenom && membres[i].nom == nom) {
                return i;
            }
        }
        return -1; //On a pas trouvé        
    }

    public static double[] triBulle (double[] tab) {
        int permutation = 0;
        for (int i=0; i<tab.length-1; i++) {
            if (tab[i] < tab[i+1]) {
            permuteParIndice(tab, i, i+1);
            permutation++;
            }	    
        }	
        if (permutation == 0) {
           return tab;
        }else {
            triBulle(tab);
        }
        return tab;
    }

    public static double[] permuteParIndice (double[] tab, int indice1, int indice2) {
        double retenue = tab[indice1];
        tab[indice1] = tab[indice2];
        tab[indice2] = retenue;
        return tab;
    }
        
    public double moyenne() {
        double res = 0;
        for (int i=0; i<3; i++) {
            res += membres[i].note;
        }
        return res/3;
    }

    public boolean meilleurQueLaMoyenne() {
        double moyenneDeLaPromo = Etudiant.moyenne();
        double moyenneDuTrio = this.moyenne();
        if (moyenneDeLaPromo < moyenneDuTrio) {
            return true;
        }
        return false;
    }


}
