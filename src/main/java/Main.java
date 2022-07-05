import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int y=s.nextInt();
        int m=s.nextInt();
        int d=s.nextInt();
        int a=y-m+d;

        if (a%10==0)
            System.out.println("대박");
        else
            System.out.printf("그럭저럭");
    }
}
