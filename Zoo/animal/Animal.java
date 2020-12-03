package animal;

import food.Food;
import food.Grass;

public abstract class Animal {

    public String voice() {
        return "80085";
    }

    public boolean eat(Food food) {
        return false;
    }
}
