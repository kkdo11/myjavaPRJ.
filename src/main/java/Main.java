import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int counts[] = new int[10];
        int number = a * b * c;
        while (number > 0) {
            counts[number % 10]++;
            number /= 10;
        }

        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }


    }
}