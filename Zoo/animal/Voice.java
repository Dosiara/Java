package animal;

public interface Voice {

    String name = "animal";
    String voice = "voice";

    String voice();

    default String isLoud() {
        System.out.println("WASSAAAAAAAAAAAAAPP!?!??!!!!!");
        return "WASSAAAAAAAAAAAAAPP!?!??!!!!!";
    }
}
