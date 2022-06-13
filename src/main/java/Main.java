import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int r=s.nextInt();
        int n=s.nextInt();

        System.out.printf("%d", (long)(a*Math.pow(r, n-1)));
        //>Math.pow() 메소드는 입력값과 출력값은 모두 double형이며 Math.pow(대상숫자,지수)를 넣음
    }
}