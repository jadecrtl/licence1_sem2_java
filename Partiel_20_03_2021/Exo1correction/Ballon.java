public class Ballon {
    
    public final String couleur;
    public static int pressionMax = 2;
    private int pression;
    private boolean noeudFait;
    private boolean eclate;

    public Ballon (String c) {
        this.couleur = c;
        pression = 0;
        noeudFait = false;
        eclate = false;    
    }

    public String toString() {
        return couleur + " " + (noeudFait?"noué ":"ouvert ") + (eclate?"éclaté ":"bon état ") + "pression :" + pression;
    }

    //A faire : souffler, degonfler, faireNoeud, eclater et inutilisable

    public boolean inutilisable() {
        return noeudFait || eclate;
    }

    public void souffler() {
        if(this.inutilisable()){
            return; 
        }
        else{
            pression++;
        }
        if(this.pression > Ballon.pressionMax) {
            this.eclater();
        }
    }

    public void degonfler() {//ne s'applique qu'à des ballons en bon état et non noués
        if(this.inutilisable() || pression == 0) {//de plus la pression ne peut diminuer que si elle est positive
            return;
        }
        else {
            pression--;
        }
    }

    /* On peut décider de laisser l'utilisateur faire un noeud, que le ballon soit éclaté ou non, qu'il y ait déjà un noeud ou pas et on ne fait pas plusieurs noeud, s'il y avait déjà un noeud, cette opération ne change rien 
    */
    public void faireNoeud() {
        this.noeudFait = true;
    }

    public void eclater() {
        this.eclate = true;
        pression = 0;//il faut penser à dégonfler le ballon crevé
    }



}