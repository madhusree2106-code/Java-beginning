import java.util.*;

public class TodoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add Task 2.View Tasks 3.Remove Task 4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter task: ");
                    tasks.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Tasks: " + tasks);
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int idx = sc.nextInt()-1;
                    if (idx >= 0 && idx < tasks.size()) tasks.remove(idx);
                    else System.out.println("Invalid!");
                    break;
                case 4: sc.close(); return;
                default: System.out.println("Invalid!");
            }
        }
    }
}