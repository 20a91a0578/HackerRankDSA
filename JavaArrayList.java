import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          ArrayList<ArrayList<Integer>> Container = new ArrayList<ArrayList<Integer>>();
    Scanner ip = new Scanner(System.in);
    int n = ip.nextInt();
    for(int i = 0; i<n; i++){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int d = ip.nextInt();
        for(int j = 0;j<d;j++){
            int a = ip.nextInt();
            ar.add(a);
        }
        Container.add(ar);
    }
    int q = ip.nextInt();
    for(int k = 0; k<q; k++){
        int x, y;
        x = ip.nextInt();
        y = ip.nextInt();
        try{
           System.out.println(Container.get(x-1).get(y-1)); 
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
    }
    ip.close();
    }
}
