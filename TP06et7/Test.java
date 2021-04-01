public class Test {
    public static void main (String[] args) {
        Automate first = new Automate();
		Automate second = new Automate("-----#-----");
		Automate third = new Automate("###-#-#--#-");
		
		first.initialisation();
		first.affiche();
		first.prochainEtat();
		first.miseAJour();
		System.out.println();
		first.uneEtape();
		first.affiche();
		first.nEtapes(4);
		
		System.out.println("==========================");
		
		second.nEtapes(10);
		
		System.out.println("==========================");
		
		third.nEtapesMaj(4);

    }
}
