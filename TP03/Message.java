public class Message {
    private final Utilisateur user1;
    private String message;

    public Message (Utilisateur user1, String message) {
        this.user1 = user1;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    public Utilisateur getUser1() {
        return this.user1;
    }

}
