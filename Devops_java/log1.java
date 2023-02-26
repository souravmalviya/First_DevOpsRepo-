package Ghar;

import java.util.Scanner;

public class log1 {
    public static void main(String args []){

    
    Scanner sc = new Scanner(System.in);
    String A= sc.nextLine();
    
    String B = new StringBuilder(A).reverse().toString();
    
    if(A.equals(B)){
        System.out.println("palendrome");
    }
    else{
        System.out.println("the string is "+ B);
    }
    
}
}