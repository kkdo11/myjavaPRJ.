import java.util.Scanner;

public class Ex2562 {
    public static void main(String[] args) {
        int aa[] = new int[9];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < aa.length; i++) {
            aa[i] = in.nextInt();
        }
        int max = aa[0];
        int index = 0;

        for (int i = 0; i < aa.length; i++) {
            if (aa[i] > max) {
                max = aa[i];
                index = i + 1;
            }
        }
            System.out.println(max);
            System.out.println(index);

    }
}
