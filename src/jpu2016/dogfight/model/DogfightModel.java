package jpu2016.dogfight.model;

import java.util.Observable;

import java.awt.*;
import java.util.ArrayList;

public class DogfightModel extends Observable implements IDogfightModel {
    private Sky sky;
    private ArrayList<IMobile> mobiles;

    public DogfightModel(){}


    @Override
    public IArea getArea() {
        return null;
    }

    @Override
    public void buildArea(Dimension dimension) {

    }

    @Override
    public void addMobile(IMobile mobile) {

    }

    @Override
    public void removeMobile(IMobile mobile) {

    }

    @Override
    public ArrayList<IMobile> getMobile() {
        return null;
    }

    @Override
    public IMobile getMobileByPlayer(int player) {
        return null;
    }

    @Override
    public void setMobileHavesMoved() {

    }
}
