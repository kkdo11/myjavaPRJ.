import java.util.Scanner;

public class Main {
    public static void main(String[] args){
  Scanner s= new Scanner(System.in);
  int a=s.nextInt();
  if((a%400==0)||(a%4==0&&a%100!=0))
      System.out.println("Leap");
  else
      System.out.printf("Normal");

    }
}
