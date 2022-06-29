import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=a+b;
        if (a%2==0)
            System.out.printf("짝수");
        else
            System.out.printf("홀수");
        System.out.printf("+");
        if (b%2==0)
            System.out.printf("짝수");
        else
            System.out.printf("홀수");
        System.out.printf("=");
        if(sum%2==0)
            System.out.printf("짝수");
        else
            System.out.printf("홀수");

    }
}
