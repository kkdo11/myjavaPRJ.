import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        if (a<=170||b<=170||c<=170)
            System.out.println("CRASH");
        else
            System.out.println("PASS");
    }
}