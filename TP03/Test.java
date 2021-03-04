public class Test {
    public static void main (String[] args) {
        //On crée les utilisateurs
        Utilisateur Jade = new Utilisateur("Jadouu", "mdp", "jadecortial@gmail.com");
        Utilisateur Bob = new Utilisateur("Booooob", "mdp1", "bobbob@gmail.com");
        Utilisateur Catherine = new Utilisateur("Cat", "mdp2", "catcat@gmail.com");
        Utilisateur David = new Utilisateur("Daviiiid", "mdp3", "dada@gmail.com");
        
        //On crée par la suite les messages des utilisateurs
        Message sms1 = new Message(Jade, "Bonjour qui est dispo demain?");
        Message sms2 = new Message(Bob, "Moi je peux!");
        Message sms3 = new Message(Catherine, "Je pourrai pas, une autre fois peut-être.");
        Message sms4 = new Message(David, "Il faut que je vois mais normalement oui!");
        Message sms5 = new Message(Jade, "Top eh bien on se rejoindra comme prévu!");

        //On crée maintenant les tableaux d'utilisateurs et de messages pour les salons de discussions
        Utilisateur[] user = new Utilisateur[4];
        user[0] = Jade; user[1] = Bob; user[2] = Catherine;
        Message[] k = new Message[5];
        k[0] = sms1; k[1] = sms2; k[2] = sms3;
        Message[] p = new Message[5];
        p[0] = sms1; p[1] = sms2; p[2] = sms3; p[3] = sms4; p[4] = sms5;

        //Créations des salons
        Salon s = new Salon(user, k, 3, 3);
        Salon s2 = new Salon(user, p, 3, 5);
        Salon[] chat = new Salon[2];
        chat[0] = s; chat[1] = s2;
        Chat c = new Chat();

        //Vérifications des méthodes
        s.ajouterUtilisateur(David);
        s.ajouterMessage(sms4);
        c.ajouterSalon(s);
        c.ajouterSalon(s2);
        System.out.println(Jade.testMotDePasse("mdp"));//doit renvoyer true
        System.out.println(Jade.testMotDePasse("mdr"));//doit renvoyer false
        System.out.println(Jade.changerMotDePasse("mdp", "mdp2"));//renvoie mdp2
        System.out.println(c.estPresent(Jade));
        System.out.println(c.nombreMessages(Jade));
        System.out.println(c.bavard().getPseudonyme());
        s.afficher();
        s.excluUtilisateur(Jade);
        s.afficher();
    }
}
