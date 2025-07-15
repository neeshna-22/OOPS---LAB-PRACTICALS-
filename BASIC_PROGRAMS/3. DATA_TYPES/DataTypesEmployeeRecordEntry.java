import java.util.Scanner;

public class DataTypesEmployeeRecordEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID (int): ");
        int empId = sc.nextInt();

        System.out.print("Enter Age (byte): ");
        byte age = sc.nextByte();

        System.out.print("Enter Years of Experience (short): ");
        short exp = sc.nextShort();

        System.out.print("Enter Phone Number (long): ");
        long phone = sc.nextLong();

        System.out.print("Enter Salary (double): ");
        double salary = sc.nextDouble();

        System.out.print("Enter Working Hours per Day (float): ");
        float hours = sc.nextFloat();

        System.out.print("Enter Gender (char - M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Is Permanent Employee? (true/false): ");
        boolean isPermanent = sc.nextBoolean();

        System.out.println("\n===== EMPLOYEE DETAILS =====");
        System.out.println("Employee ID (int): " + empId);
        System.out.println("Age (byte): " + age);
        System.out.println("Experience (short): " + exp + " years");
        System.out.println("Phone Number (long): " + phone);
        System.out.println("Salary (double): ₹" + salary);
        System.out.println("Working Hours (float): " + hours + " hours/day");
        System.out.println("Gender (char): " + gender);
        System.out.println("Permanent Employee (boolean): " + isPermanent);

        sc.close();
    }
}
