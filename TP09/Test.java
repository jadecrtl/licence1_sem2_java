public class Test {
    public static void main ( String [] args ){
        Noeud a = new Noeud (6 , null , new Noeud (8));
        Noeud b = new Noeud (9 , new Noeud (2) , a );
        Noeud c = new Noeud (5 , b , null );
        Noeud d = new Noeud (1 , new Noeud (4) , null );
        Noeud e = new Noeud (7 , new Noeud (0) , d );
        Noeud f = new Noeud (3 , c , e );
        Arbre g = new Arbre ( f );

        System.out.println("Infixe de g:");
        g . afficheInfixe ();
        
        System.out.println("Prefixe de g:");
        g . affichePrefixe ();
        
        System.out.println("Suffixe de g:");
        g . afficheSuffixe();
        
        System.out.println("Nombre de noeuds: " + g.nbDeNoeuds());
        
        System.out.println("Somme: " + g.somme());
        
        System.out.println("Profondeur: " + g.profondeur());
        
        System.out.println("contient 8: " + g.recherche(5));
        System.out.println("contient 8: " + g.recherche(0));
        System.out.println("contient 10: " + g.recherche(10));

    }
}
