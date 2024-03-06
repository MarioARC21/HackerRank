import java.util.Scanner;

public class Day3{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
       int a = scan.nextInt();
       if (a % 2 != 0){
           System.out.println("Weird");
       }if (a >= 3 && a <= 5 && a % 2 == 0){
           System.out.println("Not Weird");
       }if (a >= 6 && a <= 20 && a % 2 == 0){
           System.out.println("Weird");
       }if (a>20 && a % 2 == 0){
           System.out.println("Not Weird");
       }

    }
}
