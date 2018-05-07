package jpu2016.dogfight.model;

public class Plane extends Mobile {
    private static int SPEED = 2, WIDTH = 100, HEIGHT = 30;
    private int player;

    public Plane(int player, Direction direction, Position position, String image){
        super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
    }

    @Override
    public boolean isPlayer(int player) {
        return super.isPlayer(player);
    }

    @Override
    public boolean hit() {
        return super.hit();
    }
}
