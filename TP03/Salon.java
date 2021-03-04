public class Salon {
    private Utilisateur[] users;
    private Message[] msg;
    private int nombreMsg;
    private int nombreUsers;

    public Salon (Utilisateur[] users, Message[] msg, int nombreMsg, int nombreUsers) {
        this.users = users;
        this.msg = msg;
        this.nombreMsg = nombreMsg;
        this.nombreUsers = nombreUsers;
    }

    public Utilisateur[] getUsers() {
        return this.users;
    }

    public Message[] getMsg() {
        return this.msg;
    }

    public int getNombreMsg() {
        return this.nombreMsg;
    }


    public void ajouterUtilisateur (Utilisateur user2) {
        if (this.nombreUsers < this.users.length) {
            this.users[nombreUsers] = user2;
            nombreUsers++;
        }
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

    public void ajouterMessage (Message sms) {
        if (estPresent(sms.getUser1()) && this.nombreMsg < this.msg.length) {
            this.msg[nombreMsg] = sms;
            this.nombreMsg++;
        }
    }

    public void afficher() {
        for (int i=0; i<this.nombreMsg; i++) {
            System.out.println(this.msg[i].getUser1().getPseudonyme()+" : "+this.msg[i].getMessage());
        }
    }

    public void excluUtilisateur(Utilisateur u) {
        int p = 0;
        Utilisateur[] tab = new Utilisateur[this.users.length];
        Message[] conv = new Message[this.msg.length];
        for (int i=0; i<this.nombreUsers; i++) {
            if (this.users[i] != u) {
                tab[p] = this.users[i];
                p++;
            }
        }
        p = 0;
        for (int i=0; i<this.nombreMsg; i++) {
            if (this.msg[i].getUser1() != u) {
                conv[p] = this.msg[i];
                p++;
            }
        }
        this.users = tab;
        this.msg = conv;
        this.nombreUsers--;
        this.nombreMsg--;
    }
    
}
