package Day17;

import java.util.Scanner;

public class Q9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String text = sc.nextLine();
            String answer = text.charAt(0) + text.substring(text.length()-1);
            System.out.println(answer);
        }
    }
}
