package Model;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int satiety = 10;
    private static int livestock = 0;

    void sleap(){
        switch(satiety){
            case 0:
                System.out.println(name + " is hungry and won'n sleep! Feed the damn kotik!");
                break;
            default:
            System.out.println(name + " is having a nap! ...sweet...dreams...full...of...mice...");
       
        }
    }

    void stompFloor(){
        switch(satiety){
            case 0:
                System.out.println(name + " is hungry and won't tigidik! Feed the damn kotik!");
                break;
            default:
            System.out.println(name + ": TIGIDIK-TIGIDIK-TIGIDIK!!!!");
         }
    }

    void purr(){
        switch(satiety){
            case 0:
                System.out.println(name + " is hungry and won't purr! Feed the damn kotik!");
                break;
            default:
            System.out.println(name + ": Prrrr...Prrrr....Prrrr...");
         }
    }
    

    void tearSofa(){
        switch(satiety){
            case 0:
                System.out.println(name + " is hungry and won't tear your funriture! Feed the damn kotik!");
                break;
            default:
            System.out.println(name + " is tearing your furnitute. Scratch.. Scrath... NOT MY FABULUOS SOFA!!!");
         }
    }

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

    public static void main(String args[]){
    System.out.println(livestock + " kotiks were created.");
    }
    
    void eat(){
        System.out.println(name + " is having a feast! omnomnom... =^_^=");
        satiety++;
    }

    
    public Kotik(int prettiness, int weight, String name, String meow, int satiety) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.satiety = satiety;
        livestock++;
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