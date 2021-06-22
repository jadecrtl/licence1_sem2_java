public class CellInt {
    private int val;
    private CellInt next;
    
    public CellInt getNext() {
        return next;
    }

    public CellInt (int i) {
        this.val = i;
        next = null;
    }

    public CellInt (int i, CellInt s) {
        this.val = i;
        next = s;
    }

    public String toString() {
        String rep = "" + val;
        if (next == null) return rep;
        else return rep + " ; " + next.toString();
    }

    public void calculateValeur() {//de façon récursive
        //Première chose : penser aux cas d'arrêts
        if (next != null) {
            this.val += next.val;//attention aux cas limite
            next.calculateValeur();
        }
    }

    public void cutPointe() {//methode itérative
        //lors de l'appel this n'est pas le maximum
        //le même raisonnement sur le nombre de cellule à la limite tient toujours
        CellInt aux = this;
        while (aux.next.next.val > aux.next.val) aux = aux.next;
        //condition de sortie :
        //la cellule next porte une valeur >= à sa suivante
        //cette condition de sortie arrive toujours car la structure de notre ligne
        //est d'abord croissante avant d'être décroissante.
        if (aux.next.val == aux.next.next.val) aux.next = aux.next.next.next;
        else aux.next = aux.next.next;
    }

    public void cutPointeRec() {//methode récursive
        //invariant : this n'est pas le maximum
        //il a au moins un élément plus grand strict (peut-être 2) et il a un symétrique
        //donc si on parcours de gauche à droite, il reste au moins 2 éléments
        //(3 dans le cas où le max est dédoublé) après this.
        if (next.val >= next.next.val) {
            if (next.val == next.next.val) {
                this.next = next.next.next;
            }
            else this.next = next.next;
        }
        else next.cutPointeRec();
    }



}
