public class Cellule {
    private Employe emp;
    private Cellule suivant;

    public Cellule(Employe emp) {
        this.setEmp(emp);
    }

    public Cellule getSuivant() {
        return suivant;
    }

    public void setSuivant(Cellule suivant) {
        this.suivant = suivant;
    }

    public Employe getEmp() {
        return emp;
    }

    public void setEmp(Employe emp) {
        this.emp = emp;
    }

    public Cellule(Employe emp, Cellule suivant) {
        this.setEmp(emp);
        this.setSuivant(suivant);
    }

    public String affiche() {
        if (this.suivant == null) {
            return this.emp.affiche();
        }else {
            return this.emp.affiche()+ this.suivant.affiche();
        }
    }

    public boolean appartient(String n) {
        if (this.suivant == null) {
            return this.emp.getNom().equals(n);
        } else {
            return this.emp.getNom().equals(n) || this.suivant.appartient(n);
        }
        
    }

    public boolean demission (String n) {
        if (this.suivant == null) {
            return false;
        }
        if (!this.suivant.emp.getNom().equals(n)) {
            return this.suivant.demission(n);
        }
        this.setSuivant(this.suivant.suivant);
        return true;
    }

    public boolean augmente (String nom, int montant) {
        if (this.suivant == null) {
            return false;
        }
        if (!this.suivant.emp.getNom().equals(nom)) {
            return this.suivant.augmente(nom, montant);
        }
        this.suivant.getEmp().setSalaire(this.suivant.getEmp().getSalaire()+montant);
        return true;
    }

    public Entreprise choixSalaire (int min, int max, Entreprise entr) {
        Cellule tmp = this;
        while (tmp != null) {
            if (tmp.emp.getSalaire() >= min && tmp.emp.getSalaire() <= max) {
                entr.ajout(tmp.emp);
            }
            tmp = tmp.suivant;
        }
        return entr;
    }

    public boolean croissante() {
        if (this.suivant != null) {
            if (this.emp.getSalaire() > this.suivant.emp.getSalaire()) {
                return false;
            }
            return this.suivant.croissante();
        }
        return true;
    }

    public void ajout(Employe emp) {
        Cellule tmp = this;
        while (tmp.suivant != null) {
            if (tmp.emp.getSalaire() <= emp.getSalaire() && emp.getSalaire() <= tmp.suivant.emp.getSalaire() ) {
                tmp.suivant = new Cellule(emp, tmp.suivant);
                return;
            }
            tmp = tmp.suivant;
        }
        Cellule c3 = new Cellule(emp);
        tmp.suivant = c3;
    }

    public int taille() {
        Cellule tmp = this;
        int res = 0;
        while (tmp != null) {
            res++;
            tmp = tmp.suivant;
        }
        return res;
    }

    public Employe[] tabEmploye() {
        Employe[] tab = new Employe[this.taille()];
        Cellule tmp = this;
        int i = 0;
        while (tmp != null) {
            tab[i] = tmp.getEmp();
            tmp = tmp.suivant;
            i++;
        }
        return tab;
    }

    public boolean augmente_version_1(String nom, int montant) {
        if (this.suivant == null) {
            return false;
        }else if (this.suivant.emp.getNom().equals(nom) && montant>0){
            this.suivant.emp.setSalaire(this.suivant.emp.getSalaire()+montant);
            Employe tmp = this.suivant.getEmp();
            this.demission(nom);
            this.ajout(tmp);
            return true;
        }
        return this.suivant.augmente_version_1(nom, montant);
    }




}
