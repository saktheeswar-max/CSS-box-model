package abstraction;
import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Your age is: " + age);
            System.out.print("Enter number to divide 50: ");
            int num = sc.nextInt();
            int result = 50 / num;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Please enter valid numbers.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
