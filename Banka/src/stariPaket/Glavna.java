package stariPaket;

public class Glavna {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		System.out.println(a1);
		a1.changeState();
		a1.printState();
//System.out.println(a1);

		System.out.println();

		Uredjaj u1 = new Uredjaj();
		Uredjaj u2 = new Uredjaj();
		System.out.println(u1);
		u1.changeState();
		u1.printState();
//System.out.println(u1);
		
		IChangeable[] niz = new IChangeable[] {a1,u1,a2, u2};
		for (int i = 0; i < niz.length; i++) {
			niz[i].printState();
		}
		u2.changeState();
		System.out.println("");
		for (int i = 0; i < niz.length; i++) {
			niz[i].printState();
		}
	}

}
