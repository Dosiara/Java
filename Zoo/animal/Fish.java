package animal;

public class Fish extends Carnivore implements Swim, Fly {

    String voice = "...";
    String name = "fish";

    public String getName() {
        return name;
    }

    public void swim() {
        System.out.println("The fish swims as the fish in water.");
    }

    public void fly() {
        System.out.println("Wow. A flying fish!");
    }
}
