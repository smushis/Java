package partie6;

public class ErrConst extends Exception { // Classe pour un type d'erreur de construction
	private String Message;
	private int abs;
	private int ord;
	public ErrConst(int x, int y) {
		this.Message = "Erreur Construction";
		this.abs = x;
		this.ord = y;
	}
	public String getMessage() {
		return this.Message;
	}
	public int getAbs() {
		return this.abs;
	}
	public int getOrd() {
		return this.ord;
	}
}
