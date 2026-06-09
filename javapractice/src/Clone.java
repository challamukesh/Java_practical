class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Original object
        Employee emp1 = new Employee(101, "Mukesh", 50000);

        // Clone object
        Employee emp2 = (Employee) emp1.clone();

        // Modify cloned object
        emp2.name = "Ravi";
        emp2.salary = 60000;

        // Display both objects
        System.out.println("Original Employee:");
        System.out.println(emp1.id + " " + emp1.name + " " + emp1.salary);

        System.out.println("Cloned Employee:");
        System.out.println(emp2.id + " " + emp2.name + " " + emp2.salary);
    }
}