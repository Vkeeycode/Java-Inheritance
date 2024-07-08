public class Main {
    public static void main(String[] args) {
       /* Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
       /* Rectangle rectangle = new Rectangle(2.0, 5.0);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

   }*/
        Employee employee = new Employee(5000);
        HRmanager hRmanager = new HRmanager(8000);
        employee.work();
        System.out.println("Employee's Salary: " + employee.getSalary());
        hRmanager.work();
        System.out.println("Human Resource Manager's Salary: " + hRmanager.getSalary());
        hRmanager.addEmployee();
    }
}
