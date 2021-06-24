public class Dog extends Animal {
    int dlinxvost;

    public Dog(String food, String location, int dlinxvost) {
        super(food, location);
        this.dlinxvost = dlinxvost;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");

    }

    @Override
    public void eat() {
        System.out.println("Я ем мясо");
    }

    @Override
    public String toString() {
        return "Собака " +
                "Еда " + food  +
                "Место жительства " + location  +
                " Длина хвоста" + dlinxvost +
                '}';
    }
}

