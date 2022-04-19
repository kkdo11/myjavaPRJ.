import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, n;
        int result = 0;
        System.out.printf("첫 번째 계산할 값을 입력하시오==> \n");
        a = in.nextInt();

        System.out.printf("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 \n");
        n = in.nextInt();

        System.out.printf("두 번째 계산할 값을 입력하시오==> \n");
        b = in.nextInt();

        if (n == 1) {
            result = a + b;
            System.out.printf("%d+%d=%d", a, b, result);
        } else if (n == 2) {
            result = a - b;
            System.out.printf("%d-%d=%d", a, b, result);
        } else if (n == 3) {
            result = a * b;
            System.out.printf("%d*%d=%d", a, b, result);
        } else if (n == 4) {
            result = a / b;
            System.out.printf("%d/%d=%d", a, b, result);
        }

    }
}
