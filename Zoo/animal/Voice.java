package animal;

interface Voice {

    String name = "animal";
    String voice = "voice";

    default public String voice() {
        System.out.println("The " + this.name + " goes " + this.voice);
        return voice;
    }

    default String isLoud() {
        System.out.println("WASSAAAAAAAAAAAAAPP!?!??!!!!!");
        return "WASSAAAAAAAAAAAAAPP!?!??!!!!!";
    }
}
