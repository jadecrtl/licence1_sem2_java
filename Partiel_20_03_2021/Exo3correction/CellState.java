public class CellState {
    private CellState prev;
    private CellState next;
    private final String actionName;
    public CellState (String n) { 
        actionName = n;
        prev = null;
        next = null;
    }

    public void setNext(CellState x) {
        next = x;
    }
    public void setPrev(CellState x) {
        prev = x;
    }
    public CellState getNext() {
        return next;
    }
    public CellState getPrev() {
        return prev;
    }

    public String getActionName() {
        return actionName;
    }

    public void printTo (CellState stop) {
        CellState aux = this;
        do {
            System.out.print(actionName + " ");
            aux = aux.next;
        }while (aux != stop);
        //affichage pour stop compris: il manque un
        System.out.print(actionName);
    }






}
