import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int arr[] = new int[in.nextInt()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        int sum = 0;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length-1]) * 100);
        }
        System.out.print(sum / arr.length);
    }
}