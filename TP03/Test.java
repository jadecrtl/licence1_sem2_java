public class Test {
    public static void main (String[] args) {
        Utilisateur Jade = new Utilisateur("Jadouu", "mdp", "jadecortial@gmail.com");
        System.out.println(Jade.testMotDePasse("mdp"));//doit renvoyer true
        System.out.println(Jade.testMotDePasse("mdr"));//doit renvoyer false
        System.out.println(Jade.changerMotDePasse("mdp", "mdp2"));//renvoie mdp2
        Message test = new Message(Jade, "J'envoie un message");
        System.out.println(test.afficher());
    }
}
