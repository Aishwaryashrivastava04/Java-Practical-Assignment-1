import java.util.Scanner;

class MaximumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int max = sc.nextInt();

        for (int i = 2; i <= 10; i++) {

            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();

            if (n > max) {
                max = n;
            }
        }

        System.out.println("Maximum = " + max);

        sc.close();
    }
}
