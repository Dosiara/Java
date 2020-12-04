package worker;

import animal.*;
import food.*;

public class Worker {
    public static void getVoice(Voice animal) {
        animal.voice();
    }

    public static void feed(Animal animal, Food food) {
        animal.eat(food);
    }
}
