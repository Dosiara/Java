package animal;

interface Fly {
    default void high() {
        System.out.println("I'm so high!");
    }
    default void notHigh() {
        System.out.println("I'm so-so!");
    }
    void fly();
}

    

    

    

    

            

    

    

    

    

            