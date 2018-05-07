package jpu2016.gameframe;

import java.util.Observable;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameFrame extends JFrame implements KeyListener {
    private IEventPerformer eventPerformer;

    public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable){
        this.eventPerformer = performer;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
