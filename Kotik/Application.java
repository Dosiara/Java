import Model.*;

public class Application{
public static void main(String args[]) {
    Kotik kotik_1 = new Kotik(1, "Vasya", 8, "Maou");
    Kotik kotik_2 = new Kotik();
    kotik_2.setKotik(2, "Barsik", 4, "Marrr!");

    System.out.println();
    kotik_2.liveAnotherDay();
    System.out.println("\nKotik " + kotik_2.getName() + " weights " + kotik_2.getWeight() + " kilos");
    System.out.println("\nkotik_1.getMeow().equals(kotik_2.getMeow())\n");
    }
}
