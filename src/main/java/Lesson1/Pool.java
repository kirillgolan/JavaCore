package Lesson1;

public class Pool extends Obstacle {
    private int dist;

    public Pool(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(dist);
    }
}