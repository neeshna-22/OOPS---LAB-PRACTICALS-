import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter your Name         : ");
        String name = sc.nextLine();

        System.out.print("Enter your Age          : ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter your Roll Number  : ");
        String rollNo = sc.nextLine();

        System.out.print("Enter your Department   : ");
        String department = sc.nextLine();

        System.out.print("Enter your Course       : ");
        String course = sc.nextLine();

        System.out.print("Enter your Subject      : ");
        String subject = sc.nextLine();

        System.out.println("\n========== STUDENT DETAILS ==========");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Department  : " + department);
        System.out.println("Course      : " + course);
        System.out.println("Subject     : " + subject);
        System.out.println("=====================================");

        sc.close();
    }
}
