package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
    private static int TIME_SLEEP = 30;
    private IViewSystem viewSystem;
    private IDogfightModel dogfightModel;

    public DogfightController(IDogfightModel dogfightModel){
        this.dogfightModel = dogfightModel;
    }

    public void play(){}

    public void setViewSystem(IViewSystem viewSystem){
        this.viewSystem = viewSystem;
    }

    private void launchMissile(int player){}

    private void gameLoop(){}

    @Override
    public void orderPerform(UserOrder userOrder) {

    }
}
