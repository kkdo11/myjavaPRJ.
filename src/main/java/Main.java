import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[3];

        for(int i=0; i<3; i++) {
            arr[i]= scanner.nextInt();
            if(arr[i]%2 ==0) {
                System.out.println(arr[i]);
            }
        }


    }
}