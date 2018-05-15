package jpu2016.dogfight.model;

public class Missile extends Mobile{
    private static int SPEED = 4;
    private static int WIDTH = 30;
    private static int HEIGHT = 10;
    private static int MAX_DISTANCE_TRAVELED = 1400;
    private static String IMAGE = "missile";
    private int distanceTraveled = 0;


    public Missile(Direction direction, Dimension dimension){
        super(direction, new Position(0, 0, WIDTH, HEIGHT), dimension, SPEED, IMAGE);
    }
    public static int getWidthWithADirection(Direction direction){
        int WidthWithADirection = WIDTH;
        if (Direction.UP.equals(direction)||Direction.DOWN.equals(direction)){
            WidthWithADirection = HEIGHT;
        }
        return  WidthWithADirection;
    }
    public static int getHeightWithADirection(Direction direction){
        int HeightWithADirection = HEIGHT;
        if (Direction.UP.equals(direction)||Direction.DOWN.equals(direction)){
            HeightWithADirection = WIDTH;
        }
        return HeightWithADirection;
    }
    public void move(){
        while (distanceTraveled < MAX_DISTANCE_TRAVELED){
            super.move();
        }
        //SI LE MISSILE DEPASSE SA DISTANCE MAX DE VOYAGE, MOVE N'APPELLE PLUS LE MOVE DE MOBILE
    }
    public boolean isWeapon(){
        if(this.distanceTraveled >= MAX_DISTANCE_TRAVELED){
            return super.isWeapon(false);
        }
        return super.isWeapon(true);
    }
}
