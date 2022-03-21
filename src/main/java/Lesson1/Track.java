package Lesson1;

public class Track extends Obstacle {
    private int dist;

    public Track(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(dist);
    }
}