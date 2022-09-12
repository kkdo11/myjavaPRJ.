import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            int a,b,c;
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();

            if (a+b>c&&b+c>a&&a+c>b){
                System.out.printf("yes");
            }
            else {
                System.out.printf("no");
            }
        }
    }
