import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        ArrayList<String> ar=new ArrayList<>();
        String k="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isAlphabetic(c))
            k+=c+"";
            else
            {
                if(!k.equals(""))
                ar.add(k);
                k="";
            }
        }
        if(!k.equals(""))
        ar.add(k);
        System.out.println(ar.size());
        for(String l:ar)
        System.out.println(l);
        scan.close();
    }
}

