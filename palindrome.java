package algorithms.sorts;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        char[] c=str.toCharArray();
        String str1="";
        int i=str.length()-1;
       while(i>=0){
           str1+=str.charAt(i);
           i--;
       }
        if(str1.equals(str))
            System.out.print("Palindrome");
        else
            System.out.print("Not a Palindrome");
    }
}
