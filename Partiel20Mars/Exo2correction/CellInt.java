public class CellInt {
    private int val;
    private CellInt next;
    
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public CellInt getNext() {
        return next;
    }
    public void setNext(CellInt next) {
        this.next = next;
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
        if (next == null) {
            return rep;
        }
        else {
            return rep + " ; " + next.toString();
        }
    }

    public void calculateValeur() {
        if (next != null) {
            this.val += next.val;
            next.calculateValeur();
        }
    }




}
