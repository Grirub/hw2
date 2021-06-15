import java.util.Scanner;
public class Bank {

    public static void main(String[] args) {

        Card card = new Card("fdf", "4534654", 3.6);
        card.getBalance();
        card.getName();
        card.addMoney(2.8);
        card.wuthdrowMoney(1.9);
        System.out.println(card.getBalance());
        }
    }
