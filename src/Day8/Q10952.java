package Day8;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //테스트 케이스 개수모름 => while(true)
        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A==0 && B==0){
                break;
            }
            System.out.println(A+B);

        }
    }
}
