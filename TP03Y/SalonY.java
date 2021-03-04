
public class Salon {
	private Messagerie[] ordreMsg;
	private Utilisateur[] participants;
	private int nbParticipants;
	private int nbMsg;
	public Object getOrdreMsg;
	
	public Salon(Messagerie[] ordreMsg, Utilisateur[] participants, int nbParticipants, int nbMsg) {
		this.ordreMsg = ordreMsg;
		this.participants = participants;
		this.nbParticipants = nbParticipants;
		this.nbMsg = nbMsg;
	}
	
	public Utilisateur[] getParticipants() {
		return this.participants;
	}
	
	public Messagerie[] getOrdreMsg() {
		return this.ordreMsg;
	}
	public int getNbMsg() {
		return this.nbMsg;
	}
	
	public void ajouterUtilisateur(Utilisateur u) {
		if (this.nbParticipants < this.participants.length) {
			this.participants[nbParticipants] = u;
			this.nbParticipants++;
		}
	}
	
	public boolean estPresent(Utilisateur u) {
		for(int i = 0 ; i <  this.participants.length ; i++) {
			if(u.equals(this.participants[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void ajouterMessage(Messagerie m) {
		if(estPresent(m.getSignature()) && this.nbMsg < this.ordreMsg.length) {
			this.ordreMsg[nbMsg] = m;
			this.nbMsg++;
		}
	}
	
	public void afficher() {
		for(int i = 0 ; i < this.nbMsg ; i++) {
			System.out.println(this.ordreMsg[i].getSignature().getPseudonyme()+" : "+this.ordreMsg[i].getMsg());
		}
	}
	
	public void exclusUtilisateur(Utilisateur u) {
		int k = 0;
		Utilisateur[] tab = new Utilisateur[this.participants.length];
		Messagerie[] mes = new Messagerie[this.ordreMsg.length];
		for(int i=0 ; i < this.nbParticipants; i++) {
			if(this.participants[i] != u) {
				tab[k] = this.participants[i];
				k++;
			}
		}
		k = 0 ;
	    for(int i = 0 ; i < this.nbMsg; i++) {
	    	if(this.ordreMsg[i].getSignature() != u) {
	    		mes[k] = this.ordreMsg[i];
	    		k++;
	    	}
	    }
	    this.participants = tab ;
	    this.ordreMsg = mes ;
	    this.nbParticipants--;
	    this.nbMsg--;
	}
}
