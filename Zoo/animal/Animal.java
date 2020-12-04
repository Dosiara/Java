package animal;

import food.*;

public abstract class Animal {
    String name = "Animal";
    public String voice;

    public String getName() {
        return name;
    }

    public String voice() {
        return "80085";
    }

    public void eat(Food food) {
    }
}
