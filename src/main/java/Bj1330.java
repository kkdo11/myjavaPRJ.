import java.util.Scanner;

public class Bj1330 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();

        if (a > b)
            System.out.printf(">");
        else if(a<b)
            System.out.printf("<");
        else if(a==b)
            System.out.printf("==");
    }
}
