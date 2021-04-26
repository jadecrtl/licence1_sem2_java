public class Test {
    public static void main (String[] args) {
        Noeud n1 = new Noeud ();
        Noeud n2 = new Noeud (n1, null);
        Noeud n3 = new Noeud ();
        Noeud n4 = new Noeud (n3,n2);
        Noeud n5 = new Noeud ();
        Noeud n6 = new Noeud (null,n5);
        Noeud n7 = new Noeud (n6,n4);
        //Arbre a = new Arbre (n7);
        
    } 
}
