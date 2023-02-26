package Ghar;
import java.util.*;
import java.math.*;

public class log2 {
    Scanner sc= new Scanner(System.in);
    int n;
    double sum;
    
    public void sum(){
        System.out.println("Enetr the number : ");
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+Math.pow(i, 2);
        }
        System.out.println("The sum of number sqr is : "+ sum);
    }
   
    public static void main(String args []){
        log2 ss= new log2();
        ss.sum();
    }    
}
