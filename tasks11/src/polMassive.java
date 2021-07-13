import java.util.Random;
public class polMassive {
        public static void main(String[] args) {
            int array[] = new int[10];
            generate_random(array, -50, 50);
            print(array);
            int sum = sum_positive(array);
            System.out.print("\nsum positive: " + sum);
        }
        public static int sum_positive(int array[]) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0)
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

