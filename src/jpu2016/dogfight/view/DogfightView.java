package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

import java.util.Observable;

public class DogfightView implements IViewSystem, Runnable {
    private EventPerformer eventPerformer;
    private GraphicsBuilder graphicsBuilder;
    private GameFrame gameFrame;

    public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {}

    @Override
    public void run() {

    }

    @Override
    public void displayMessage(String message) {

    }

    @Override
    public void closeAll() {

    }
}
