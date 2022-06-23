import java.util.Scanner;

public class BJ2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { in.nextInt(), in.nextInt(), in.nextInt(),
                in.nextInt(), in.nextInt(), in.nextInt(),
                in.nextInt(), in.nextInt(), in.nextInt() };




        int max = 0;
        int index = 0;
        int value=0;

        for(int i = 0 ; i < 9 ; i++) {
            if(value > max) {
                max = value;
                index = (i + 1);
            }
        }
        System.out.print(max + "\n" + index);

    }
}