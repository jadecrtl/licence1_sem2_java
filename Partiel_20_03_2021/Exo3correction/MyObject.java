public class MyObject {
    private StateManager sm;
    public MyObject() {
        sm = new StateManager();
    }

    public void faitA() {
        this.realiseA();
        sm.addnewActionA();
    }
    //public void faitB(){...}
    private void realiseA(){
        System.out.println("A est realise");
    }
    private void defaitA(){
        System.out.println("A est defait");
    }
    private void realiseB(){
        System.out.println("B est realise");
    }
    private void defaitB(){
        System.out.println("B est defait");
    }

    public void undo() {
        if (sm.isUndoable()) {
            String action = sm.getActionBack();
            switch(action) {
                case "actionA" : defaitA(); break;
                case "actionB" : defaitB(); break;
                default : break;
            }
        }
    }

    public void redo() {
        if (sm.isRedoable()) {
            String action = sm.getActionForward();
            switch(action) {
                case "actionA" : realiseA(); break;
                case "actionB" : realiseB(); break;
                default : break;
            }
        }
    }


    
}
