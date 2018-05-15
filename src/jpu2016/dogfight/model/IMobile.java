package jpu2016.dogfight.model;
import java.awt.*;

public interface IMobile {
    DogfightModel dogfightModel = null;

    public Direction getDirection();
    public void setDirection(Direction direction);
    public Dimension getDimension();
    public Position getPosition();
    public int getSpeed();
    public int getWidth();
    public int getHeight();
    public void move();
    public void placeInArea(IArea area);
    public boolean isPlayer(int player);
    public Color getColor();
    public IDogfightModel getDogfightModel();
    public void setDogfightModel(DogfightModel dogfightModel);
    public boolean hit();
    public boolean isWeapon();
    public Image getImage();
}
