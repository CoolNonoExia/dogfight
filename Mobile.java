package jpu2016.dogfight.model;
import java.awt.*;

public abstract class Mobile implements IMobile{    // ABSTRACT ?!!! ON N'INSTANCIE PAS UN MOBILE VIDE, c'est un de ses enfants que l'on instancie : Plane / Missile / Cloud

    private int speed;
    private Position position;
    private Dimension dimension;
    private Direction direction;
    private Image images[]; //????
    private String image;   //????

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){

        this.images = new Image[4];
        this.direction = direction;
        this.position = position;
        this.dimension = dimension;
        this.speed = speed;
        this.image = image;
    }
    public Direction getDirection(){
        return direction;
    }
    public void setDirection(Direction direction) {

        this.direction = direction;
    }
    public Dimension getDimension(){
        return dimension;
    }
    public Position getPosition(){
        return Position Point = new Position(); //????
    }
    public int getSpeed(){
        return speed;
    }
    public int getWidth(){
        return dimension.getWidth();
    }
    public int getHeight(){
        return dimension.getHeight();
    }
    public void move(){
        if (getDirection().equals(Direction.UP));  moveUp();
        if (getDirection().equals(Direction.DOWN));  moveDown();
        if (getDirection().equals(Direction.LEFT));  moveLeft();
        if (getDirection().equals(Direction.RIGHT));  moveRight();
    }
    public void placeInArea(IArea area){
        //RIEN POUR L'INSTANT
    }
    public boolean isPlayer(int player){

        if (!(player == 0)) {
            return false;
        } else {
            return true;
        }
    }
    private void moveUp(){
        if (this.getHeight() < this.getWidth()){	//Permet de transiter entre largeur et longueur selon la direction précédente. On part du principe qu'on commence horizontalement
            int transition = this.getWidth();
            this.dimension.setWidth(getHeight());
            this.dimension.setHeight(transition);
        }
        this.position.setY(this.position.getY()+this.getSpeed());
    }
    private void moveDown(){
        if (this.getHeight() < this.getWidth()){	//Permet de transiter entre largeur et longueur selon la direction précédente. On part du principe qu'on commence horizontalement
            int transition = this.getWidth();
            this.dimension.setWidth(getHeight());
            this.dimension.setHeight(transition);
        }
        this.position.setY(this.position.getY()-this.getSpeed());
    }
    private void moveLeft(){
        if (this.getHeight() > this.getWidth()){	//Permet de transiter entre largeur et longueur selon la direction précédente. On part du principe qu'on commence horizontalement
            int transition = this.getWidth();
            this.dimension.setWidth(getHeight());
            this.dimension.setHeight(transition);
        }
        this.position.setY(this.position.getY()-this.getSpeed());
    }
    private void moveRight(){
        if (this.getHeight() > this.getWidth()){	///Permet de transiter entre largeur et longueur selon la direction précédente. On part du principe qu'on commence horizontalement
            int transition = this.getWidth();
            this.dimension.setWidth(getHeight());
            this.dimension.setHeight(transition);
        }
        this.position.setY(this.position.getY()+this.getSpeed());
    }
    public Color getColor(){

        return Color;
    }
    public IDogfightModel getDogfightModel(){

        return IDogfightModel;
    }
    public void setDogfightModel(IDogfightModel dogfightModel){

        this.dogfightModel = dogfightModel; //Je sais pas si c'est ça je n'ai pas bien compris ces histoires de set un objet dogfihtModel de type IDogfightModel
    }
    public boolean hit(boolean boolHit){
        return boolHit;	// Il n'y a pas de paramètre dans le diagramme normalement !!
    }
    public boolean isWeapon(boolean boolWeapon){
        return boolWeapon; // Il n'y a pas de paramètre dans le diagramme normalement !!
    }
    public  getImage(){
        return image;
    }

}
