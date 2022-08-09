    import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();

            if(c<10)
                System.out.printf("%d%d%02d",a,b,c);
            else
                System.out.printf("%d%d%d",a,b,c);


        }
    }
