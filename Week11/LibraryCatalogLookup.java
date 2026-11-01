package Week11;


import java.util.Scanner;

public class LibraryCatalogLookup {

    static String findBook(String[] isbn, String[] titles, String target) {
        int low = 0;
        int high = isbn.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = isbn[mid].compareTo(target);

            if (result == 0) {
                return titles[mid];
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] isbn = new String[n];
        String[] titles = new String[n];

        for (int i = 0; i < n; i++) {
            isbn[i] = sc.next();
            titles[i] = sc.nextLine().trim();
        }

        String target = sc.next();

        System.out.println(findBook(isbn, titles, target));

        sc.close();
    }
}

