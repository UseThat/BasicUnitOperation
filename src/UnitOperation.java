import java.util.Scanner;

public class UnitOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;


        System.out.print("Set x: ");
        x = scan.nextInt();
        scan.nextLine();
        System.out.print("Set y: ");
        y = scan.nextInt();
        scan.nextLine();
        System.out.println("x>y  "+(x>y));
        System.out.println("x*2>y "+(x*2>y));
        System.out.println("y<x*3 && y> x-2"+(y<x*3 && y> x-2));
        System.out.println("x*y%2 "+(x*y%2));
        scan.close();
    }
}
