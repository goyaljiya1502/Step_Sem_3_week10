package Week10;

import java.util.Scanner;

public class ClassAttendanceTracker {

    static int[] attendanceSummary(int[] days) {
        int present = 0;
        int streak = 0;
        int longestStreak = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] == 1) {
                present++;
                streak++;

                if (streak > longestStreak) {
                    longestStreak = streak;
                }
            } else {
                streak = 0;
            }
        }

        return new int[]{present, longestStreak};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] days = new int[n];

        for (int i = 0; i < n; i++) {
            days[i] = sc.nextInt();
        }

        int[] result = attendanceSummary(days);

        System.out.println("Present: " + result[0]);
        System.out.println("Longest streak: " + result[1]);

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");

        sc.close();
    }
}