import java.util.Scanner;

public class BOJ2999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        int r = 0;
        int c = 0;

        for (int i = 1; i <= len; i++) {  // R<=C이고, R*C=N
            if (len % i == 0) {
                int tempR= i;
                int tempC = len / i;
                if (tempR <= tempC) {
                    r = tempR;
                    c = tempC;
                }
            }
        }

        char[][] arr = new char[r][c];  // 행이 R개고, 열이 C개인 행렬 만들기

        int cnt = 0;
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                arr[i][j] = str.charAt(cnt++);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
            }
        }
    }
}
