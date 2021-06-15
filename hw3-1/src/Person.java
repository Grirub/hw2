public class Person {

    private String fullName;
    private String age;

    public Person(String fullName, String age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public void talk() {
        System.out.println("Привет мир ");
    }

    public void move() {
        System.out.println("Прыгать");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
