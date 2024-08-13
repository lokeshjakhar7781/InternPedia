import java.util.*;
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Welcome to online examination----------");
        System.out.println();
        System.out.println("Instructions for attempting test : ");
        System.out.println("--Username is internpedia and password is 1234567 for attempting examination");
        System.out.println("--Attempt all questions");
        System.out.println("--All questions are of 4 points");
        System.out.println("--Passing points are 8 points");
        System.out.println("--Once you entered your answer it will not changed, so your correct option");
        System.out.println();
        System.out.println();
        String username = "internpedia";
        System.out.print("Enter the username : ");
        String user = sc.next();
        if(user.equals(username)) {
            System.out.println("Correct username");
        }
        else {
            System.out.println("Wrong username");
        }
        System.out.print("Enter the password : ");
        int pass = sc.nextInt();
        if(pass == 1234567) {
            System.out.println("Correct password");
        }
        else {
            System.out.println("Wrong password");
        }
        System.out.println();
        System.out.println();
        int sum = 0;
        System.out.println("Q1. Which of the following is not a java features?");
        System.out.println("1. Dynamic");
        System.out.println("2. Architecture neutral");
        System.out.println("3. Use of pointers");
        System.out.println("4. Obect-oriented");
        System.out.println();
        System.out.print("Enter your answer : ");
        int ans = sc.nextInt();
        System.out.println();
        if(ans==3) {
            System.out.println("Correct answer");
            int point1 = 4;
            sum = sum + point1;
            System.out.println("You got " + point1 + " points");
            System.out.println();
        }
        else {
            System.out.println("You entered wrong answer");
            System.out.println("Correct option is : 3");
            System.out.println();
        }
        System.out.println("Q2. What does the expression float a = 35 / 0 return?");
        System.out.println("1. 0");
        System.out.println("2. Not a number");
        System.out.println("3. Infinity");
        System.out.println("4. Run time exception");
        System.out.println();
        System.out.print("Enter your answer : ");
        int ans1 = sc.nextInt();
        System.out.println();
        if(ans1==3) {
            System.out.println("Correct answer");
            int point2 = 4;
            sum = sum + point2;
            System.out.println("You got " + point2 + " points");
            System.out.println();
        }
        else {
            System.out.println("You entered wrong answer");
            System.out.println("Correct option is : 3");
            System.out.println();
        }
        System.out.println("Q3. What is the return type of the hashcode() method in the object class?");
        System.out.println("1. Object");
        System.out.println("2. int");
        System.out.println("3. long");
        System.out.println("4. void");
        System.out.println();
        System.out.print("Enter your answer : ");
        int ans2 = sc.nextInt();
        System.out.println();
        if(ans2==2) {
            System.out.println("Correct answer");
            int point3 = 4;
            sum = sum + point3;
            System.out.println("You got " + point3 + " points");
            System.out.println();
        }
        else {
            System.out.println("You entered wrong answer");
            System.out.println("Correct option is : 2");
            System.out.println();
        }
        System.out.println("Q4. Which of the following is a valid long literal?");
        System.out.println("1. ABH8097");
        System.out.println("2.L990023");
        System.out.println("3. 904423");
        System.out.println("4. 0xnf029L");
        System.out.println();
        System.out.print("Enter your answer : ");
        int ans3 = sc.nextInt();
        System.out.println();
        if(ans3==4) {
            System.out.println("Correct answer");
            int point4 = 4;
            sum = sum + point4;
            System.out.println("You got " + point4 + " points");
            System.out.println();
        }
        else {
            System.out.println("You entered wrong answer");
            System.out.println("Correct option is : 4");
            System.out.println();
        }
        System.out.println("Q5. In which memory a string is stored, when we create a string using new operator?");
        System.out.println("1. Stack");
        System.out.println("2. String memory");
        System.out.println("3. Heap memory");
        System.out.println("4. Random storage space");
        System.out.println();
        System.out.print("Enter your answer : ");
        int ans4 = sc.nextInt();
        System.out.println();
        if(ans4==3) {
            System.out.println("Correct answer");
            int point5 = 4;
            sum = sum + point5;
            System.out.println("You got " + point5 + " points");
            System.out.println();
        }
        else {
            System.out.println("You entered wrong answer");
            System.out.println("Correct option is : 3");
            System.out.println();
        }
        System.out.println("Result: ");
        System.out.println();
        if (sum >= 8) {
            System.out.println("Congratulations *****");
            System.out.println("Passed");
            System.out.println();
        } else {
            System.out.println("Try better next time !!!!!");
            System.out.println("Failed");
            System.out.println();
        }
        System.out.println("You obtained " + sum + " points out of 20");
        int n = 20;
        float per = (sum * 100) / n;
        System.out.println("You got precentage : " + per);
        System.out.println();
        System.out.println("Thanks for using online examination!!");
    }
}