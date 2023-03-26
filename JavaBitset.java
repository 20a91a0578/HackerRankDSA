import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        BitSet bs1=new BitSet(N);
        BitSet bs2=new BitSet(N);
        for(int i=1;i<=M;i++) {

            String operation=sc.next();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(operation.equals("AND")) {
                if(a==1) bs1.and(bs2);else bs2.and(bs1); }
            else if(operation.equals("OR")) {
                if(a==1) bs1.or(bs2);else bs2.or(bs1); }
            else if(operation.equals("XOR")) {
                if(a==1) bs1.xor(bs2); else bs2.xor(bs1); }
            else if(operation.equals("SET")) {
                if(a==1)  bs1.set(b, true); else bs2.set(b,true);  }
            else if(operation.equals("FLIP")) {
                if(a==1) bs1.flip(b); else bs2.flip(b);
            }
            System.out.println(bs1.cardinality()+" "+bs2.cardinality());
        }
    }
}
