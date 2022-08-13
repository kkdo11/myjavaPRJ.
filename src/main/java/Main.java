  import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);


               int a=s.nextInt();
               if (a % 10 == 1 && a != 11)
                   System.out.println(a + "st");
               else if (a % 10 == 2 && a != 12)
                   System.out.println(a + "nd");
               else if (a % 10 == 3 && a != 13)
                   System.out.println(a + "rd");
               else if (a==11||a==12||a==13)
                   System.out.println(a + "th");
               else
                   System.out.println(a+"th");


        }
    }
