package animal;

public class Deer extends Herbivore implements Run, Voice {

    String voice = "meh";
    String name = "Deer";

    public String getName() {
        return name;
    }

    public void run() {
        System.out.println("Angry deer walks towards you");
    }

    public String voice() {
        System.out.printf("The deer goes %s\n", voice);
        return voice;
    }
}
