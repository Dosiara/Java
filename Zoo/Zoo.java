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

        Worker.getVoice(amoeba);
        Worker.getVoice(cow);
        Worker.getVoice(deer);
        Worker.getVoice(duck);
        Worker.getVoice(fish);
        Worker.getVoice(sheep);

    }
}
