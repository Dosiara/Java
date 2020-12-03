package animal;

interface Voice {

    String name = "animal";
    String voice = "voice";

    default public String voice() {
        System.out.println("The " + name + " goes " + voice);
        return voice;
    }

    default String isLoud() {
        System.out.println("WASSAAAAAAAAAAAAAPP!?!??!!!!!");
        return "WASSAAAAAAAAAAAAAPP!?!??!!!!!";
    }
}
