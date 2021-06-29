public class Cat extends Animal {
    int dlinusov;

    public Cat(String food, String location, int dlinusov) {
        super(food, location);
        this.dlinusov = dlinusov;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");

    }

    @Override
    public void eat() {
        System.out.println("Я ем рыбу");
    }

    @Override
    public String toString() {
        return "Кот " +
                "Еда " + food +
                "Место жительства " + location  +
                "Длина усов " + dlinusov ;
    }
}
