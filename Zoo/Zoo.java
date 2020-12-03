import worker.*;
import animal.*;
import food.*;

public class Zoo {
    public static void main(String args[]) {
        Amoeba amoeba = new Amoeba();
        Cow cow = new Cow();
        Deer deer = new Deer();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Sheep sheep = new Sheep();

        Bacteria bacteria = new Bacteria();
        Brain brain = new Brain();
        Buttercup buttercup = new Buttercup();
        Clover clover = new Clover();
        Crustacian crustacian = new Crustacian();
        Dandelion dandelion = new Dandelion();

        Worker.getVoice(amoeba);
        Worker.getVoice(cow);
        Worker.getVoice(deer);
        Worker.getVoice(duck);
        Worker.getVoice(fish);
        Worker.getVoice(sheep);

        System.out.println(brain instanceof Meat);

        amoeba.eat();
        amoeba.isDeep();

    }
}
