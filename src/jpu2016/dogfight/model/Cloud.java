package jpu2016.dogfight.model;

public class Cloud extends Mobile {
    private static int SPEED = 1, WIDTH = 300, HEIGHT = 150;
    private static String IMAGE = "cloud";

    public Cloud(Direction direction, Dimension dimension) {
        super(direction, null, dimension, SPEED, IMAGE);
    }
}
