/**
 * Java 1. Lesson #1
 *
 * @author Kirill Golan
 * @version 21.03.22.
 */

package Lesson1;


public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(new Track(40), new Wall(1), new Pool(40));

        Team team1 = new Team("Team 1", new Human("mrPink"), new Cat("Veniamin"),
                new Wolf("mrGray"), new Turtle("Leonardo"));

        Team team2 = new Team("Team 2", new Human("mrBrown"), new Cat("Kondrat"),
                new Wolf("mrWolf"), new Turtle("Donatello"));

        System.out.println("\n-_-Team 1-_-\n");
        course1.doIt(team1);
        System.out.println("\n-_-Team 2-_-\n");
        course1.doIt(team2);

        System.out.println("\n-_-Finish-_-\n");
        team1.showResults();
        System.out.println();
        team2.showResults();

    }
}