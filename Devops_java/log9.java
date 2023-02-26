package Ghar;
import java.util.Scanner;


public class log9 {
    public static void main (String args []){
     Scanner sc= new Scanner(System.in);
     int cvcount=0, ascount=0;
     String A= sc.next();
      A= A.toLowerCase();
    
     for(int i=0; i<A.length();i++){
    if(A.charAt(i) == 'a'|| A.charAt(i) =='e'||A.charAt(i) == 'i'||A.charAt(i) == 'o'||A.charAt(i) == 'u' )
          {
             cvcount++;
           
           }
        else if(A.charAt(i)>='a' && A.charAt(i)<='z' ){
            ascount++;

        }
        }
        System.out.println("the string contains vowels:"+ cvcount);
        System.out.println("the string contains vowels:"+ ascount);
     }

    
    
}
