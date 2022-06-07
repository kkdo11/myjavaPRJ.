import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char n = in.next().charAt(0);
        char a = 'a';

        while (a <= n) {
            System.out.print(a + " ");
            a+=1;
        }
    }
}