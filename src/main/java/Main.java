import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        n=in.nextInt();
        int a,b;
        int sum=0;
        for (int i=0; i<n; i++){
            a= in.nextInt();
            b= in.nextInt();
            sum=a+b;
            System.out.println(sum);
        }


    }

}