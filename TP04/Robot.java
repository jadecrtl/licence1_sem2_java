public class Robot {
    private final char nom; // lettre entre 'a' et'z'
    private int energie;
    private final String texte; // ce qu'il doit dire

    public String getTexte() {
        return texte;
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public char getNom() {
        return nom;
    }

    public Robot(char nom, String paroles) {
        this.nom = nom;
        // on donne une énergie entre 10 et 20
        setEnergie(10 + (int) (Math.random() * 11));
        texte = paroles;
    }

    public String description() {
        return "Robot <"+this.nom+"> dit <"+this.texte+"> quand il parle et a <"+this.energie+"> points d'énergie";
    }

    public boolean nomCorrect () {
        if (this.nom >= 'a' && this.nom <= 'z') {
            return true;
        }
        return false;   
    }

    public static int charToInt (char valeur) {
        return (int)valeur - (int)'a' + 1;
    }

    public void chante() {
        for (int i=0; i<charToInt(this.nom); i++) {
            System.out.println(this.texte);
        }
        this.energie = this.energie - 10;
        if (this.energie < 0) {
            this.energie = 0;
        }
    }

    

}