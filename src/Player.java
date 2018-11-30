import java.time.LocalDate;

public class Player {

	private final String name;
	private final String college;
	private final LocalDate dateOfBirth;
	private final Integer number;

	public Player(String name, String college, LocalDate dateOfBirth, Integer number) {
		this.name = name;
		this.college = college;
		this.dateOfBirth = dateOfBirth;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getCollege() {
		return college;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Integer getNumber() {
		return number;
	}

	public String toString() {
		return "From " + college + " number " + number + ", " + name + "!";
	}
}
