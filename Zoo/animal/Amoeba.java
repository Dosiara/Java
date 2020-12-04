package animal;

public class Amoeba extends Carnivore implements Swim, Voice {
    String name = "Amoeba";

    public String getName() {
        return name;
    }

    public void swim() {
        System.out.println("I'm not very good at swimming.");
    }
}
