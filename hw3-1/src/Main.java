public class Main {
    public static void main(String[] args) {
        Person person = new Person("Григорий", "23");
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
        person.talk();
        person.move();
        System.out.println();
    }
}
