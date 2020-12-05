package animal;

public class Cow extends Herbivore implements Run, Voice {
    String voice = "mooo";
    String name = "Cow";

    public void run() {
        System.out.println("Jolly cow jumps around");
    }

    public String voice() {
        System.out.printf("The cow goes %s\n", voice);
        return voice;
    }
}
