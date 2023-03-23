package game;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JDialog {

    private Field field;
    private Game game;
    private MapPanel mapPanel;

    public GameFrame(Game game) {
        this.game = game;
        field = game.getField();

        int width = StartFrame.DEFAULT_WIDTH;
        int height = StartFrame.DEFAULT_HEIGHT;

        Toolkit kit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = kit.getScreenSize();
        //setUndecorated(true);
        setSize(width, height);
        setResizable(false);
        setLocation(screenSize.width / 2 - width / 2, screenSize.height / 2 - height / 2);
        setLayout(new BorderLayout());

        mapPanel = new MapPanel(field);
        add(mapPanel, BorderLayout.CENTER);
    }

}
