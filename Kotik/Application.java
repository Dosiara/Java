import Model.*;

public class Application{
public static void main(String args[]) {
    Kotik kotik_1 = new Kotik(1, "Barsik", 8, "Mau");
    
    Kotik kotik_2 = new Kotik();
    kotik_2.setKotik(2, "Gudinny", 4, "Meaw");

    System.out.println();
    kotik_2.liveAnotherDay();
    
    System.out.println("\nKotik " + kotik_2.getName() + " weights " + kotik_2.getWeight() + " kilos");
    
    System.out.println(kotik_1.getMeow().equals(kotik_2.getMeow()));

    System.out.prinln(Kotik.class.getLive)
    }
}
