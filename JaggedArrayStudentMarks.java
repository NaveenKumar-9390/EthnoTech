public class JaggedArrayStudentMarks {
    public static void main(String[] args) {

        // Student Names
        String[] students = {"Naveen", "Rahul", "Priya"};

        // Jagged Array for Marks
        int[][] marks = {
            {85, 90, 78, 88, 92},
            {75, 80, 70, 85, 90},
            {95, 88, 91, 89, 93}
        };

        System.out.println("----------------------------------------------------------------");
        System.out.println("Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {

            int total = 0;

            System.out.print(students[i] + "\t");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
            }

            System.out.println(total);
        }

        System.out.println("----------------------------------------------------------------");
    }
}