import java.time.LocalDate;

public class JBL {

	public static void main(String[] args) {

		Team testTeam = new Team( "Bulls", "Chi", "West");

		Player testPlayer = new Player("Derrick Rose", "Memphis", LocalDate.of(1988, 10, 4), 25);


		System.out.println(testTeam);

		System.out.println(testPlayer);
	}
}
