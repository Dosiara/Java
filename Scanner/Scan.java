import java.util.Scanner;

public class Scan {

    public static void main (String[] args){
    toscan();
    }
    
    static void toscan(){
    Scanner in = new Scanner (System.in);
    System.out.print ("Input a number: ");
    int num = in.nextInt();

    System.out.printf("Your number: %d\n", num<<1);
    in.close();
}

}
