import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
  Scanner s= new Scanner(System.in);
 int aa[]={s.nextInt(),s.nextInt(),s.nextInt()};
        Arrays.sort(aa);
        System.out.print(aa[1]);

    }
}
