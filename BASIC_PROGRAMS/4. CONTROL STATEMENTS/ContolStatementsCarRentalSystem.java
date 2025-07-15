import java.util.Scanner;

public class ContolStatementsCarRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to SpeedRide Car Rentals ===");

        // Age validation using while loop
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        while (age < 18) {
            System.out.print("You must be at least 18 to rent a car. Re-enter age: ");
            age = sc.nextInt();
        }

        // Car selection using switch
        System.out.println("\nSelect Car Type:");
        System.out.println("1. Hatchback - ₹1000/day");
        System.out.println("2. Sedan     - ₹1500/day");
        System.out.println("3. SUV       - ₹2000/day");
        System.out.print("Enter your choice (1-3): ");
        int carType = sc.nextInt();

        int dailyRate = 0;
        switch (carType) {
            case 1: dailyRate = 1000; break;
            case 2: dailyRate = 1500; break;
            case 3: dailyRate = 2000; break;
            default: System.out.println("Invalid car type selected. Defaulting to Hatchback.");
                     dailyRate = 1000;
        }

        // Rental duration
        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();
        int baseCost = dailyRate * days;

        // Travel logs using for loop
        System.out.println("\n=== Daily Travel Log ===");
        for (int i = 1; i <= days; i++) {
            System.out.println("Day " + i + ": Car used for " + (50 + i * 3) + " km");
        }

        // Discount offers using if-else-if
        double discount = 0;
        if (days >= 10) {
            discount = 0.20 * baseCost;
        } else if (days >= 5) {
            discount = 0.10 * baseCost;
        } else if (days >= 3) {
            discount = 0.05 * baseCost;
        }

        double finalAmount = baseCost - discount;

        // Display invoice
        System.out.println("\n=== RENTAL SUMMARY ===");
        System.out.println("Base Cost: ₹" + baseCost);
        System.out.println("Discount : ₹" + discount);
        System.out.println("Final Amount Payable: ₹" + finalAmount);

        // Confirmation using do-while
        String confirm;
        do {
            System.out.print("\nDo you confirm the booking? (yes/no): ");
            confirm = sc.next().toLowerCase();
        } while (!confirm.equals("yes") && !confirm.equals("no"));

        if (confirm.equals("yes")) {
            System.out.println("Booking Confirmed! Enjoy your ride.");
        } else {
            System.out.println("Booking Cancelled.");
        }

        sc.close();
    }
}
