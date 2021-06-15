public class Card {
    private String name;
    private String id;
    private double balance;

    public Card(String name, String id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Card(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
    public void addMoney(double money) {
        this.balance += money;
    }
    public void wuthdrowMoney(double money) {
        this.balance -= money;
    }
}
