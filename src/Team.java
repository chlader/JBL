import java.util.ArrayList;
import java.util.List;

/**
 * Team gives team information about each team in the league. Has a prefix, ex. Chicago is homeTeam = Bulls,
 * prefix = Chi, conference = East.
 */
public class Team {

	private final String name;
	private final String prefix;
	private final String conference;
	private int wins = 0;
	private int losses = 0;
	private List<Player> roster = new ArrayList<>();

	public Team(String name, String prefix, String conference) {
		this.name = name;
		this.prefix = prefix;
		this.conference = conference;
	}

	public String getName() {
		return name;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getConference() {
		return conference;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public List<Player> getRoster() {
		return roster;
	}

	public void setRoster(List<Player> roster) {
		this.roster = roster;
	}

	public String toString() {
		return "Team: " + name + " " + prefix + " in " + conference + " with record " + wins + " - " + losses;

	}
}
