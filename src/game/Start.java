package game;

import javax.swing.*;
import java.awt.*;

public class Start {
    public void startApplication() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                StartFrame frame = new StartFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        Start start = new Start();
        start.startApplication();
    }
}
