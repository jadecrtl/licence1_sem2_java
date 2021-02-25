public class Salon{
  // public attribute avec les utilisateurs (utiliser la classe Utilisateur - liste)
  // public attribute avec les messages (utiliser la classe Message - liste)

  // constructeur du type...
  public Salon(){
    // Je propose de initialiser les attributes avec des listes vides.
    // this.utilisateurs = ...
    // this.messages = ...
    // this.capaciteMessages = ...
    // ...
  }

  public void ajouterUtilisateur(Utilisateur u){
    // il faut chaque fois que vous ajouter un utilisateur d'augmenter la taille du tableau des utilisateurs
    // donc faut compter les nombres des utilisateurs - ajouter un attribut dans la classe qui va augmenter

    // S1: update Salon capacity
    // S2: il faudra copier à chaque fois la liste current des atrributs mais cette fois crée une liste de taille - taille actuelle + 1
    // S3: ajouter le utilisateur dans la dernier case de cette nouvelle liste et ajoute cette liste comme attribute
    // ex: this.utilisers = new_list_with_new_user;
  }

  public boolean estPresent(Utilisateur u){
    // 1. Boucle dans chaque element de la liste utilisateurs
    // 2. check si u == this.utilisateur[i], si oui, return true;
    // 3. sinon, return false
  }

  public void ajouterMessage(Message m){
    // 1. check si utilisateur est present avec par example: estPresent(m.sender);
    // 2. augmente capacité des messages car il faudra copier tableau de messages  courant et mettre à jour sa taille - taille courant +1
    // 3. après avoir copié ce tableau, ajoute la message courant dans la dernier case de ce nouveau tableau
  }

  public void afficher(){
    // 1. va sur ta classe message et crée un methode public non static que va afficher la message du type:
    // public void displayMessage(){
    //    System.out.println(this.sender.getPseudo()+": "+this.text);
    // }

    // 2. check si nombre de message current est > 0
    // 3. si oui, faire un boucle dans chaque message de this.messages
    // 4. pour chacune appele par example : this.messages[i].displayMessage() 
  }
}
