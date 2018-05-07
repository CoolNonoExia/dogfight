package jpu2016.dogfight.model;

import java.awt.*;

public class Mobile implements IMobile {
    private int speed;
    private Image images[];
    private Direction direction;
    private Dimension dimension;
    private Position position;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
        this.images = new Image[4];
        this.direction = direction;
        this.position = position;
        this.dimension = dimension;
        this.speed = speed;
    }

    private void moveUp(){

    }

    private void moveRight(){

    }

    private void moveDown(){

    }

    private void moveLeft(){

    }

    public Color getColor(){
        return null;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public Point getPosition() {
        return new Point();
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public int getWidth() {
        return dimension.getWidth();
    }

    @Override
    public int getHeight() {
        return dimension.getHeight();
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public Image getImage() {
        return null;
    }

    @Override
    public void move() {

    }

    @Override
    public void placeInArea(IArea area) {

    }

    @Override
    public boolean isPlayer(int player) {
        return false;
    }

    public IDogfightModel getDogfightModel(){
        return null;
    }

    @Override
    public void setDogfightModel(DogfightModel dogfightModel) {

    }

    @Override
    public boolean hit() {
        return false;
    }

    @Override
    public boolean isWeapon() {
        return false;
    }
}
