public class Bubble {
    public static void main(String[] args) {
        int [] array = new int[] {4,8,3,2,8,12,4,7};
        sort(array);
        for (int i :array) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
