package in.xenosis.IntermediatePro;
import in.xenosis.IntermediatePro.Employee;

import java.util.HashMap;
import java.util.Map;

class EmployeeManager {
    private Map<Integer, Employee> employeeMap;

    public EmployeeManager() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(int id, Employee employee) {
        employeeMap.put(id, employee);
        System.out.println("Employee added with ID: " + id);
    }

    public Employee getEmployee(int id) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            return employee;
        } else {
            System.out.println("Employee with ID " + id + " not found.");
            return null;
        }
    }

    public void displayAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("List of all employees:");
            employeeMap.forEach((id, employee) ->
                    System.out.println("ID: " + id + ", " + employee));
        }
    }
}