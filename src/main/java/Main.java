import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int a= s.nextInt();
            int b= s.nextInt();
            int c=0;
            int d=0;

            if(a==1){
                c=400;}
            else if(a==2){
                c=340;}
            else if(a==3){
                c=170;}
            else if(a==4){
                c=100;}
            else if(a==4){
                c=70;}

            if(b==1){
                d=400;}
            else if(b==2){
                d=340;}
            else if(b==3){
                d=170;}
            else if(b==4){
                d=100;}
            else if(b==4){
                d=70;}

            if (c+d>500)
                System.out.println("angry");
            else
                System.out.printf("no angry");


        }
    }
