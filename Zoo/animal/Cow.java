package animal;

public class Cow extends Herbivore implements Run, Voice {

    String voice = "Moooo";

    public void run() {
        System.out.println("Happy cow is galloping around.");
    }

    public String voice() {
        System.out.printf("The cow says %s\n", voice);
        return voice;
    }
}
