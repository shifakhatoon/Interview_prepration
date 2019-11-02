import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        int N=a+b,p=1,j;
        for(j=1;j<=n;j++){
            
            System.out.printf("%d ",N);
            p=2*p;
            N=N+p*b;
        }
           System.out.printf("%n");  
        }
        
        
        in.close();
    }
}
