  import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            float a=s.nextInt();
            float b=s.nextInt();
            double c,d,e,f,g,h,i,j,k,l;

//%0.6f
            c=a+b;
            d=b+a;
            e=a-b;
            f=b-a;
            g=a*b;
            h=b*a;
            i=a/b;
            j=b/a;
            k=Math.pow(a,b);
            l=Math.pow(b,a);

            double arr[]={c,d,e,f,g,h,i,j,k,l};
            double max=arr[0];
            for (int o=0; o<arr.length; o++){
                if (max<arr[o])
                    max=arr[o];
            }
            System.out.printf("%.6f",max);
        }
    }
