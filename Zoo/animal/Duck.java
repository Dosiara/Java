package animal;

public class Duck extends Carnivore implements Run, Swim, Fly, Voice {

    String voice = "quack";

    public void run() {
        System.out.println("Graceful duck makes a step.");
    }

    public void swim() {
        System.out.println("Graceful duck swims.");
    }

    public void fly() {
        System.out.println("Such duck. Much grace.");
    }

    public String voice() {
        System.out.printf("The duck says %s\n", voice);
        return voice;
    }
}
