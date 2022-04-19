import java.util.Scanner;
public class Exc1 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);

    int a,b,c,d;
    int result;



        System.out.printf("첫번째 계산할 값을 입력하시오==> \n");
        a=in.nextInt();
        System.out.printf("두번째 계산할 값을 입력하시오==> \n");
        b=in.nextInt();
        System.out.printf("세번째 계산할 값을 입력하시오==> \n");
        c=in.nextInt();
        System.out.printf("네번째 계산할 값을 입력하시오==> \n");
        d=in.nextInt();

        result=a+b+c+d;

        System.out.printf("%d+%d+%d+%d=%d \n",a,b,c,d,result);

    }

}
