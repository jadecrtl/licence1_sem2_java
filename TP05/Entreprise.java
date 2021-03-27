public class Entreprise {
    
    private String nom;
    private Cellule premier;
    
    public String getNom() {
        return nom;
    }
    public Cellule getPremier() {
        return premier;
    }
    
    public void setPremier(Cellule premier) {
        this.premier = premier;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Entreprise(String nom, Cellule premier) {
        this.nom = nom;
        this.premier = premier;
    }

    public Entreprise(String nom) {
        this(nom,null);
    }

    public void affiche() {
        if (this.premier != null) {
            System.out.println(this.premier.affiche());
        }
        System.out.println("Pas d'employé dans cette entreprise.");
    }

    public boolean appartient(String n) {
        if (this.premier == null) {
            return false;
        }else if(this.premier.getEmp().getNom().equals(n)){
            return true;
        }
        return this.premier.appartient(n);
    }

    //version initiale de la methode ajout
    /*public void ajout (Employe emp) {
        if (this.premier == null) {
            System.out.println("La liste est vide");
            Cellule c = new Cellule(emp);
            this.setPremier(c);
        }else {
            if (!this.appartient(emp.getNom())) {
                Cellule c2 = new Cellule(emp, this.premier);
                this.setPremier(c2);
            }else {
                System.out.println("Il est déjà dans l'entreprise");
            }
        }  
    }*/
    //version modifié de la methode ajout pour 3.2
    public void ajout (Employe emp) {
        if (this.premier == null) {
            System.out.println("La liste est vide");
            Cellule c = new Cellule(emp);
            this.setPremier(c);
        }else {
            if (this.premier.getEmp().getSalaire() >= emp.getSalaire()) {
                Cellule c2 = new Cellule(emp, this.premier);
                this.setPremier(c2);
            }else {
                this.premier.ajout(emp);
            }
        }
    }


    public void demission(String n) {
        if (!this.appartient(n)) {
            System.out.println("Personne à virer");
        } else if (this.premier.getEmp().getNom().equals(n)){
            this.setPremier(this.premier.getSuivant());
        }else {
            this.premier.demission(n);
        }
    }

    public boolean augmente(String nom, int montant) {
        if (!this.appartient(nom)) {
            return false;
        }else if(this.premier.getEmp().getNom().equals(nom) && montant > 0) {
            this.premier.getEmp().setSalaire(this.premier.getEmp().getSalaire()+montant);
            return true;
        }else {
            return this.premier.augmente(nom,montant);
        }
    }

    public Entreprise choixSalaire (int min, int max) {
        if (this.premier == null) {
            return null;
        } 
        Entreprise entr = new Entreprise("Entreprise", null);
        return this.premier.choixSalaire(min, max, entr);
    }

    public boolean croissante() {
        if (this.premier == null) {
            return false;
        }
        return this.premier.croissante();
    }


    public int taille() {
        if (this.premier == null) {
            return 0;
        }
        return this.premier.taille();
    }



    public void acquisition_version_1 (Entreprise ent) {
        if (ent.premier == null){
            System.out.println("Rien à ajouter.");
            return;
        }
        Employe[] tab = ent.premier.tabEmploye();
        for (int i=0; i<ent.taille(); i++) {
            this.ajout(tab[i]);
        }
    }
    
    public boolean augmente_version_1(String nom, int montant){
        if (!this.appartient(nom)) {
            return false;
        }else if (this.premier.getEmp().getNom().equals(nom) && montant>0){
            this.premier.getEmp().setSalaire(this.premier.getEmp().getSalaire()+montant);
            Employe tmp = this.premier.getEmp();
            this.demission(nom);
            this.ajout(tmp);
            return true;
        }
        return this.premier.augmente_version_1(nom, montant);
    }







}
