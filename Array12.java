import java.util.Scanner;
import java.io.*;

public class Array12 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size");
        int size=Integer.parseInt(br.readLine());
        
        int ar[] = new int[size];
        int mul=1;
        System.out.println("Enter Array element");
        for(int i=0;i<ar.length;i++){
            ar[i]=Integer.parseInt(br.readLine());
        
            if(ar[i]%2==0){
                mul=mul*ar[i];
            }
        
        }
        System.out.println(mul);
        
    }
}
