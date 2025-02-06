import java.util.Scanner;

public class BOJ2527 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int p1 = sc.nextInt();
            int q1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int p2 = sc.nextInt();
            int q2 = sc.nextInt();

            if (p1 < x2 || q1 < y2 || p2 < x1 || q2 < y1) {  // 겹치지 않고 떨어져 있을 때
                System.out.println("d");
            } else if ((x1 == p2 && y1 == q2) || (x1 == p2 && q1 == y2) || (p1 == x2 && q1 == y2) || (p1 == x2 && y1 == q2)) {  // 두 직사각형의 점이 닿는 경우
                System.out.println("c");
            } else if (p1 == x2 || q1 == y2 || p2 == x1 || q2 == y1) {  // 선분이 닿는 경우
                System.out.println("b");
            } else {
                System.out.println("a");
            }
        }
    }
}
