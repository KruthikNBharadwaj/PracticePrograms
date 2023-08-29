package algorithms.sorts;


import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();
        int count=0;
        for(int i=0;i<c1.length;i++){
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(c1[i]==c2[i])
                count=1;
            else
                count=0;
        }

        if(count==1)
            System.out.print("Anagram");
        else
            System.out.print("Not an Anagram");
    }
}
