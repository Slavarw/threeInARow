package game;

import game.rhombus.ColorRhombus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MapPanel extends JComponent {

    private final Field field;
    private Cell[][] cells;

    public MapPanel(Field field) {
        this.field = field;

        GridLayout gridLayout = new GridLayout(cells.length, cells[0].length);
        setLayout(gridLayout);

        for (int i = 0; i < cells.length; i++) {
            for (int y = 0; y < cells[0].length; y++) {
                if (cells[i][y].getRhombus().getColorRhombus() == ColorRhombus.RED)
                    cells[i][y].setBackground(Color.RED);
                else if (cells[i][y].getRhombus().getColorRhombus() == ColorRhombus.GREEN)
                    cells[i][y].setBackground(Color.GREEN);
                else if (cells[i][y].getRhombus().getColorRhombus() == ColorRhombus.BLUE)
                    cells[i][y].setBackground(Color.BLUE);
                add(cells[i][y]);
            }
        }

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { //только клик
                //System.out.println(e.getX() + " " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) { //каждое нажатие
                //System.out.println(e.getX() / 5 + " " + e.getY() / 5);
            }

            @Override
            public void mouseReleased(MouseEvent e) {   //каждое отжатие
            }

            @Override
            public void mouseEntered(MouseEvent e) {        //каждое появление мышки на панели
            }

            @Override
            public void mouseExited(MouseEvent e) {         //каждый выход мышки за панель
                //System.out.println(e.getX() + " " + e.getY());
            }
        });
    }
}