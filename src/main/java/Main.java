import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a,b,c;
        System.out.println("세 개의 주사위를 던져서 나온 수를 입력하세요 :");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();

        if(a==b&&b==c&&c==a) {
            System.out.println(10000 + (a * 1000));
        }else if (b==a){
            System.out.println(1000+(a*100));
        }
        else if (a!=b&&b!=c&&c!=a)
            System.out.print((Math.max(a, Math.max(b, c))*100));
    }
}