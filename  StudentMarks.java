import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            System.out.println("Student " + (i + 1) + " marks = " + marks[i]);
        }

        sc.close();
    }
}