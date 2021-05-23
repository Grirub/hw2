import com.sun.source.util.SourcePositions;
public class hw2 {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(args[0]) ;
        Integer b = Integer.valueOf(args[1]) ;
        Double c = Double.valueOf(2);
        Double d = Double.valueOf(3);

        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        System.out.println("d");

        Double g =4*Math.PI*(a*a/(b*(c+d)));

        System.out.println(g);
    }
}
