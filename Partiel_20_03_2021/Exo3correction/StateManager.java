public class StateManager {
    CellState first;
    CellState head;

    public void addnewActionA() {
        addnewAction("actionA");
    }
    public void addnewActionB() {
        addnewAction("actionB");
    }

    private void addnewAction (String name) {
        CellState tmp = new CellState(name);
        if (head != null) {
            head.setNext(tmp);//on oublie ainsi tout ce qui était présent après head
            tmp.setPrev(head);
        }
        else first = tmp;
        head = tmp; //on peut faire cette instruction dans les 2 cas
    }

    public boolean isUndoable() {
        return head != null;
    }

    public boolean isRedoable() {
        return (head == null && first != null) || head.getNext() != null;
    }

    public String getActionBack() {
        //on suppose que le prérequis isUndoable est verifie
        String rep = head.getActionName();
        head = head.getPrev();
        return rep;
    }

    public String getActionForward() {
        //on suppose que le prérequis isRedoable est verifie
        if (head == null) head = first;
        else head = head.getNext();
        return head.getActionName();
    }

    //affiche les actions A, B actuellement effectuees
    public void printToHead() {
        //la position extrême de head peut être null (à gauche)
        if (head == null) System.out.println ("on en est à l'état initial du système");
        else first.printTo(head);
    }
}