public class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;

    }

    public void makeNoise() {
        System.out.println(this + "животное издаёт звук");

    }

    public void eat() {
        System.out.println("Такое-то животное ест ");
    }
}
