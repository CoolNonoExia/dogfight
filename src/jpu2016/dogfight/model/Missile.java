package jpu2016.dogfight.model;

public class Missile extends Mobile {
    private static int SPEED = 4, WIDTH = 30, HEIGHT = 10, MAX_DISTANCE_TRAVELED = 1400;
    private static String IMAGE = "missile";
    private int distanceTraveled = 0;

    public Missile(Direction direction, Dimension dimension) {
        super(direction, null, dimension, SPEED, IMAGE);
    }

    public static int getWidthWithADirection(Direction direction){
        return 0;
    }

    public static int getHeightWithADirection(Direction direction){
        return 0;
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public boolean isWeapon() {
        return super.isWeapon();
    }
}
