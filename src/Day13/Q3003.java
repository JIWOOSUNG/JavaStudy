package Day13;

import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {1,1,2,2,2,8};
        for(int i=0; i<=5; i++){
            System.out.print(A[i]- sc.nextInt() + " ");
        }
    }
}
