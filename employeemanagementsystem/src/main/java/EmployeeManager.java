import java.util.ArrayList;

public class EmployeeManager {
    private final ArrayList<Employee> employees;

    // Constructor
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Display all employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }

    // Optional: Update an employee's details
    public void updateEmployee(int id, String name, String department, double salary) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setName(name);
                e.setDepartment(department);
                e.setSalary(salary);
                System.out.println("Employee updated: " + e);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // Optional: Remove an employee by ID
    public void removeEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
    }
}
