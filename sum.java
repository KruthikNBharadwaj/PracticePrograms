package algorithms.sorts;

import java.util.Scanner;

public class sumof {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int s=sum(str);
        System.out.print(s);
    }
    public static int sum(String str){
        int s=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a=='A')
                s=s+1;
            else if(a=='B')
                s=s+10;
            else if(a=='C')
                s=s+100;
            else if(a=='D')
                s=s+1000;
            else if(a=='E')
                s=s+10000;
            else if(a=='F')
                s=s+100000;
            else if(a=='G')
                s=s+1000000;
            else
                s=s+0;
        }
        return s;

    }
}
