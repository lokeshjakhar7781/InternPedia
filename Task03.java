import java.util.*;
public class Task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("----------Welcome to ATM----------");
        System.out.println();
        System.out.println("Now insert your card in ATM machine");
        System.out.println();
        System.out.println("Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Enter your choice : ");
        int ch = sc.nextInt();
        System.out.println();
        int balance = 10000;

        switch(ch) {
            case 1:
            System.out.println("Withdrawn Operation:");
            System.out.print("Enter the withdrawing amount : ");
            int with = sc.nextInt();
            if(balance>=with) {
                balance = balance - with;
                System.out.println("Please collect your money and collect the card");
                System.out.println();
                System.out.println("Balance : " + balance);
                System.out.println();
                System.out.println("Thanks for using ATM !");
            }
            else {
                System.out.println("Sorry! Insufficient Funds");
                System.out.println();
                System.out.println("Thanks for using ATM !");
            }
            break;
            case 2:
            System.out.println("Deposit Operation:"); 
            System.out.print("Enter the depositing amount : ");
            int dept = sc.nextInt();
            balance = balance + dept;
            System.out.println("Your Money has been successfully deposited");
            System.out.println();
            System.out.println("Balance : " + balance);
            System.out.println();
            System.out.println("Thanks for using ATM !");
            break;
            case 3:
            System.out.println("Current Balance : " + balance);
            System.out.println();
            System.out.println("Thanks for using ATM !");
            break;
            case 4:
            System.out.println("You are successfully exited");
            System.out.println();
            System.out.println("Thanks for using ATM !");
            break;
            default :
            System.out.println("You entered wrong key");
        }
    }
}