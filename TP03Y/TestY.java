
public class Test {
	public static void main(String[] args) {
		Utilisateur u4 = new Utilisateur("Jean","aligator56","a");
		Utilisateur u3 = new Utilisateur("Marine","trivial14","a");
		Utilisateur u2 = new Utilisateur("Olivier","confiture74","a");
		Utilisateur u1 = new Utilisateur("Yacine","maison1234","yacine@gmail.com");
		Messagerie m1 = new Messagerie("Bonjour ça va ?",u1);
		Messagerie m2 = new Messagerie("Oui super",u2);
		Messagerie m3 = new Messagerie("Bien et toi ?",u3);
		Messagerie m4 = new Messagerie("Tranquille",u4);
		Messagerie m5 = new Messagerie("ça vous dit un pique-nique ?",u1);
		Utilisateur[] u = new Utilisateur[6];
		u[0] = u1; u[1] = u2; u[2] = u3;
		Messagerie[] m = new Messagerie[6];
		m[0] = m1; m[1] = m2 ; m[2] = m3 ;
		Messagerie[] p = new Messagerie[6];
		p[0] = m1; p[1] = m2 ; p[2] = m3 ; p[3] = m4; p[4] = m5 ;
		Salon s = new Salon(m,u,3,3);
		Salon canape = new Salon(p,u,3,5);
		Salon detente = new Salon(p,u,3,5);
		Salon[] chat = new Salon[5];
		chat[0] = s; chat[1] = canape ;
		Chat c = new Chat();
		s.ajouterUtilisateur(u4);
		s.ajouterMessage(m4);
		c.ajouterSalon(s);
		c.ajouterSalon(canape);
		c.ajouterSalon(detente);
		System.out.println(c.estPresent(u1));
		System.out.println(c.nombreMessages(u1));
		System.out.println(c.bavard().getPseudonyme());
		System.out.println(u1.testMotDePasse("maison1234"));
		u1.changerMotDePasse("maison1234", "pomme4567");
		System.out.println(u1.testMotDePasse("maison1234"));
		System.out.println(u1.getPseudonyme());
		u1.setPseudonyme("Junior");
		System.out.println(u1.getPseudonyme());
		s.afficher();
		s.exclusUtilisateur(u1);
		s.afficher();
		
	}
}
