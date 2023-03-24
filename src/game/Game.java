package game;

public class Game {

    private Field field;

    public Game(Field field) {
        this.field = field;
    }

    public static void main(String[] args) {
        Game game = new Game(new Field(10, 10));
    }

    public Field getField() {
        return field;
    }
}
