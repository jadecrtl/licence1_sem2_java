public class Message {
    Utilisateur user1;
    private String message;

    Message (Utilisateur user1, String message) {
        this.user1 = user1;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String afficher() {
        return (user1.getPseudonyme()+": "+getMessage());
    }

}
