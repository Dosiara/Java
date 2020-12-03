package animal;

import food.Food;
import food.Grass;

public abstract class Animal {

    public String voice() {
        return "ololo";
    }

    public boolean eats(Food food) {
        if (food instanceof Grass) {
            return true;
        } else
            return false;
    }

}
