package game;

import game.rhombus.Rhombus;

import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {

    private Rhombus rhombus;
    private boolean isFill;

    private Cell upCell;
    private Cell downCell;
    private Cell rightCell;
    private Cell leftCell;

    public Cell() {
        rhombus = new Rhombus();
        isFill = true;
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
}
