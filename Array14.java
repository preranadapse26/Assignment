import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class Array14 {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size");
    
        char chr[]= new char[7];
        System.out.println("Enter 7 Characters");
        for(int i=0;i<chr.length;i++){
            chr[i]=(char)br.read();

        }
        System.out.println("Output:");
        for(int i=0;i<chr.length;i++){
            if(chr[i]=='a'||chr[i]=='e'||chr[i]=='i'||chr[i]=='o'||chr[i]=='u'||chr[i]=='A'||chr[i]=='I'||chr[i]=='O'||chr[i]=='U'||chr[i]=='E'){
                System.out.println(chr[i]);
            }
        }
    }
}
