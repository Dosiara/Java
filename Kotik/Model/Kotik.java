package Model;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int satiety = 10;
    private int livestock;

    boolean eat(int satiety) {
        System.out.print(name + " is having a feast! omnomnom... =^_^=\n");
        this.satiety += satiety;
        return true;
    }

    boolean eat(int satiety, String food) {
        System.out.print(name + " is having a " + food + "! omnomnom... =^_^=\n");
        satiety++;
        return true;
    }

    boolean eat() {
        eat(1, "pizza");
        return true;
    }
    
    boolean sleep() {
        switch (satiety) {
            case 0:
                System.out.print(name + " is HUNGRY and won'n sleep! Feed the damn kotik! ");
                eat();
                return false;
            default:
                System.out.println(name + " is having a nap! ...sweet...dreams...full...of...mice...");
                satiety--;
                return true;

        }
    }

    boolean stomp() {
        switch (satiety) {
            case 0:
                System.out.print(name + " is HUNGRY and won't tigidik! Feed the damn kotik! ");
                eat();
                return false;
            default:
                System.out.println(name + ": TIGIDIK-TIGIDIK-TIGIDIK!!!!");
                satiety--;
                return true;
        }
    }

    boolean purr() {
        switch (satiety) {
            case 0:
                System.out.print(name + " is HUNGRY and won't purr! Feed the damn kotik! ");
                eat();
                return false;
            default:
                System.out.println(name + ": Prrrr...Prrrr....Prrrr...");
                satiety--;
                return true;
        }
    }

    boolean tear() {
        switch (satiety) {
            case 0:
                System.out.print(name + " is HUNGRY and won't tear your funriture! Feed the damn kotik! ");
                eat();
                return false;
            default:
                System.out.println(name + " is tearing your furnitute. Scratch.. Scrath... NOT MY FABULUOS SOFA!!!");
                satiety--;
                return true;
        }
    }

    public void liveAnotherDay() {
        for (int i = 1; i < 25; i++) {
            switch ((int)(Math.random() * 5 + 1)) {
                case 1:
                    System.out.print(i + ": ");
                    eat();
                    break;
                case 2:
                    System.out.print(i + ": ");
                    sleep();
                    break;
                case 3:
                    System.out.print(i + ": ");    
                    stomp();
                    break;
                case 4:
                    System.out.print(i + ": ");
                    purr();
                    break;
                case 5:
                    System.out.print(i + ": ");
                    tear();
                    break;
            }
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

    public int getLivestock(){
        return livestock;
    }
    
public Kotik(){
    livestock++;
}

public Kotik(int prettiness, String name, int weight, String meow){
    setKotik(prettiness, name, weight, meow);
} 
   
    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.livestock = livestock;
        livestock++;
    }
}