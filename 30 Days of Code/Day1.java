import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
		
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        int entero = scan.nextInt();
        double doble = scan.nextDouble();
        scan.nextLine();
        String cadena = scan.nextLine();

        System.out.println(i + entero);
        System.out.println(d + doble);
        System.out.println(s + cadena);

    }
}
