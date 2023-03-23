package game;

import game.rhombus.Rhombus;

import javax.swing.*;

public class Cell extends JComponent {

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

    public Rhombus getRhombus() {
        return rhombus;
    }

    public void setRhombus(Rhombus rhombus) {
        this.rhombus = rhombus;
    }

    public void setNeighbour(Cell upCell, Cell downCell, Cell rightCell, Cell leftCell) {
        this.upCell = upCell;
        this.downCell = downCell;
        this.rightCell = rightCell;
        this.leftCell = leftCell;
    }

    /**
     * Метод пытается передвинуть ячейку по указанному направлению
     * 0 - вверх
     * 1 - вниз
     * 2 - вправо
     * 3 - влево
     * @param d
     * @return
     */
    public boolean go(byte d) {
        return false;
    }
}
