import java.util.*;
import java.*;

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

    /*
    Team gives team information about each team in the league. Has a prefix, ex. Chicago is homeTeam = Bulls,
    prefix = Chi, conference = East.
     */

    public class Team {

        private final String homeTeam, awayTeam, prefixHome, prefixAway, conferenceHome, conferenceAway;

        public Team(String homeTeam, String awayTeam, String prefixHome, String prefixAway, String conferenceHome, String conferenceAway) {

            this.setHomeTeam(homeTeam);             // Bulls (home)
            this.setAwayTeam(awayTeam);             // Warriors (away)
            this.setPrefixHome(prefixHome);         // CHI
            this.setPrefixAway(prefixAway);         // GS
            this.setConferenceHome(conferenceHome); // East
            this.setConferenceAway(conferenceAway); // West

        }

        public String getHomeTeam { return homeTeam; }

        public String getAwayTeam() {
            return awayTeam;
        }

        public String getPrefixHome() {
            return prefixHome;
        }

        public String getPrefixAway() {
            return prefixAway;
        }

        public String getConferenceHome() {
            return conferenceHome;
        }

        public String getConferenceAway() {
            return conferenceAway;
        }

        public void setHomeTeam(String homeTeam) {
            this.homeTeam = homeTeam;
        }

        public void setAwayTeam(String awayTeam) {
            this.awayTeam = awayTeam;
        }

        public void setPrefixHome(String prefixHome) {
            this.prefixHome = prefixHome;
        }

        public void setPrefixAway(String prefixAway) {
            this.prefixAway = prefixAway;
        }

        public void setConferenceHome(String conferenceHome) {
            this.conferenceHome = conferenceHome;
        }

        public void setConferenceAway(String conferenceAway) {
            this.conferenceAway = conferenceAway;
        }

        public String toString() {

            return "Team: " + teamName1 + " " + prefix + " versus " + teamName2 " in a " + conference + " matchup."

        }
    }

    public class Player extends Team {

        private final String name; String college; Int age; Int number;

        public Player(String name; String college; Int age; Int number;) {

            this.name(name);
            this.college(college);
            this.age(age);
            this.number(number);

        }

        public String getName() { return name; }

        public Int getAge() { return age; }

        public String getCollege() { return college; }

        public Int getNumber() { return number; }

        public void setAge(Int age) { this.age = age; }

        public void setName(String name) { this.name = name; }

        public void setCollege(String college) { this.college = college; }

        public void setNumber(Int number { this.number = number; }

        public String toString() {
            return "From " + college + " number " + number + ", " + name + "!"
        }

        /*
        private class playerStats {



        }
        */
    }




    public static void main(String[] args) {

        JBL testArray[] = { new JBL("New York", 22), new JBL("Chicago", 40),
                            new JBL("Golden State", 50), new JBL("OKC", 52) } ;

        JBL testTeam[] = {new Team( "Bulls", Chi)}

        JBL testPlayer[] = { new Player("Derrick Rose", "Memphis", 30, 25) }


        List<JBL> orgs = Arrays.asList(testArray);
        //Collections.reverse(orgs);
        System.out.println(orgs);

        List<JBL> teams = Arrays.asList(testTeam);
        System.out.println(teams);

        List<JBL> players = Arrays.asList(testPlayer);
        System.out.println(players);


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
