  import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int a= s.nextInt();
            int b= s.nextInt();
            int c=b/a;
            int d=a/b;

            if (b%a==0)
                System.out.printf("%d*%d=%d",a,c,b);
            else if (a%b==0)
                System.out.printf("%d*%d=%d",b,d,a);
            else
                System.out.println("none");
        }
    }
