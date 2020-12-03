package animal;

public class Sheep extends Herbivore implements Run, Voice {

    String voice = "beah";

    public void run() {
        System.out.println("It's Shaun the ship! It's Shaun the ship!");
    }

    public String voice() {
        System.out.printf("The sheep says %s\n", voice);
        return voice;
    }
}
