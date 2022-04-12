import java.util.Scanner;

public class Bj14681 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        a= in.nextInt();
        b= in.nextInt();

        if(a>0&&b>0)
            System.out.printf("1");
        else if(a<0&&b>0)
            System.out.printf("2");
        else if(a<0&&b<0)
            System.out.printf("3");
        else if(a>0&&b<0)
            System.out.printf("4");
    }
}
