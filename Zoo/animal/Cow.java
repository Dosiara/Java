package animal;

public class Cow extends Herbivore implements Run, Voice {

    public String voice = "mooo";

    public void run() {
        System.out.println("Happy cow is galloping around.");
    }

    public String voice() {
        System.out.printf("The cow says %s\n", voice);
        return voice;
    }
}
