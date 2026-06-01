import java.util.Scanner;

public class JaggedArrayStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Jagged Array for 1 student with 5 subjects
        int[][] marks = new int[1][];
        marks[0] = new int[5];

        int total = 0;

        System.out.println("Enter 5 Subject Marks:");

        for (int i = 0; i < marks[0].length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[0][i] = sc.nextInt();
            total = total + marks[0][i];
        }

        System.out.println("\nStudent Marks:");
        for (int i = 0; i < marks[0].length; i++) {
            System.out.print(marks[0][i] + " ");
        }

        System.out.println("\nTotal Marks = " + total);

        sc.close();
    }
}