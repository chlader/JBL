package src;

import java.util.*;
import java.math.*;

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

    public static class Team {

        String name; int score;

        Team(String name, int score) {
            this.name = name;
            this.score = score;
        }


        public void updateScore(int currentShot){
            score += currentShot;
        }
    }

    public static class Player {

        String name;
        String college;
        int age;
        int number;

        public Player(String name, String college, int age, int number) {

            this.name = name;
            this.college = college;
            this.age = age;
            this.number = number;


        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCollege() {
            return college;
        }

        public int getNumber() {
            return number;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCollege(String college) {
            this.college = college;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String toString() {
            return "From " + college + " number " + number + ", " + name + "!";
        }

        /*
        private class playerStats {
        }
        */
    }
        private static class playGame {
            Team hasBall;
            boolean gameStatus;

            Team team1 = new Team("Bulls", 0);
            Team team2 = new Team("Warriors", 0);

            double shot = Math.floor(Math.random() * 10) + 1;

            private String takeShotTeam1() {
                hasBall = team1;
                if (team1.score < 11) gameStatus = true;
                if (shot >= 5) {
                    team1.score += 2;
                    hasBall = team2;
                    takeShotTeam2();
                }
                if (shot <= 3) {
                    team1.score += 3;
                    hasBall = team2;
                    takeShotTeam2();
                } else {
                    hasBall = team2;
                    takeShotTeam2();
                }
                return isWinner();
            }
            private String takeShotTeam2() {
                hasBall = team2;
                if (team2.score < 11) gameStatus = true;
                if (shot >= 5) {
                    team2.score += 2;
                    hasBall = team1;
                    takeShotTeam1();
                }
                if (shot <= 3) {
                    team2.score += 3;
                    hasBall = team1;
                    takeShotTeam1();
                } else {
                    hasBall = team1;
                    takeShotTeam1();
                }
                return isWinner();

            }

            private String isWinner(){
                if (team1.score >= 11 && team1.score > team2.score) {
                    gameStatus = false;
                    System.out.println("Team 1 Wins!");
                }
                if (team2.score >= 11 && team2.score > team1.score) {
                    gameStatus = false;
                    System.out.println("Team 2 Wins!");
                }
                return "Game over!";
            }

    }






    public static void main(String[] args) {

        JBL testArray[] = { new JBL("New York", 22), new JBL("Chicago", 40),
                new JBL("Golden State", 50), new JBL("OKC", 52) } ;

        Team[] testTeam = { new Team("Bulls", 0) };

        Player[] testPlayer = { new Player("Derrick Rose", "Memphis", 30, 25) };


        List<JBL> orgs = Arrays.asList(testArray);
        //Collections.reverse(orgs);
        System.out.println(orgs);

        List<Team> teams = Arrays.asList(testTeam);
        System.out.println(teams);

        List<Player> players = Arrays.asList(testPlayer);
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