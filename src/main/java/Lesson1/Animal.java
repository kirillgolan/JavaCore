package Lesson1;

public abstract class Animal implements Participant{
    protected String type;
    protected String name;
    protected int maxRun;
    protected int maxJump;
    protected int maxSwim;

    public Animal(String name, String type,  int maxRun, int maxJump, int maxSwim) {
        this.name = name;
        this.type = type;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
        this.onDistance = true;
    }

    protected boolean onDistance;

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRun) {
            System.out.println(type + " " + name + " пробежал дистанцию!");
        } else {
            System.out.println(type + " " + name + " не смог пробежать!");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println(type + " " + name + " перепрыгнул препятствие!");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть!");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwim) {
            System.out.println(type + " " + name + " проплыл дистанцию!");
        } else {
            System.out.println(type + " " + name + " не смог проплыть!");
            onDistance = false;
        }
    }

    @Override
    public void result() {
        System.out.println(type + " " + name + ": " + onDistance);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public float getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public float getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }
}