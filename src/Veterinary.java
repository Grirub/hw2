public class Veterinary {
    private String name;

    public Veterinary(String name) {
        this.name = name;
    }
    public void treatAnimal(Animal animal) {
        System.out.println(name + " Лечит " + animal);
    }

}
