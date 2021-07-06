public class Pair<S, V, L, G> {
    private S perem1;
    private V perem2;
    private L perem3;
    private G perem4;

    public Pair(S perem1, V perem2, L perem3, G perem4) {
        this.perem1 = perem1;
        this.perem2 = perem2;
        this.perem3 = perem3;
        this.perem4 = perem4;
    }

    public S getPerem1() {
        return perem1;
    }

    public V getPerem2() {
        return perem2;
    }

    public L getPerem3() {
        return perem3;
    }

    public G getPerem4() {
        return perem4;
    }

}
