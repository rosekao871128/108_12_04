import java.util.*;


public class b{
    public static void main(String[]args){
        Random rand = new Random();
        rand.setSeed(23323456);
        int data[] = new int[6];
        boolean flag = true;
        int i=0;
        while(i<6){
            flag=true;
            data[i]=rand.nextInt(42)+1;
            for(int j=0 ; j<i ; j++){
                if(data[i] == data[j]){
                    flag = false; break;
                }
            }
            if(flag == true){
            System.out.print(data[i]+"\t");
            i++;
            }
        }
        System.out.println();
    } 
}