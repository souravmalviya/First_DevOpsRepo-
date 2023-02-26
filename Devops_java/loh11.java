package Ghar;


public class loh11 {
    public static void main(String[] args) {
        int i ;
        int arr[]= {1,2,3,4,6};
        int x= arr[arr.length-1];
        for( i=arr.length-1;i>0;i--){
           arr[i]=arr[i-1];
        }
        arr[0]=x;
        for( i=0;i<arr.length;i++){
           System.out.println(arr[i]);
         }
    }
    
}
