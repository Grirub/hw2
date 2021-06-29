public class Horse extends Animal {
    int dlingriva;

    public Horse(String food, String location, int dlingriva) {
        super(food, location);
        this.dlingriva = dlingriva;
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го-го");
        ;
    }

    @Override
    public String toString() {
        return "Лошадь " +
                "Еда " + food +
                "Место жительства " + location +
                "Длина гривы " + dlingriva ;
    }

    @Override
    public void eat() {
        System.out.println("Я ем сено");

    }
}

