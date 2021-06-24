public class Clinic {
    public static void main(String[] args) {
        Animal dog = new Dog("Мясо", "Дом", 8);
        dog.makeNoise();
        Animal cat = new Cat("Рыба", "Дом", 5);
        cat.eat();
        Animal horse = new Horse("Сено", "Ферма", 120);
        horse.makeNoise();

    }
}
