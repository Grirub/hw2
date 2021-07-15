import java.util.Random;
public class polMassive {
        public static void main(String[] args) {
            int array[] = new int[10];
            generate_random(array, -50, 50);
            print(array);
            int sum = sumPositive(array);
            System.out.print("\nsum positive: " + sum);
        }
        public static int sumPositive(int array[]) {
            int sum = 0;
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] ==0)
                    flag = true;
                if (array[i] > 0 && flag)
                    sum += array[i];
            }
            return sum;
        }
        private static void print(int[] array) {
            for (int i = 0; i < array.length; ++i)
                System.out.print(" " + array[i]);
            System.out.print("\n");
        }

        private static void generate_random(int[] array,
                                            int lowerbound, int upperbound) {
            Random rnd = new Random();
            int bound = upperbound - lowerbound;
            for (int i = 0; i < array.length; ++i)
                array[i] = rnd.nextInt(bound) + lowerbound;
        }
    }

