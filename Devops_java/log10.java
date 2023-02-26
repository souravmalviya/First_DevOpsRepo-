package Ghar;

import java.util.Scanner;

public class log10 {
    public static void main (String args []){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       int x=0,y=1,z=0;
       while(z<n){
        System.out.println(z);
        x=y;
        y=z;
        z=x+y;
       }
       System.out.println(z);
    }
  
}
