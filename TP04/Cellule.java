public class Cellule {
    private Robot rob;
    private Cellule suivant;

    public Robot getRob() {
        return rob;
    }

    public Cellule getSuivant() {
        return suivant;
    }

    public void setSuivant(Cellule suivant) {
        this.suivant = suivant;
    }

    public void setRob(Robot rob) {
        this.rob = rob;
    }

    public Cellule(Robot rob, Cellule suivant) {
        this.rob = rob;
        this.suivant = suivant;
    }

    public Cellule(Robot rob) {
        this(rob, null);
    }

    public void afficher() {
        Cellule tempo = this;
        while (tempo != null) {
            System.out.println(tempo.rob.description());
            tempo = tempo.suivant;
        }
    }

    public void afficherNouveau(Robot r) {
        Cellule tempo = this;
        while (tempo.suivant != null) {
            tempo = tempo.suivant;
        }
        tempo.suivant = new Cellule(r);
    } 

    public static int charToInt (char valeur) {
        return (int)valeur - (int)'a' + 1;
    }

    public int numerologie() {
        int res = 0;
        Cellule tmp = this;
        while (tmp != null) {
            res = (res + charToInt(tmp.rob.getNom())) % 9;
            tmp = tmp.suivant;
        }
        return res;
    }

    public String bandName() {
        String nom = "";
        Cellule tmp = this;
        while (tmp != null) {
            nom += tmp.rob.getNom();
            tmp = tmp.suivant;
        }
        return nom;
    }

    public void chantez() {
        Cellule tmp = this;
        while (tmp != null) {
            tmp.rob.chante();
            tmp = tmp.suivant;
        }
    }

    Cellule couperAPartirDe(char nom) {
        Cellule tmp = this;
        Cellule nouveauChef = null;
        while (tmp != null) {
            if (tmp.rob.getNom() == nom) {
                nouveauChef = new Cellule(tmp.rob);
            }
            tmp = tmp.suivant;
        }
        return nouveauChef;
    }

    Cellule prendrePause() {
        Cellule tmp = this;
        while (tmp != null) {
            if (tmp.rob.getEnergie() == 0) {
                tmp = tmp.suivant;
            }
        }
        return tmp;
    }

    
}
