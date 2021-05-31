public class LignePascal {

    private int numLigne;
    private CellInt first;
    
    public int getNumLigne() {
        return numLigne;
    }
    public CellInt getFirst() {
        return first;
    }
    public void setFirst(CellInt first) {
        this.first = first;
    }
    public void setNumLigne(int numLigne) {
        this.numLigne = numLigne;
    }

    public LignePascal() {
        numLigne = 0;
        first = new CellInt(1);
    }

    public String toString() {
        return "Ligne No " + numLigne + " ; " + first.toString();
    }

    public void buildNextLine() {
        numLigne++;
        CellInt old = first;
        first = new CellInt(1, old);
        old.calculateValeur();
    }

    


}