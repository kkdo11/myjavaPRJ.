import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int a=s.nextInt();
        int m=s.nextInt();
        int d=s.nextInt();
        int n=s.nextInt();
        long r=a;

        for (int i=1; i<n; i++){
            r=r*m+d;
        }
        System.out.println(r);
    }
}