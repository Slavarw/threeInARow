package game;

public class Field {

    private final Cell[][] field;

    public Field(int x, int y) {
        this.field = new Cell[x][y];

        //инициализация
        /*for (;;) {
            for (;;) {

            }
        }


        //установить соседа у каждой ячейки вызвать  setNeighbour
        for (;;) {
            for (;;) {

            }
        }*/
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
