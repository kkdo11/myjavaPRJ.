import java.util.Scanner;
public class Baekjoon10869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();



        System.out.println((a+b)%c);

        System.out.println(((a%c)+(b%c))%c);

        System.out.println((a*b)%c);

        System.out.println(((a%c)*(b%c))%c);

    }
}

