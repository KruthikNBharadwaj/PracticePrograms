package algorithms.sorts;

import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int rep = digRep(a, b, c);
        System.out.print(rep);
    }

    public static int digRep(int a, int b, int c) {

        int[] a1 = new int[10];
        int num = 0;
        while (a > 0) {
            num = a % 10;
            a1[num] = 1;
            a = a / 10;
        }
        while (b > 0) {
            num = b % 10;
            a1[num] = 2;
            b = b / 10;
        }
        while (c > 0) {
            num = c % 10;
            if (a1[num] == 2) {
                return num;
            }
            c=c/10;
        }
        return 0;
    }
}