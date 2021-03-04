
public class Chat {
	private Salon[] discussion ;
	private int nbSalon = 0;
	private static int max = 10 ;
	
	public Chat() {
		this.discussion = new Salon[max];
	}
	
	public void ajouterSalon(Salon s) {
		if(nbSalon < this.discussion.length) {
			this.discussion[nbSalon] = s ;
			nbSalon++;
		}
	}
	
	public boolean estPresent(Utilisateur u) {
		for(int i = 0 ; i < this.nbSalon ;i++) {
			if(this.discussion[i].estPresent(u)) {
				return true;
			}
		}
		return false;
	}
	
	public int msgDansUnSalon(Salon s, Utilisateur u) {
		int k = 0 ;
		for(int i = 0 ; i < s.getNbMsg() ; i++) {
			if(s.getOrdreMsg()[i].getSignature() == u) {
				k++;
			}
		}
		return k ;
	}
	
	public int nombreMessages (Utilisateur u) {
		int res = 0 ;
		for (int i = 0 ; i < this.nbSalon ; i++) {
			res = res + msgDansUnSalon(this.discussion[i], u);
		}
		return res;
	}
	
	public Utilisateur interBavard(Salon s) {
		Utilisateur res = s.getParticipants()[0] ;
		for (int i = 1 ; i < s.getParticipants().length; i++) {
			if( nombreMessages(res) < nombreMessages(s.getParticipants()[i])) {
				res = s.getParticipants()[i] ;
			}
		}
		return res;
	}
	
	public Utilisateur bavard() {
		Utilisateur fin = null;
		for(int i = 0 ; i < this.nbSalon ;i++) {
			fin = interBavard(this.discussion[i]);
		}
		return fin;
	}
}
