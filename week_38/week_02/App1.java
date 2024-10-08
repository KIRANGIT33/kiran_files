import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your test score (0 - 100): ");
        int score = scanner.nextInt();

        
        if (score >= 90 ) {
            System.out.println("Excellent!");
        }
        else if (score > 69 && score <90) {
            System.out.println("Good Job");
        }
        else if (score > 49 && score <70) {
            System.out.println("Needs Improvements");
         }
         else {
            System.out.println("Fail");
         }
        }

    }
