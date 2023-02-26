package Ghar;
import java.util.*;

public class log8 {
    public static void main(String args []){
        double sum =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        double x= sc.nextInt();
        System.out.println("Enter the valeue ");
        double y= sc.nextInt();
        
        for(int i=0;i<x;i++){
            if(i%2!=0){
                sum= sum-3+(i*2) / Math.pow(y,i*2);   
            }
            else{
                sum= sum+3+(i*2) / Math.pow(y,i*2);  

            }
           
            // sum = 3+(i*2) / Math.pow(y,i*2)+sum;
        }
          System.out.println(sum);
    }
    
}
