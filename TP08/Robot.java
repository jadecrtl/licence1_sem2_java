public class Robot {
    private static int nbRob = 0;
    private int id;
    private int np;
    
    public Robot (char nom, String texte) {
        this.id = Integer.valueOf(nom);
        this.np = texte.length();
        nbRob++;
    }
    public int getNbRob () {
        return nbRob;
    }
    public int getId () {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }
    public int getNp () {
        return np; 
    }
    public void setNp (int np) {
        this.np = np;
    }
    public int parle (int n) {
        System.out.println("J'ai prononcé " + n + " lettres du textes.");
        return this.np -= n;    
    }

    public boolean finiDeParler() {
        if (this.np <=0) {
            return true;
        }
        return false;
    }

    public void description() {
        System.out.println("Le nom du robot est : "+this.id);
    }



}