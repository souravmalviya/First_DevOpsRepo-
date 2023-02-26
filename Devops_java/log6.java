package Ghar;
import java.util.Scanner;
import java.math.*;
//3/x^0+ 5/x^2
public class log6 {
    public static void main(String args []){
        double sum =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        double x= sc.nextInt();
        System.out.println("Enter the valeue ");
        double y= sc.nextInt();
        double in;
        for(int i=0;i<x;i++){
            in=3+(i*2);
            sum = in / Math.pow(y,i*2)+sum;
        }
          System.out.println(sum);
    }
     
       
}
