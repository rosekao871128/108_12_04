import java.util.*;


public class c{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a=0;
        String str = scn.nextLine();
        String strArr[] = str.split(" ");

        for(int i=0 ; i<strArr.length ; i++){
            a = Integer.parseInt(strArr[i]);
            System.out.print(a*a+"\t");
        }
    } 
}