import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int totalMarks = 0;
        boolean fail = false; 

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 30) {
                fail = true;  
            }

            totalMarks += marks;
        }

      
        double average = (double) totalMarks / n;

        char grade;

      
        if (fail) {
            grade = 'F';
        } 
        else if (average >= 90) {
            grade = 'A';
        } 
        else if (average >= 75) {
            grade = 'B';
        } 
        else if (average >= 60) {
            grade = 'C';
        } 
        else if (average >= 50) {
            grade = 'D';
        } 
        else {
            grade = 'F';
        }

      
        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + average);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
