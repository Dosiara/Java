package animal;

public class Amoeba extends Carnivore implements Swim {

    public void eat() {
        String animal = "Lisa";
        System.out.println(animal + " is fucking eating");
    }

    public void swim() {
        System.out.println("I'm not very good at swimming.");
    }
}
