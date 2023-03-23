package game;

public class Field {

    private final Cell[][] field;

    public Field(int x, int y) {
        this.field = new Cell[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                field[i][j] = new Cell();
            }
        }


        //установить соседа у каждой ячейки вызвать  setNeighbour
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        field[i][j].setNeighbour(null, field[1][0], field[0][1], null); }
                    else if (j < field[i].length - 1) {
                        field[i][j].setNeighbour(null, field[1][j], field[1][j+1], field[1][j-1] ); }
                    else if (j == field[i].length - 1) {
                        field[i][j].setNeighbour(null, field[1][j], null, field[0][j-1] ); }
                } else if (i == field.length-1) {
                    if (j == 0) {
                        field[i][j].setNeighbour(field[i-1][j], null, field[i][1], null);}
                    else if (j < field[i].length) {
                        field[i][j].setNeighbour(field[i-1][j], null, field[i][j+1], field[i][j-1]);}
                    else if (j == field[i].length) {
                        field[i][j].setNeighbour(field[i-1][j], null, null, field[i][j-1]);}
                } else if (y == 0) {
                    field[i][j].setNeighbour(field[i-1][j], field[i+1][j], field[i][j+1], null); }
                else if (y == field[i].length-1) {
                    field[i][j].setNeighbour(field[i-1][j], field[i+1][j], null, field[i][j-1]);}
                else {
                    field[i][j].setNeighbour(field[i-1][j], field[i+1][j], field[i][j+1], field[i][j-1]);}
            }
        }
    }

    /**
     * Метод проверяет есть ли на поле 3 в ряд
     */
    public void hasThreeInARow() {

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

    public Cell[][] getField() {
        return field;
    }
}
