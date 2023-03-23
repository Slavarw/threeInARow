package game.rhombus;

import java.util.Random;

public class Rhombus {
    private ColorRhombus colorRhombus;

    public Rhombus() {
        colorRhombus = getRhombus();
    }

    /**
     * Метод должен возвращать случайный цвет
     * @return
     */
    private ColorRhombus getRhombus() {
        Random random = new Random();
        int a = random.nextInt(3);
        switch (a){
            case 0: return ColorRhombus.RED;
            case 1: return ColorRhombus.GREEN;
            case 2: return ColorRhombus.BLUE;
        }
        return null;
    }

    public ColorRhombus getColorRhombus() {
        return colorRhombus;
    }
}
