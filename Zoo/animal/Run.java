package animal;

public interface Run {
    void run();

    default void isFast() {
        System.out.println("I'm so very fast!");
    }

}
