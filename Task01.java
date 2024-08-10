import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Student Grade Calculator----------");
        System.out.println();
        System.out.println("Fill the marks of subjects(out of 100) :- ");
        System.out.println();
        System.out.print("Enter the marks of English : ");
        int a = sc.nextInt();
        System.out.print("Enter the marks of Hindi : ");
        int b = sc.nextInt();
        System.out.print("Enter the marks of History : ");
        int c = sc.nextInt();
        System.out.print("Enter the marks of Biology : ");
        int d = sc.nextInt();
        System.out.print("Enter the marks of Chemistry : ");
        int e = sc.nextInt();
        int totalMarks = a + b + c + d + e;
        float averagePercentage = totalMarks / 5;
        System.out.println();
        System.out.println("Result :- ");
        System.out.println();
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + averagePercentage+"%");
        if(averagePercentage >= 90) {
            System.out.println("Grade = A");
        }
        else if(averagePercentage >= 80) {
            System.out.println("Grade = B");
        }
        else if(averagePercentage >= 70) {
            System.out.println("Grade = C");
        }
        else if(averagePercentage >= 60) {
            System.out.println("Grade = D");
        }
        else if(averagePercentage >= 50) {
            System.out.println("Grade = E");
        }
        else if(averagePercentage >= 40) {
            System.out.println("Grade = F");
        }
        else {
            System.out.println("Fail");
        }
    }
}