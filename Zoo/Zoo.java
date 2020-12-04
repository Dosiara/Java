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

        System.out.println();
        Worker.getVoice(cow);
        Worker.getVoice(deer);
        Worker.getVoice(duck);
        Worker.getVoice(sheep);

        System.out.println();
        Worker.feed(sheep, crustacian);
        Worker.feed(sheep, clover);
        Worker.feed(amoeba, clover);
        Worker.feed(amoeba, brain);

        System.out.println();
        Swim[] pond = { duck, amoeba, duck, fish, fish };
        for (int i = 0; i < pond.length; i++) {
            pond[i].swim();
        }
        System.out.println();
    }
}