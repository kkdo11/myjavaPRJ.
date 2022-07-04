import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if ((a >= 30 && a <= 40) || (a >= 60 && a <= 70))
            System.out.println("win");
        else
            System.out.printf("lose");
    }
}
