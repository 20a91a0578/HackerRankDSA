// Description: Solve the HackerRank Problem given as a link below - 
// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
	   
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int arrA[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arrA[i]=ip.nextInt();
        }
        ip.close();

       
        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i]);
        }
    }
}
