package noviPaket;

public class Toranj {

	public static void main(String[] args) {

		Avion a1 = new Avion();
		a1.sBroj = "001";
		a1.altitude = 15;
		a1.longitude = 12;

		IMovable im = a1;

		im.printLocation();
		Tacka t1 = new Tacka();
		t1.x = 78;
		t1.y = 25;
		
		im = t1;
		im.printLocation();
		
	}
}