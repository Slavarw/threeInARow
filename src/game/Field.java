package game;

import game.rhombus.ColorRhombus;

import java.util.List;

public class Field {

    private final Cell[][] field;

    public Field(int x, int j) {
        this.field = new Cell[x][j];

        for (int i = 0; i < x; i++) {
            for (int y = 0; y < j; y++) {
                field[i][y] = new Cell();
            }
        }


        //установить соседа у каждой ячейки вызвать  setNeighbour
        for (int i = 0; i < field.length; i++) {
            for (int y = 0; y < field[0].length; y++) {
                if (i == 0) {
                    if (y == 0) {
                        field[i][y].setNeighbour(null, field[0][1], field[1][0], null);
                    }
                    else if (y < field[0].length - 1) {
                        field[i][y].setNeighbour(field[0][y -1], field[0][y + 1], field[1][y], null);
                    }
                    else if (y == field[0].length - 1) {
                        field[i][y].setNeighbour(field[0][y - 1], null, field[1][y] , null);
                    }
                } else if (i == field.length - 1) {
                    if (y == 0) {
                        field[i][y].setNeighbour(null, field[i][y + 1], null, field[i - 1][y]);
                    }
                    else if (y < field[0].length - 1) {
                        field[i][y].setNeighbour(field[i][y - 1], field[i][y + 1], null, field[i - 1][y]);
                    }
                    else if (y == field[0].length - 1) {
                        field[i][y].setNeighbour(field[i][y - 1], null, null, field[i - 1][y]);
                    }
                } else if (y == 0) {
                    field[i][y].setNeighbour(null, field[i][y + 1], field[i + 1][y], field[i - 1][y]);
                } else if (y == field[0].length - 1) {
                    field[i][y].setNeighbour(field[i][y - 1], null, field[i + 1][y], field[i - 1][y]);
                } else {
                    field[i][y].setNeighbour(field[i][y - 1], field[i][y + 1], field[i + 1][y], field[i - 1][y]);}
            }
        }
    }

    /**
     * Метод проверяет есть ли на поле 3 в ряд
     */
    public void hasThreeInARow() {

    }

    /**
     * Рекурсивный метод проверки всех соседей на нужный цвет
     * @param cells массив подходящих ячеек
     * @param cell ячейка которую надо проверить
     * @return массив ячеек после оброботки ячейки
     */
    private void getAllNeighbourWhoHasSameColor(List<Cell> cells, Cell cell) {
        ColorRhombus colorRhombus = cell.getRhombus().getColorRhombus();

        Cell checkCell = cell.getUpCell();
        if (checkCell != null && colorRhombus == checkCell.getRhombus().getColorRhombus()) {
            if (!thisListHasThisCell(cells, checkCell))
                getAllNeighbourWhoHasSameColor(cells, checkCell);
        }

        checkCell = cell.getDownCell();
        if (checkCell != null && colorRhombus == checkCell.getRhombus().getColorRhombus()) {
            if (!thisListHasThisCell(cells, checkCell))
                getAllNeighbourWhoHasSameColor(cells, checkCell);
        }

        checkCell = cell.getRightCell();
        if (checkCell != null && colorRhombus == checkCell.getRhombus().getColorRhombus()) {
            if (!thisListHasThisCell(cells, checkCell))
                getAllNeighbourWhoHasSameColor(cells, checkCell);
        }

        checkCell = cell.getLeftCell();
        if (checkCell != null && colorRhombus == checkCell.getRhombus().getColorRhombus()) {
            if (!thisListHasThisCell(cells, checkCell))
                getAllNeighbourWhoHasSameColor(cells, checkCell);
        }
    }

    private boolean thisListHasThisCell(List<Cell> cells, Cell cell) {
        for (Cell c : cells) {
            if (c == cell)
                return true;
        }
        return false;
    }

    /**
     * метод принимает массив ячеек и у всех вызывает метод disappear класса Cell
     * @param cells
     */
    private void downing(Cell[] cells) {



        //конец метода всегда
        while (drop()) {}
        //createNewRhombus(); добавление новых ромбусов
    }

    /**
     * проверяет соседей снизу у каждой ячейки и если есть пустая ячейка то передвегаем нашу вниз на место соседа
     */
    private boolean drop() {

        //когда пройдет по всему полю и никто не упадет то возвращает true

        return false;
    }

    /**
     * Метод передвегает ячейки
     * @param cellWhoMove ячейка которая двигается
     * @param cellWhereMove ячейка куда двигается
     * @return получилось подвинуться
     */
    private boolean move(Cell cellWhoMove, Cell cellWhereMove) {
        return false;
    }

    public Cell[][] getField() {
        return field;
    }
}
