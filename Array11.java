
import java.io.*;
import java.util.*;
public class Array11 {
    public static void main(String[] arg) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size");
        //int size=Integer.parseInt(br.rea);
        int size =sc.nextInt();
        int ar[] = new int[size];
        int sum=0;
        System.out.println("Enter Array element");
        for(int i=0;i<ar.length;i++){
            //ar[i]=Integer.parseInt(br.readLine());
            ar[i]=sc.nextInt();
            if(ar[i]%2!=0){
                sum=sum+ar[i];
            }
        
        }
        System.out.println(sum);
        

    }
}
