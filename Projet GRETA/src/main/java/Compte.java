
public class Compte {
	// Variables d'instances
	private String id;
	private String login;
	private String password;
	
	// Constructeur
	public Compte(String id, String login, String password) {
		this.id = id;
		this.login = login;
		this.password = password;
	}
	
	// Méthodes	
	public String getId() {
		return this.id;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getPassword() {
		return this.password;
	}

}
