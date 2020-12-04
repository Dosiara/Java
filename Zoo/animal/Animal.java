package animal;

import food.*;

public abstract class Animal {
    String name = "animal";

    public String getName() {
        return name;
    }

    public String voice() {
        return "80085";
    }

    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(this.getName() + " eats " + food.getName());
        } else {
            System.out.println(this.getName() + " does not eat " + food.getName());
        }
    }
}
