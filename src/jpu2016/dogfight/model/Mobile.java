package jpu2016.dogfight.model;

import java.awt.*;
import java.util.ArrayList;

public class Mobile implements IMobile {
    private int speed;
    private Image images[];
    private Direction direction;
    private Dimension dimension;
    private Position position;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
        images = new Image[4];
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
        return null;
    }

    @Override
    public void setDirection(Direction direction) {

    }

    @Override
    public Point getPosition() {
        return null;
    }

    @Override
    public Dimension getDimension() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 0;
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
