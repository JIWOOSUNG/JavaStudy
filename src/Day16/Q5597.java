package Day16;

import java.util.Scanner;

public class Q5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] N = new int[31];
        int Number;
        for(int i =1; i<29 ; i++){
            Number = sc.nextInt();
            N[Number] = 1;
        }
        for(int i = 1; i<=30; i++){
            if(N[i] == 0){
                System.out.println(i);
            }
        }
    }
}
