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
            return this.emp.getNom();
        }else {
            return this.emp.getNom()+ this.suivant.affiche();
        }
    }

    public boolean appartient(String n) {
        if (this.suivant.emp.getNom().equals(n)) {
            return true;
        }
        return false;
    }



}
