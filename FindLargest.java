import java.util.*;

public class FindLargest{

    public static void main(String[] args) {
           
        Scanner sc=new Scanner(System.in);
 
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int sum=a+b+c;
        int max=a;
        float avg=0;
        if(a>b&&a>c){

            max=a;
        }else if(b>c){

            max=b;
        }else{

            max=c;
        }

        avg=(sum/3);

        System.out.println("The maximum of three numbers is  "+max);

        System.out.println("The sum of three numbers is  "+sum);

        System.out.println("The average of three numbers is  "+avg);

    }
}