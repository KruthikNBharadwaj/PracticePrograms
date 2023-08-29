package algorithms.sorts;

import java.util.Scanner;

public class Desired {
    public static int desiredArr(int []a,int k,int n){
       int arr_lcm=1;
       for(int i=0;i<n;i++){
           arr_lcm=lcm(arr_lcm,a[i]);
       }
        int count=0,sum=0,num=1;
        while(count<k){
            boolean div=false;
            for(int i=0;i<n;i++){
                if(num%a[i]==0){
                    div=true;
                    break;
                }

            }
            if(!div){
                sum=sum+num;
                count++;
            }
            num++;
        }
        return sum;
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static int gcd(int a,int b){
        if(a==0)
            return b;
        else if(b==0)
            return a;
        else if(a>b)
            return gcd(a-b,b);
        else
            return gcd(a,b-a);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k,n;
        k=sc.nextInt();
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=desiredArr(arr,k,n);
        System.out.print(sum);
    }
}
