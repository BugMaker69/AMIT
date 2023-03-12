import java.util.Scanner;
public class Sum_Recursion {
    public static int SumRecursion(int n) {
        if (n > 0) {
            return n + SumRecursion(n - 1);
        } else {
            return 0;
        }
    }
}