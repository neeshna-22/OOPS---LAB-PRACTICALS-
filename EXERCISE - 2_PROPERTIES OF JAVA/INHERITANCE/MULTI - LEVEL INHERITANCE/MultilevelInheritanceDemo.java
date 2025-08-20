// Base class
class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}

// Intermediate class
class Order extends Product {
    int quantity;

    Order(String productName, double price, int quantity) {
        super(productName, price);
        this.quantity = quantity;
    }

    double calculateTotal() {
        return price * quantity;
    }
}

// Child class
class Invoice extends Order {
    String customerName;

    Invoice(String customerName, String productName, double price, int quantity) {
        super(productName, price, quantity);
        this.customerName = customerName;
    }

    void generateInvoice() {
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Rahul", "Laptop", 55000, 2);
        invoice.generateInvoice();
    }
}
