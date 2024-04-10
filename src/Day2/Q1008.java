package Day2;

import java.util.Scanner;

public class Q1008 {
    public static void main(String[] args) {

//      Scanner sc = new Scanner(System.in);
//      int A = sc.nextInt();
//      int B = sc.nextInt();
//
//      System.out.println(A/B);
        //1 3 입력 => 0 : int형이라서 정수값만

        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();

        System.out.println(A/B);
        //float double = 정밀도 차이
        // float => 소수점 6~7 자리 정도
        // dobule => 소수점 15~16자리 정도까지 표현이 가능
        // 문제가 10^(-9) 이하의 오차까지 허용이므로 double
        // 코테에서는 웬만하면 dobule 쓰는게 맞출확률이 더 높다.
    }
}
