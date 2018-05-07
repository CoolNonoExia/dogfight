package jpu2016.dogfight.model;

import java.awt.*;

public class Sky implements IArea {
    private Image image;
    private Dimension dimension;

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public Image getImage() {
        return image;
    }
}
