package animal;

import food.*;

public abstract class Carnivore extends Animal {

    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(this.getName() + " eats " + food.getName());
        } else {
            System.out.println(this.getName() + " does not eat " + food.getName());
        }
    }
}
