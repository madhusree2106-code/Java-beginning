import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSubjects = 5;
        int totalMarks = 0;

        System.out.println(" Grade Calculator ");
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += sc.nextInt();
        }

        double percentage = totalMarks / (double) totalSubjects;

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) System.out.println("Grade: A+");
        else if (percentage >= 80) System.out.println("Grade: A");
        else if (percentage >= 70) System.out.println("Grade: B");
        else if (percentage >= 60) System.out.println("Grade: C");
        else System.out.println("Grade: Fail 😢");

        sc.close();
    }
}
