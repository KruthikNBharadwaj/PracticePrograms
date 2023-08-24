package algorithms.sorts;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int [] finalRes = prodArray(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(finalRes[i]+" ");
        }
    }
    public static int[] prodArray(int[] arr,int n){
        int[] result=new int[n];
        int leftProd=1;
        for(int i=0;i<n;i++){
            result[i]=leftProd;
            leftProd=leftProd*arr[i];
        }
        int rightProd=1;
        for (int i=n-1;i>=0;i--){
            result[i]=result[i]*rightProd;
            rightProd=rightProd*arr[i];
        }
        return result;
    }
}
/*
iteration of leftProd
result[0]=1
leftProd=2
result[1]=2
leftProd=6
result[2]=6
leftProd=30
result[3]=30
leftProd=210

iteration of rightProd
result[3]=30
rightProd=7
result[2]=42
rightProd=35
result[1]=70
rightProd=105
result[0]=105
rightProd=210

result[105,70,42,30]
 */