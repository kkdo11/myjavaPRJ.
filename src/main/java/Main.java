import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int n=1;
        while(a!=0&&b!=0&&c!=0)
            if (n%a==0&&n%b==0&&n%c==0)break;
                n++;
        System.out.println(n);


    }
}