package Day15;

import java.util.Scanner;

public class Q2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            N[i] = sc.nextInt();
            sum += N[i] * N[i];
        }
        int rest = sum % 10;
        System.out.println(rest);

    }
}
