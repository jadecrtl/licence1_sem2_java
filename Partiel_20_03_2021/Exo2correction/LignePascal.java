public class LignePascal {

    private int numLigne;
    private CellInt first;
    
    public LignePascal() {
        numLigne = 0;
        first = new CellInt(1);//la ligne du triangle de Pascal la plus petite est celle qui contient 1
    }

    public String toString() {//pas la peine de tester si first est null car on ne parle que de lignes valides du triangle
        return "Ligne No " + numLigne + " ; " + first.toString();
    }

    public void buildNextLine() {
        numLigne++;
        CellInt old = first;
        first = new CellInt(1, old);
        old.calculateValeur();
    }

    public void cutPointe() {//peut être appellée plusieurs fois et change la structure de la "liste courante"
        if (first == null) return;
        //Quels sont les cas où first change?
        //Je me contente de tester les cas où il n'y a qu'une cellule ou alors 2.
        //Car dans ce dernier cas, puisque les lignes restent symétriques même après avoir 
        //coupé les pointes, les deux valeurs seront forcément égales on les supprime donc toutes les deux
        if (first.getNext() == null || first.getNext().getNext() == null) first = null;
        else first.cutPointe();//de plus dans ce cas là, first reste dans la liste 
        //potentiellement first sera parmi les candidats pour être prédécesseur des valeurs à supprimer
    }

    


}