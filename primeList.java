import java.util.Scanner;
public class PrimeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Generate primes up to: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) { prime = false; break; }
            }
            if (prime) System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}