package Ghar;
import java.util.Scanner;

class fract {
 public  void helloii(){
    Scanner sc= new Scanner(System.in);
    double sum=0, x,y,a=0;
    System.out.println("Enter the valeue ");
    x= sc.nextInt();
    System.out.println("Enter the denominstor value");
    y= sc.nextInt();
    for(int i=0;i<x;i++){
        sum= (3+a)/Math.pow(y, i*2)+sum;
        a=a+2;
    }
    System.out.println("the sum is :"+ sum);

    }


    

}
public class log7{

public static void main(String args []){
    fract ff= new fract();
    ff.helloii(); 

}
}