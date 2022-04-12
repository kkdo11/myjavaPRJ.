import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("1사분면");
        } else if (a < 0 && b > 0) {
            System.out.println("2사분면");
        } else if (a < 0 && b < 0) {
            System.out.println("3사분면");
        } else {
            System.out.println("4사분면");
        }


    }
}
