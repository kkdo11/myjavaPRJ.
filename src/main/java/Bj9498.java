import java.util.Scanner;

public class Bj9498 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a;
        a= in.nextInt();

        if(90<=a)
            System.out.printf("A");
        else if(80<=a)
            System.out.printf("B");
        else if(70<=a)
            System.out.printf("C");
        else if(60<=a)
            System.out.printf("D");
        else
            System.out.printf("F");

    }
}
