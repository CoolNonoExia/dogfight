package jpu2016.gameframe;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements Observer {
    public GamePanel(IGraphicsBuilder graphicsBuilder){}

    @Override
    public void update(Observable observable, Object object) {

    }

    @Override
    public void paintComponents(Graphics graphics) {
        super.paintComponents(graphics);
    }
}
