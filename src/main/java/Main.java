import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum=s.nextInt();
        int n=s.nextInt();

        for (int i=0; i<n; i++) {
            int p = s.nextInt();
            int r = s.nextInt();
            sum=sum-(p*r);
        }

        if (sum==0){
            System.out.printf("Yes");
        }else{
            System.out.printf("No");
        }
    }

}