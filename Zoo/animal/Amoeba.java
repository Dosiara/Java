package animal;

public class Amoeba extends Carnivore implements Swim {
    String name = "Amoeba";
    String voice = "SILENCE!";

    public String getName() {
        return name;
    }

    public void swim() {
        System.out.println("Amoeba is not very good at swimming");
    }
}
