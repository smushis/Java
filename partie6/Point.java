package partie6;

public class Point {
	public int x; int y;
	public Point(int x, int y) throws ErrConst{ // throws signifie que la fonction peut retourner une erreur
		if((x < 0) || (y <  0)) throw new ErrConst(x,y); // throw new donne l'erreur a envoyé
		this.x = x; this.y = y;
	}
	public void affiche() {
		System.out.println("Coordonnees : " + this.x + " " + this.y);
	}
	public void deplace(int dx, int dy) throws ErrDep1 {
		if (((this.x+dx) < 0) || ((this.y+dy) <0)) throw new ErrDep1();
		this.x += dx ; this.y +=dy;
	}
}
