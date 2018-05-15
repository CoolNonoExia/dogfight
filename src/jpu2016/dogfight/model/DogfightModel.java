package jpu2016.dogfight.model;

import javafx.beans.Observable;
import java.util.*;

public abstract  class DogfightModel extends Observable implements IDogfightModel {

    private ArrayList<IMobile> mobiles;
    private Sky sky;
    private Dimension dimension_dogfightModel;


    public DogfightModel(){
        this.sky = new Sky(dimension_dogfightModel);
    }
    public IArea getArea(){
        return null;
    }
    public void buildArea(Dimension dimension){

    }
    public void addMobile(IMobile mobile){
        mobiles.add(mobile);
    }
    public void removeMobile(IMobile mobile){
        mobiles.remove(mobile);
    }
    public ArrayList<IMobile> getMobiles(){
        return mobiles;
    }
    public IMobile getMobileByPlayer(int player){
        // Recherche dans le tableau mobiles qui est le player n° .. ?????
        return mobiles.get(player);
    }
    public void setMobilesHavesModed(){
        //POUR L'INSTANT RIEN
    }
    public Sky getSky(){
        return sky;
    }
}
