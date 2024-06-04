import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 5;
        int score = 0;
        int number = (int)(Math.random() * 99 + 1);
        int flip = 1;
        
        System.out.println(" * * * * NUMBER GUESSING CHALLENGE * * * *");
        System.out.println("GAME OVERVIEW:");
        System.out.println("The system has picked a random number between 1 and 100. Your task is to guess it within 5 attempts.");
        System.out.println("RULES:");
        System.out.println(" -- Enter a number between 1 and 100.");
        System.out.println(" -- You have 5 chances to guess the correct number.");
        System.out.println(" -- Each correct guess awards you 20 points.");
        System.out.println(" -- If your guess is incorrect, you'll get a hint whether the number is higher or lower.");
        System.out.println(" -- The game continues until you either guess correctly or run out of chances.");
        System.out.println(" -- Try to beat your high score!");
        
        while (chances > 0) {
            if (flip == 1) {
                System.out.println("\nA new number has been generated! Try to guess it... Good luck!");
                flip = 0;
            }
            
            System.out.print("\nMake your guess: ");
            int num = sc.nextInt();
            
            if (num > 100 || num <= 0) {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
                if (chances - 1 > 0) {
                    System.out.println("Attempts remaining: " + (chances - 1));
                }
                chances--;
            } else if (num == number) {
                System.out.println("Congratulations! You guessed the number!");
                score += 20;
                System.out.println("Your current score: " + score);
                number = (int)(Math.random() * 99 + 1);
                chances = 5;
                flip = 1;
            } else if (num < number) {
                System.out.println("Too low! Try a higher number.");
                if (chances - 1 > 0) {
                    System.out.println("Attempts remaining: " + (chances - 1));
                }
                chances--;
            } else {
                System.out.println("Too high! Try a lower number.");
                if (chances - 1 > 0) {
                    System.out.println("Attempts remaining: " + (chances - 1));
                }
                chances--;
            }
        }
        
        System.out.println("\nGame Over! You've used all your attempts.");
        System.out.println("Your final score: " + score + " points.");
        System.out.println("Thanks for playing! Try again to beat your high score!");
        
        sc.close();
    }
}
