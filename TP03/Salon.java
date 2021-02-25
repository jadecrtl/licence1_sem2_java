public class Salon {
    static Utilisateur[] users;
    Message[] msg;

    public void ajouterUtilisateur (Utilisateur user2) {
        
    }

    public boolean estPresent (Utilisateur user1) {
        for (int i=0; i<users.length; i++) {
            if (user1 == users[i]) {
                return true;
            }
            return false;
        }
        return false;
    }

}
