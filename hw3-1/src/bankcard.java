package practica;
import java.util.Scanner;
public class bankcard {
    private String id;
    private String currency;
    private String date;
    private int balance;
    private int number;

    public static void main(String[] args) {

        String id;
        String currency;
        String date;
        int number;
        int balance;
        Scanner Sc = new  Scanner(System.in);
        System.out.print( "Номер счёта: " );
        number = Sc.nextInt();
        System.out.print( "Валюта: " );
        currency = Sc.next();
        System.out.print( "Остаток: " );
        balance = Sc.nextInt();

        System.out.print( "Дата открытия: " );
        date = Sc.next();

        System.out.print("Имя владельца: ");
        id = Sc.next();


        if (id.length() == 0 || currency.length() == 0 || date.length() == 0 || number == 0 || balance == 0) {
            System.out.print("Ошибка !");
            //break;
        }

        if (id.length() != 0 || currency.length() != 0 || date.length() != 0 || number != 0 || balance != 0) {
            System.out.println("\n");

            System.out.println("Номер счёта: " + number);
            System.out.println("Валюта: " + currency);
            System.out.println("Остаток: " + balance);
            System.out.println("Дата открытия: " + date);
            System.out.println("Имя владельца: " + id);
        }
    }

}