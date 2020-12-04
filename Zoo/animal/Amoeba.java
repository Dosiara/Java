package animal;

public class Amoeba extends Carnivore implements Swim {
    String name = "Amoeba";

    public String getName() {
        return name;
    }

    public void swim() {
        System.out.println("Amoeba is not very good at swimming");
    }
}
