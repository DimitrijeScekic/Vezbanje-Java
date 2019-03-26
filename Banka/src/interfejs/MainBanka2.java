package interfejs;

//Napisati program koji iz baze podataka Banka.db ispisuje sve filijale, kao i naziv mesta gde se nalaze. 

import java.sql.SQLException;

public class MainBanka2 {

	public static void main(String[] args) {

		DBBanka2 database = new DBBanka2("jdbc:sqlite:Banka.db");

		try {
			database.printNameAdress();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
