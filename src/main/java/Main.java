import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int walkOnTheAxis(int n) {
        int total = n;
        for (int i=1; i<=n; i++) {
            total += i;
        }
        return total;
    }

    public static String yourNameIsMine(String name1, String name2) {
        if (nameHelper(name1, name2) || nameHelper(name2, name1)) {
            return "YES";
        }
        return "NO";
    }

    public static boolean nameHelper(String name1, String name2) {
        for (int i=0; i<name1.length(); i++) {
            if (name2.indexOf(name1.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        String[] A = new String[N];
        for (int i = 0; i < N; i++)
        {
            A[i] = sc.next();
        }

        for (String x : A) {
            System.out.println(walkOnTheAxis(Integer.parseInt(x)));
        }

        int N2 = sc.nextInt();
        sc.nextLine();

        String[] A2 = new String[N2];
        for (int i = 0; i < N2; i++)
        {
            A2[i] = sc.nextLine();
        }

        for (String names : A2) {
            System.out.println(yourNameIsMine(names.split(" ")[0], names.split(" ")[1]));
        }

        sc.close();
    }
}
