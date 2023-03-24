package game;

import game.rhombus.ColorRhombus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MapPanel extends JPanel {

    private final Field field;
    private Cell[][] cells;

    public MapPanel(Field field) {
        this.field = field;
        cells = field.getField();

        setBackground(Color.BLACK);
        GridLayout gridLayout = new GridLayout(cells.length, cells[0].length, 3, 3);
        setLayout(gridLayout);

        for (int i = 0; i < cells.length; i++) {
            for (int y = 0; y < cells[0].length; y++) {
                add(cells[i][y]);
            }
        }
    }
}
