import java.util.Scanner;
//몰라 ㅅㅂ  담에 풀어
public class Bj2525 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int h,m1,m2;
        h= in.nextInt();
        m1= in.nextInt();
        m2= in.nextInt();

        if (m1+m2>60){
            h++;
            m2=60-(60-(m1+m2));

        }

    }
}
