import java.util.ArrayList;

public class Noeud {

    private char c;
    private ArrayList <Noeud> fils;
    
    public char getC() {
        return c;
    }
    public void setC(char c) {
        this.c = c;
    }


    public ArrayList <Noeud> getFils() {
        return fils;
    }
    public void setFils(ArrayList <Noeud> fils) {
        this.fils = fils;
    }

    public Noeud () {
        this.c = ' ';
        this.fils = new ArrayList<Noeud>();
    }

    public Noeud (char c ) {
        this.c = c;
        this.fils = new ArrayList<Noeud>();
    }

    public Noeud aPourEnfant (char a) {
        for (Noeud n : this.fils) {
            if (n.c == c) {
                return n;
            }
        }
        return null;
    }

    public boolean appartient (String w) {
        return this.appartientAux(w.concat("*"));
    }

    public boolean appartientAux (String w) {
        if (this.c != w.charAt(0)) return false;
        if (w.equals("*")) return true;
        for (Noeud n: fils) {
            if (n.c == w.charAt(1)) {
                return n.appartientAux(w.substring(1));
            }
        }
        return false;
    }

    public void ajouteMotAux (String mot) {
        if (this.c != mot.charAt(0)) {
            return;
        }
        if (mot.length() > 1) {
            for (Noeud n: fils) {
                if (n.c == mot.charAt(1)) {
                    n.ajouteMotAux(mot.substring(1));
                }
            }
            return;
        }
        Noeud it = this;
        for (int i=1; i<mot.length(); i++) {
            Noeud nouveau = new Noeud (mot.charAt(i));
            it.fils.add(nouveau);
            it = nouveau;
        }
        Noeud n = new Noeud ('*');
        it.fils.add(n);
    }

}