package partie6;

public class TestPoint {

	public static void main(String[] args) {
		try{
			Point a = new Point(1,4);
			a.affiche();
			a.deplace(-4, -6);
		}catch (ErrConst e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}catch (ErrDep1 ep) {
			System.out.println("PB");
			System.exit(-1);
		}

	}

}
