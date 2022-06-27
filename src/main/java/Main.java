import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a=s.nextFloat();
        if (a>=50&&a<=60)
            System.out.println("win");
        else
            System.out.println("lose");

    }
}