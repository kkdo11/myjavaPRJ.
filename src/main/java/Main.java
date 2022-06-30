import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int arr[] = {s.nextInt(), s.nextInt(), s.nextInt()};
        Arrays.sort(arr);   //오름차순 정렬은 Array.sort(베열이름);

        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
