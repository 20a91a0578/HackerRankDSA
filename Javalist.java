import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> Lists=new  ArrayList<Integer>();
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=ip.nextInt();
            Lists.add(a);
        }
      
        int k=ip.nextInt();
        for(int i=0;i<k;i++)
        {
            String str=ip.next();
            
            if(str.equals("Insert")){
                int p=ip.nextInt();
                int ele=ip.nextInt();
                Lists.add(p,ele);
            }
            if(str.equals("Delete")){
                int q=ip.nextInt();
                Lists.remove(q);
            }
        }
        for(Integer i:Lists)
        System.out.print(i+" ");
    }
    
}
