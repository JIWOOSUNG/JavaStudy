package Day14;

import java.util.Scanner;

public class Q10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int count =0;
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for(int j=0; j<N; j++){
            if (A[j]==v){
                count++;
            }
        }
        System.out.println(count);
    }
}
