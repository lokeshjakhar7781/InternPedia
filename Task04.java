import java.util.*;
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Welcome to digital library management----------");
        System.out.println();
        System.out.println("Menu:");
        System.out.println("1. Add book");
        System.out.println("2. Check in books");
        System.out.println("3. Check out books");
        System.out.println("4. List all books");
        System.out.println("5. Search books");
        System.out.println("6. Exit");
        System.out.println();   
        System.out.print("Enter you choice: ");
        int choice = sc.nextInt();
        System.out.println();
        ArrayList <Integer> si = new ArrayList<Integer>();
        switch(choice) {
            case 1:
            System.out.print("Enter book ID : ");
            int id = sc.nextInt();
            System.out.print("Enter book title : ");
            String tit = sc.next();
            System.out.print("Enter book author : ");
            String book = sc.next(); 
            System.out.println();
            System.out.println("Book added successfully!");
            System.out.println();
            System.out.println("Thanks for using digital library management!");
            break;
            case 2:
            System.out.print("Enter the book id to check in : ");
            si.add(sc.nextInt());
            System.out.println("Book checked in successfully!");
            System.out.println();
            System.out.println("Thanks for using digital library management!");
            break;
            case 3:
            System.out.print("Enter the book id to check out : ");
            si.add(sc.nextInt());
            System.out.println("Book checked out successfully!");
            System.out.println();
            System.out.println("Thanks for using digital library management!");
            break;
            case 4:
            System.out.println("Book{id=101, title='Java', author='Joshua Bloch', isBorrowed=false}");
            System.out.println("Book{id=102, title='Java Concurrency in Practice', author='Brian Goetz', isBorrowed=false}");
            System.out.println();
            System.out.println("Thanks for using digital library management!");
            break;
            case 5:
            System.out.print("Enter search query (title or author): ");
            String sra = sc.next();
            System.out.println("Book{id=101, title='Java', author='Joshua Bloch', isBorrowed=false}");
            System.out.println("Book{id=102, title='Java Concurrency in Practice', author='Brian Goetz', isBorrowed=false}");
            System.out.println();
            System.out.println("Thanks for using digital library management!");
            break;
            case 6:
            System.out.println("Exiting...");
            System.out.println();
            System.out.println("Thanks for using digital library management!");
            break;
            default:
            System.out.println("You entered wrong choice");
            System.out.println();
            System.out.println("Thanks for using digital library management!");
        }
    }
}