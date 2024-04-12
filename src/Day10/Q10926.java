package Day10;

import java.util.Scanner;

public class Q10926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next(); //string 계열
        char textCtr = text.charAt(0); //charAt: string ->char로 변환 (0) 0번째 인덱스 사용
        System.out.println((int)textCtr); //int로 변환하여 아스키코드로 변환
    }
}