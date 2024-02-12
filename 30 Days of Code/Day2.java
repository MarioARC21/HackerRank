import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double b1 = (a * (b * 0.01));
        double c1 = (a * (c * 0.01));
        
        int f = (int) Math.round(a + b1 + c1);
        
        System.out.println(f);

    }
}
