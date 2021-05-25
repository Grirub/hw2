public class task2 {
    public static void main(String[] args) {
        int n = 750;
        int x = n / 100;
        int y = n % 10;
        int z = n / 10;
        int m = z % 10;
        int s = x + y + m;
        System.out.println(s);
    }
}

