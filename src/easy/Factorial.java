package easy;
/*
* The factorial algorithm is a method for calculating the factorial of a non-negative integer. The factorial of a number n n (denoted as n!n!) is the product of all positive integers from 1 tonn. For example,5!=5×4×3×2×1=1205!=5×4×3×2×1=120.
*/

public class Factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    void main() {
        int result = factorial(6);
        IO.println(result);
    }
}
