import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Is it a weekend (true or false): ");
        boolean isWeekend = scanner.nextBoolean();

        if (( age < 18 || age > 65 ) && !isWeekend) {
            System.out.println("You are eligible for discount in ticket price!");
        }
        else {
            System.out.println("You are not eligible for discount in ticket price!");
        }
        scanner.close();

    }
}