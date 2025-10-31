import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int guess, tries = 0;

        System.out.println("Guess a number (1-100):");
        do {
            guess = sc.nextInt();
            tries++;
            if (guess < secret) System.out.println("Too low!");
            else if (guess > secret) System.out.println("Too high!");
        } while (guess != secret);

        System.out.println("🎉 Correct! Number was " + secret + ". Tries: " + tries);
        sc.close();
    }
}