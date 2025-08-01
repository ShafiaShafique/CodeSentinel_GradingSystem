import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        String[] subj = {"Chemistry", "Physics", "Biology"};
        int[][] num = new int[2][3];
        subjstats(subj, num);
        studentResult(num);
    }

    public static void subjstats(String[] subj, int[][] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("The Student: " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.println(subj[j] + " (out of 100)");
                num[i][j] = sc.nextInt();
            }
        }
    }

    public static void studentResult(int[][] num) {
        for (int i = 0; i < 2; i++) {
            double percent = 0;
            int result = 0;
            System.out.println("The Student: " + (i + 1));
            for (int j = 0; j < 3; j++) {
                result += num[i][j];
            }
            percent = ((double) result / 300) * 100;
            if (percent >= 80) {
                System.out.println("Result: " + result + " Grade: A");
            } else if (percent >= 70 && percent < 80) {
                System.out.println("Result: " + result + " Grade: B");
            } else if (percent >= 60 && percent < 70) {
                System.out.println("Result: " + result + " Grade: C");
            } else if (percent >= 50 && percent < 60) {
                System.out.println("Result: " + result + " Grade: D");
            } else {
                System.out.println("Result: " + result + " Grade: F");
            }
        }
    }
}

