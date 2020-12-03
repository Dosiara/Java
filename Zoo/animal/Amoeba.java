package animal;

public class Amoeba extends Carnivore implements Swim {
    public void eat() {
        String animal = "Amoeba";
        System.out.println(animal + " is eating");
    }

    public void swim() {
        System.out.println("I'm not very good at swimming.");
    }
}
