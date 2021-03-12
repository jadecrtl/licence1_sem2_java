public class Groupe {
    private Cellule chefDeFile;

    public Cellule getChefDeFile() {
        return chefDeFile;
    }

    public void setChefDeFile(Cellule chefDeFile) {
        this.chefDeFile = chefDeFile;
    }

    public Groupe () {
        this.chefDeFile = null;
    }

    public Groupe (Cellule c) {
        this.chefDeFile = c;
    }

    public void prendreTete(Robot r) {
        if (r.nomCorrect()) {
            Cellule newC = new Cellule(r);
            if (this.chefDeFile != null) {
                newC.setSuivant(this.chefDeFile);
                this.chefDeFile = newC;
            }
            else {
                this.chefDeFile = newC;
            }
        }
    }

    public void affiche() {
        if (!(this.chefDeFile == null)) {
            this.chefDeFile.afficher();
        }else {
            System.out.println("le groupe est vide");
        }
    }

    public void ajouterNouveau(Robot r) {
        if (!(r.nomCorrect())) {
            System.out.println("Le nom n'est pas valide.");
            return;
        }
        if (this.chefDeFile == null) {
            prendreTete(r);
        }else {
            this.chefDeFile.afficherNouveau(r);
        }
    }

    public int numerologie() {
        if (this.chefDeFile != null) {
            return this.chefDeFile.numerologie();
        }else {
            return 0;
        }
    }

    public String bandName() {
        if (this.chefDeFile != null) {
            return this.chefDeFile.bandName();
        }else {
            return "";
        }
    }

    public void chantez() {
        if (this.chefDeFile != null) {
            this.chefDeFile.chantez();
        }
    }

    Groupe couperAPartirDe (char nom) {
        if (this.chefDeFile != null) {
            Groupe g =  new Groupe (this.chefDeFile.couperAPartirDe(nom));
            return g;
        }
        return null;
    }

    Groupe prendrePause() {
        if (this.chefDeFile != null) {
            Groupe g =  new Groupe (this.chefDeFile.couperAPartirDe(nom));
            return g;            
        }
        return null;
    }



}
