package game;

public class Game {

    private Field field;

    public Game(Field field) {
        this.field = field;
    }

    public static void main(String[] args) {
        Game game = new Game(new Field(10, 10));
    }

    /**
     * Метод возвращает false если ход невозможен и тру если все ок
     * @param cell
     * @param direction
     * @return
     */
    public boolean action(Cell cell, String direction) {



        field.hasThreeInARow();
        return false;
    }



    public Field getField() {
        return field;
    }
}
