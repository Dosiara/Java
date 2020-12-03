package animal;

public class Amoeba extends Carnivore implements Swim {
    private String animal = "Amoeba";

    public void eat() {
        String animal = "Lisa";
        System.out.println(animal + " is fucking eating");
    }
}
