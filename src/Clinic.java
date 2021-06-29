public class Clinic {
    public static void main(String[] args) {
        Veterinary veterinar = new Veterinary("Иван");
        Veterinary veterinare1 = new Veterinary("Аня");
        Veterinary veterinare2 = new Veterinary( "Игорь");

        Animal dog = new Dog("Мясо", "Дом", 8);
        dog.makeNoise();
        Animal cat = new Cat("Рыба", "Дом", 5);
        cat.eat();
        Animal horse = new Horse("Сено", "Ферма", 120);
        horse.makeNoise();

        veterinar.treatAnimal(horse);
        veterinare1.treatAnimal(cat);
        veterinare2.treatAnimal(dog);

    }
}
