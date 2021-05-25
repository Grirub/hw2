public class task8 {
    public static void main(String[] args) {
        final int height = 165;
        final int weight = 45;
        int idealves = height - 110;
        if (weight < idealves) {
            System.out.println("Набрать вес:" + (idealves - weight));
        } else {
            System.out.println("Сбросить вес:" + (weight - idealves));
        }
    }
}
