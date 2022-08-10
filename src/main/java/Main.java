  import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            int a=s.nextInt();


            if(a<0)
                System.out.printf("음수");
            else if (a>0)
                System.out.printf("양수");
            else
                System.out.printf("0");


        }
    }
