package animal;

interface Swim {
    void swim();

    default void isDeep() {
        System.out.println("brbl-blb-blbl...");
    }
}
