package animal;

public class Deer extends Herbivore implements Run, Voice {

    String voice = "Buaghhhh!";

    public void run() {
        System.out.println("Angry deer walks towards you.");
    }

    public String voice() {
        System.out.printf("The deear says %s\n", voice);
        return voice;
    }
}
