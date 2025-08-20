class LoanCalculator {

    // Overloaded method for Home Loan
    double calculateEMI(double principal, double rate, int years) {
        return (principal * rate * years) / 100;
    }

    // Overloaded method for Car Loan
    double calculateEMI(double principal, double rate, int years, double discount) {
        return ((principal * rate * years) / 100) - discount;
    }
}

public class CompileTimePolymorphismDemo {
    public static void main(String[] args) {
        LoanCalculator lc = new LoanCalculator();

        System.out.println("Home Loan EMI: ₹" + lc.calculateEMI(500000, 7.5, 15));
        System.out.println("Car Loan EMI (after discount): ₹" + lc.calculateEMI(800000, 9.0, 7, 25000));
    }
}
