import java.util.*;

public class ShoppingCart {

    public static int calculateTotal(int price, int quantity, int sumTotalCart) {
        int sum = price * quantity;
        return sumTotalCart + sum;
    }

    public static Locale getLocale(int choice) {
        switch (choice) {
            case 1:
                return new Locale("en", "US");
            case 2:
                return new Locale("sv", "SE");
            case 3:
                return new Locale("fi", "FI");
            case 4:
                return new Locale("ja", "JP");
            default:
                return new Locale("en", "US");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale locale;

        int sumTotalCart = 0;

        // Updated numeric language menu
        System.out.println("Select a language:");
        System.out.println("1. English");
        System.out.println("2. Swedish");
        System.out.println("3. Finnish");
        System.out.println("4. Japanese");

        int choice = sc.nextInt();
        locale = getLocale(choice);

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);

        System.out.println(rb.getString("prompt1"));
        int item = sc.nextInt();

        for(int i = 0; i < item; i++){
            System.out.println(rb.getString("prompt2") + (i+1) + ":");
            int price = sc.nextInt();

            System.out.println(rb.getString("prompt3") + (i+1) + ":");
            int quantity = sc.nextInt();

            sumTotalCart = calculateTotal(price, quantity, sumTotalCart);
        }

        System.out.println(rb.getString("prompt4") + sumTotalCart + "€");
    }
}