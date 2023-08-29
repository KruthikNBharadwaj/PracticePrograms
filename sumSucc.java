package algorithms.sorts;

import java.util.Scanner;

public class succ {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] a=new int[len];
        for(int i=0;i<len;i++){
            a[i]=sc.nextInt();
        }
        int n= sc.nextInt();
        int sum=sumSucc(a,n);
        System.out.print(sum);
    }
    public static int sumSucc(int[] a,int n){
        int count=0;
        int sum=0;
        int len=a.length;
        for(int i=n-1;i<len;i+=n){
                sum=sum+a[i];
        }
       
        return sum;
    }
}
