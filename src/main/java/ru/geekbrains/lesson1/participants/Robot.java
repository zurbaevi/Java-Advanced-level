package ru.geekbrains.lesson1.participants;

public class Robot implements Participants {
    private String name;
    private int maxRunDistance;
    private float maxHeightJump;
    private boolean onDistance;

    public Robot(String name, int maxRunDistance, float maxHeightJump) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxHeightJump = maxHeightJump;
        this.onDistance = true;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " has successfully run " + distance + " metres");
        } else {
            System.out.println(name + " couldn't run " + distance + " metres");
            onDistance = false;
        }
    }

    @Override
    public void heightJump(int height) {
        if (height <= maxHeightJump) {
            System.out.println(name + " has successfully vaulted over " + height + " metres wall");
        } else {
            System.out.println(name + " couldn't vault over " + height + " metres");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
