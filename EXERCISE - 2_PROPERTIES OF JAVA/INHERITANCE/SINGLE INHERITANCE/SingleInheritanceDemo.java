// Parent class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class inheriting Person
class Doctor extends Person {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDoctorDetails() {
        displayPersonDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Meera", 40, "Cardiologist");
        d1.displayDoctorDetails();
    }
}
