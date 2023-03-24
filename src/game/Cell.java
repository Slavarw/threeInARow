package game;

import game.rhombus.ColorRhombus;
import game.rhombus.Rhombus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class Cell extends JPanel implements MouseListener {

    private Rhombus rhombus;
    private boolean isFill;
    private Cell upCell;
    private Cell downCell;
    private Cell rightCell;
    private Cell leftCell;

    private Coordinate pressedCoordinate;
    private Coordinate releasedCoordinate;

    public Cell() {
        rhombus = new Rhombus();
        isFill = true;

        addMouseListener(this);

        if (getRhombus().getColorRhombus() == ColorRhombus.RED) {
            setBackground(Color.RED);
        } else if (getRhombus().getColorRhombus() == ColorRhombus.GREEN) {
            setBackground(Color.GREEN);
        } else if (getRhombus().getColorRhombus() == ColorRhombus.BLUE) {
            setBackground(Color.BLUE);
        }
    }

    public void disappear() {
        isFill = false;
    }

    public void setNeighbour(Cell upCell, Cell downCell, Cell rightCell, Cell leftCell) {
        this.upCell = upCell;
        this.downCell = downCell;
        this.rightCell = rightCell;
        this.leftCell = leftCell;
    }

    @Override
    public void mouseClicked(MouseEvent e) {//только клик
    }

    @Override
    public void mousePressed(MouseEvent e) {//каждое нажатие
        System.out.println("нажатие = " + e.getX() + ", " + e.getY());
        pressedCoordinate = new Coordinate(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {//каждое отжатие
        System.out.println("отжатие = " + e.getX() + ", " + e.getY());
        releasedCoordinate = new Coordinate(e.getX(), e.getY());
        checkCoordinate();
    }

    @Override
    public void mouseEntered(MouseEvent e) {//каждое появление мышки на панели
    }

    @Override
    public void mouseExited(MouseEvent e) { //каждый выход мышки за панель
    }

    /**
     * проверяет надо ли передвигать ячейку если надо то запускает передвижение ячейки
     */
    private void checkCoordinate() {

    }

    public Rhombus getRhombus() {
        return rhombus;
    }

    public void setRhombus(Rhombus rhombus) {
        this.rhombus = rhombus;
    }

    public boolean isFill() {
        return isFill;
    }

    public Cell getUpCell() {
        return upCell;
    }

    public Cell getDownCell() {
        return downCell;
    }

    public Cell getRightCell() {
        return rightCell;
    }

    public Cell getLeftCell() {
        return leftCell;
    }

    private class Coordinate {
        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
