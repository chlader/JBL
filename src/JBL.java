import java.util.*;

public class JBL implements Comparable<JBL> {

    private final String city;
    private final int wins;

    public JBL(String city, int wins) {
        this.city = city;
        this.wins = wins;
    }

    public String getCity() {
        return city;
    }

    public int getWins() {
        return wins;
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof JBL)) return false;

        JBL team = (JBL) obj;

        return team.city.equals(city) && team.wins == wins;

    }

    public String toString() {
        return "Team: " + city +", wins = " + wins;
    }

    public int compareTo(JBL team) {
        return wins > team.wins ? 1 : wins < team.wins ? -1 : 0;
    }


    public static void main(String[] args) {

        JBL testArray[] = { new JBL("New York", 22), new JBL("Chicago", 40),
                            new JBL("Golden State", 50), new JBL("OKC", 52) } ;

        List<JBL> orgs = Arrays.asList(testArray);
        Collections.reverse(orgs);
        System.out.println(orgs);
    }
    /*
    Team is an interface that is the value of the JBL map that holds players
    then players hold an about map and then holds statistics.
     */

    /*
    public interface Team extends City {

        String teamName = " ";
        int wins = 0;
        int loss = 0;


        interface Player extends Team, City {

            Map about = new HashMap();

        }
    }

    public class Standings {

        int[][] standings = new int[10][2];

        private int[][] addWins(){

        }


    }
    */

}
