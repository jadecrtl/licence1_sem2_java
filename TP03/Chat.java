public class Chat {
    private static int max = 10;
    private Salon[] conversation;
    private int nombreSalon = 0;

    public Chat() {
        this.conversation = new Salon[max];
    }

    public void ajouterSalon(Salon newS) {
        if (nombreSalon < this.conversation.length) {
            this.conversation[nombreSalon] = newS;
            nombreSalon++;
        }
    }

    public boolean estPresent(Utilisateur user) {
        for (int i=0; i<this.nombreSalon; i++) {
            if (this.conversation[i].estPresent(user)) {
                return true;
            }
        }
        return false;
    }

    public int msgDansUnSalon(Salon s, Utilisateur user) {
        int p = 0;
        for (int i=0; i<s.getNombreMsg(); i++) {
            if (s.getMsg()[i].getUser1() == user) {
                p++;
            }
        }
        return p;
    }

    public int nombreMessages(Utilisateur user) {
        int res = 0;
        for (int i=0; i<this.nombreSalon; i++) {
            res = res + msgDansUnSalon(this.conversation[i], user);
        }
        return res;
    }

    public Utilisateur interBavard(Salon s) {
        Utilisateur res = s.getUsers()[0];
        for (int i=1; i<s.getUsers().length; i++) {
            if (nombreMessages(res) < nombreMessages(s.getUsers()[i])) {
                res = s.getUsers()[i];
            }
        }
        return res;
    }

    public Utilisateur bavard() {
        Utilisateur end = null;
        for (int i=0; i<this.nombreSalon; i++) {
            end = interBavard(this.conversation[i]);
        }
        return end;
    }

}
