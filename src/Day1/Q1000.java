package Day1;

import java.util.Scanner;

public class Q1000 {
    //main함수 필요 psvm
    public static void main(String[] args) {
    //입력이 필요: 스캐너 사용
        Scanner sc = new Scanner(System.in);//객체 새로 만들때 new, 입력받기때문에 System.in
        int A = sc.nextInt(); // 스캐너에서 nextInt로 받음
        int B = sc.nextInt();
        //출력은 a+b
        System.out.println(A+B);
    }
}
