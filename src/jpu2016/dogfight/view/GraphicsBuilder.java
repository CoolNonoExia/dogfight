package jpu2016.dogfight.view;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class GraphicsBuilder implements IGraphicsBuilder {
    private BufferedImage emptySky;
    private IDogfightModel dogfightModel;

    public GraphicsBuilder(IDogfightModel dogfightModel){
        this.dogfightModel = dogfightModel;
    }

    private void buildEmptySky(){}

    private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){}

    @Override
    public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {

    }

    @Override
    public int getGlobalWidth() {
        return 0;
    }

    @Override
    public int getGlobalHeight() {
        return 0;
    }
}
