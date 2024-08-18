package in.xenosis.IntermediatePro;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(101, new Employee("Swapnil", "Canva", 50000));
        manager.addEmployee(102, new Employee("Ghamesh", "Intern", 60000));
        manager.addEmployee(103, new Employee("Darshan", "Marketing", 55000));

        System.out.println("Details of Employee with ID 102:");
        Employee employee = manager.getEmployee(102);
        if (employee != null) {
            System.out.println(employee);
        }

        System.out.println("All Employees:");
        manager.displayAllEmployees();
    }
}
