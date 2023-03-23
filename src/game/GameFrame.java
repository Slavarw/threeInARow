package game;

import javax.swing.*;

public class GameFrame extends JDialog {

    private Field field;
    private Game game;

    public GameFrame(Game game) {
        this.game = game;
        field = game.getField();
    }

}
