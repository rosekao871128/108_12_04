import java.util.Scanner;

public class a{
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        int a[] = new int[4];
        for(int j=0 ; j < a.length ; j++){
            a[j]=scn.nextInt();
        }
        for(int i = a.length -1 ; i>=0 ; i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    } 
}