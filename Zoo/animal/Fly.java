package animal;

public interface Fly {
    void fly();

    default void isHigh() {
        System.out.println("I'm so very high...");
    }
}
