package Week11;



import java.util.Scanner;

public class IsQueueInOrder {

    static int firstBreak(int[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tokens = new int[n];

        for (int i = 0; i < n; i++) {
            tokens[i] = sc.nextInt();
        }

        int result = firstBreak(tokens);

        if (result == -1) {
            System.out.println("-1");
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}
