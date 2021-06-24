public class Horse extends Animal{
    int dlingriva;
    public Horse(String food, String location, int dlingriva) {
        super(food,location);
        this.dlingriva= dlingriva;
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го-го");;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", dlingriva=" + dlingriva +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Я ем сено");

    }
}

