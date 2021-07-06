public class Main {
    public static void main(String[] args) {
        Pair<String,Integer,String,String> pair = new Pair<>("Вася", 23, "года", "город Могиелв");
        System.out.println(pair.getPerem1());
        System.out.println(pair.getPerem2());
        System.out.println(pair.getPerem3());
        System.out.println(pair.getPerem4());
    }
}
