import java.io.*;
import java.util.*;
public class Array15 {
   public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int ar[]= new int[10];
    for(int i=0;i<ar.length;i++){
        ar[i]=Integer.parseInt(br.readLine());
     }
    for(int i=0;i<ar.length;i++){
      if(ar[i]%5==0){
        System.out.println(ar[i]);
        }
    }

   } 
}

