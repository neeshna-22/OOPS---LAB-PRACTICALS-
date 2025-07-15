import java.util.Scanner;

public class DataOperationsStudentMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int sub2 = sc.nextInt();

        // Arithmetic Operators
        int total = sub1 + sub2;      // +
        int difference = sub1 - sub2; // -
        int product = sub1 * sub2;    // *
        int average = total / 2;      // /
        int mod = total % 100;        // %

        // Unary Operators
        int studentCount = 0;
        ++studentCount;               // ++
        --studentCount;               // --
        ++studentCount;               // ++

        // Relational Operators
        boolean isLess = sub1 < sub2;         // <
        boolean isLessEqual = sub1 <= sub2;   // <=
        boolean isGreater = sub1 > sub2;      // >
        boolean isGreaterEqual = sub1 >= sub2;// >=
        boolean isEqual = sub1 == sub2;       // ==
        boolean isNotEqual = sub1 != sub2;    // !=

        // Logical Operators
        boolean passedAll = (sub1 >= 35) && (sub2 >= 35);          // &&
        boolean topScorer = (sub1 > 90) || (sub2 > 90);            // ||
        boolean notFailed = !(sub1 < 35 || sub2 < 35);             // !

        System.out.println("\n=== ARITHMETIC OPERATORS ===");
        System.out.println("sub1 + sub2        (+)  = " + total);
        System.out.println("sub1 - sub2        (-)  = " + difference);
        System.out.println("sub1 * sub2        (*)  = " + product);
        System.out.println("total / 2          (/)  = " + average);
        System.out.println("total % 100        (%)  = " + mod);

        System.out.println("\n=== UNARY OPERATORS ===");
        System.out.println("Student Count ++         = " + (++studentCount));
        System.out.println("Student Count --         = " + (--studentCount));
        System.out.println("Student Count ++         = " + (++studentCount));

        System.out.println("\n=== RELATIONAL OPERATORS ===");
        System.out.println("sub1 < sub2         (<)  = " + isLess);
        System.out.println("sub1 <= sub2        (<=) = " + isLessEqual);
        System.out.println("sub1 > sub2         (>)  = " + isGreater);
        System.out.println("sub1 >= sub2        (>=) = " + isGreaterEqual);
        System.out.println("sub1 == sub2        (==) = " + isEqual);
        System.out.println("sub1 != sub2        (!=) = " + isNotEqual);

        System.out.println("\n=== LOGICAL OPERATORS ===");
        System.out.println("(sub1 >= 35 && sub2 >= 35)   (&&) = " + passedAll);
        System.out.println("(sub1 > 90 || sub2 > 90)     (||) = " + topScorer);
        System.out.println("!(sub1 < 35 || sub2 < 35)     (!)  = " + notFailed);

        sc.close();
    }
}
