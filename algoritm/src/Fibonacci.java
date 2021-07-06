public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibonaccirecursive(5));
        System.out.println(findFibonacci(10));
        System.out.println(findFibonacci(15));
        System.out.println(findFibonacci(25));
        System.out.println(findFibonacci(100));
    }

    public static long findFibonaccirecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return findFibonaccirecursive(n - 1) + findFibonaccirecursive(n - 2);
    }

    public static long findFibonacci(int k) {
        long[] array = new long[k + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= k; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[k];

    }

}
