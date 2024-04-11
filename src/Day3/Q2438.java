package Day3;

import java.util.Scanner;

public class Q2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*"); //ln은 한칸 내리는거 ln지우고 그냥 print
            }
            System.out.println(); //한칸 내리는거
        }
    }
}
