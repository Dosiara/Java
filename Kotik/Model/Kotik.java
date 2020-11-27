package Model;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private static int satiety;
    private static int livestock = 0;

    public int getPrettiness(){
        return this.prettiness;
    }

    public int getWeight(){
            return this.weight;
    }
    
    public String getName(){
        return this.name;
    }

    public String getMeow(){
            return this.meow;
    }

    public int getSatiety(){
        return this.satiety;
    }

    public static void main(String args[]) {
    Object Kotik = new Kotik.setKotik();
    System.out.println(livestock + " kotiks were created.");
    }
    
    static int eat() {
        if (satiety > 0){
            System.out.println("omnomnom... =^_^=");
            return 1;
        }
        else {
            Kotik.eat();
            return 0;
        }
    }

    static int sleap() {
        if (satiety > 0){
            System.out.println("...sweet...dreams...full...of...mice...");
            return 1;
        }
        else {
            Kotik.eat();
            return 0;
        }
    }

    static int stompFloor() {
        if (satiety > 0){
            System.out.println("TIGIDIK-TIGIDIK-TIGIDIK!!!!");
            return 1;
         }
         else {
             Kotik.eat();
             return 0;
         }
    }

    static int purr() {
        if (satiety > 0){
            System.out.println("Prrrr...Prrrr....Prrrr...");
            return 1;
         }
         else {
             Kotik.eat();
             return 0;
         }
    }
    

    static int tearSofa() {
        if (satiety > 0){
            System.out.println("Scratch.. Scrath... NOT MY FABULUOS SOFA!!!");
            return 1;
         }
         else {
             Kotik.eat();
             return 0;
         }
    }
    
    // Конструктор без параметров, он идентичен конструктору по умолчанию,
    // который сюда бы подставила Java,
    // Но она его не подставит, по той причине,
    // что ниже определяется другой (перегруженный) конструктор, с параметрами.
    public Kotik() {
    }

    /*
     * Указатель this можно использовать для вызова перегруженного конструктора
     */
   /*  public Kotik(int weight, String name) {
        this(5, weight, name, "Мяу!", 1); */ 

    public Kotik(int prettiness, int weight, String name, String meow, int satiety) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.satiety = satiety;
    }


    void setKotik(int prettiness, String name, int weight, String meow, int satiety) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.satiety = satiety;
        livestock++;
    }
}