import java.util.Scanner;

public class cdp1092 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int n=1;

        while(a!=0&&b!=0&&c!=0){
            if (n%a==0&&n%b==0&&n%c==0)
                n++;
        }
        System.out.println(n);
    }
}
