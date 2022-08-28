package entidade;

public class Token {

	private String token;
	private String lexema;
	private int id;
	
	public Token(String token, String lexema, int id) {
		this.token = token;
		this.lexema = lexema;
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public String getLexema() {
		return lexema;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "('" + token + "', " + lexema + ", " + id + ")";
	}
}
