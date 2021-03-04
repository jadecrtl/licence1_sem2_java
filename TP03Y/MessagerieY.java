
public class Messagerie {
	private String message;
	private final Utilisateur signature;
	
	public Messagerie(String message, Utilisateur signature) {
		this.message = message;
		this.signature = signature;
	}
	
	public Utilisateur getSignature() {
		return this.signature;
	}
	
	public String getMsg() {
		return this.message;
	}
}
