import java.util.*;
public class Task02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("----------Currency Converter----------");
        System.out.println();
        System.out.println("Menu: ");
        System.out.println("1. Convert USD to GBP");
        System.out.println("2. Convert GBP to USD");
        System.out.println("3. Quiet");
        System.out.println();
        System.out.print("Enter your choice : ");
        int n = sc.nextInt();
        System.out.println();
        Currency uk = Currency.getInstance(Locale.UK);
        
        switch(n) {
            case 1:
            double usdTogbp = 0.79;
            System.out.print("Enter the amount in USD : $");
            double n1 = sc.nextInt();
            double res = n1 * usdTogbp;
            System.out.println("Amount in GBP = " + uk.getSymbol(Locale.UK) + res);
            System.out.println("Thank you for using the Currency Converter!");
            break;

            case 2:
            double gbpTousd = 1.27;
            System.out.print("Enter the amount in GBP : " + uk.getSymbol(Locale.UK));
            double n2 = sc.nextInt();
            double res1 = n2 * gbpTousd;
            System.out.println("Amount in USD = $" + res1);
            System.out.println("Thank you for using the Currency Converter!");
            break;

            case 3:
            System.out.println("You are successfully exited");
            break;

            default:
            System.out.println("You entered wrong key");
        }
    }   
}    