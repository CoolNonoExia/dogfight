package jpu2016.dogfight.model;

public class Plane extends Mobile{

    //ATTRIBUTS
    private static int SPEED = 2;
    private static int WIDTH = 100;
    private static int HEIGHT = 30;
    private int player;
    private static String IMAGE = "plane";

    public Plane(int player, Direction direction, Position position, String image){

        super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
    }
    public boolean isPlayer(int player){
        return super.isPlayer(player);
    }
    public boolean hit(){
        return super.hit(true);
       // this.player = 0;
    }
}
