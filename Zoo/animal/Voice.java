package animal;

interface Voice {
    String voice();

    default String isLoud() {
        System.out.println("WASSAAAAAAAAAAAAAPP!?!??!!!!!");
        return "WASSAAAAAAAAAAAAAPP!?!??!!!!!";
    }
}
