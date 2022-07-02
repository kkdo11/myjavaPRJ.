import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if (a<10)
            System.out.println("small");
        else
            System.out.printf("big");
    }
}

