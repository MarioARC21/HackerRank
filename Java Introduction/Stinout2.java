
import java.util.Scanner;

public class Stinout2{

    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
            
            int entero = scan.nextInt();
            double doble = scan.nextDouble(); 
            scan.nextLine();
            String cadena = scan.nextLine();
            
            
            System.out.println("String: " + cadena);
            System.out.println("Double: " + doble);
            System.out.println("Int: " + entero);
            
        }
    }

