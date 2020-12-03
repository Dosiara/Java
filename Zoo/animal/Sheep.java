package animal;

public class Sheep extends Herbivore implements Run, Voice {

    String voice = "Beah";

    public void run() {
        System.out.println("It's Shaun the ship! It's Shaun the ship!");
    }

    public String voice() {
        System.out.printf("Shaun says %s\n", voice);
        return voice;
    }
}
}
