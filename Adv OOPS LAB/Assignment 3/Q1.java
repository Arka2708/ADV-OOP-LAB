/* Q1. Each department s described by dept code (unique), dept name, location. Each employee is described
by emp code (unique), emp name , basic and dept code. Maintain list of departments and list of
employees such that one can:

i) add employee (emp code unique and dept code must exist), add department (dept code unique)
ii) display the details for a given emp code along with corresponding department details.
iii) display details of all employees
iv) find total basic pay for a department
v) remove an employee (given an emp code)
vi) modify basic of an employee
vii) sort the employee list -- according to basic in descending order, according to dept code, according to
emp code
Design and implement the classes. Do the same once considering the list as an array like collection and
again as an linked list like collection.*/

import java.util.*;
class Department {
    private String deptCode, deptName, location;

    public Department(String deptCode, String deptName, String location) {
        this.deptCode = deptCode; this.deptName = deptName; this.location = location;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getLocation() {
        return location;
    }
}

class Employee {
    private String empCode, empName, deptCode;
    private double basic;

    public Employee(String empCode, String empName, double basic, String deptCode) {
        this.empCode = empCode; this.empName = empName; this.basic = basic; this.deptCode = deptCode;
    }

    public String getEmpCode() {
        return empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public double getBasic() {
        return basic;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }
}

class Company {
    private List<Department> departments;
    private List<Employee> employees;

    public Company() {
        departments = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployeeDetails(String empCode) {
        for (Employee employee : employees) {
            if (employee.getEmpCode().equals(empCode)) {
                System.out.println("Employee Details:");
                System.out.println("Employee Code: " + employee.getEmpCode());
                System.out.println("Employee Name: " + employee.getEmpName());
                System.out.println("Basic Pay: " + employee.getBasic());

                for (Department department : departments) {
                    if (department.getDeptCode().equals(employee.getDeptCode())) {
                        System.out.println("Department Details:");
                        System.out.println("Department Code: " + department.getDeptCode());
                        System.out.println("Department Name: " + department.getDeptName());
                        System.out.println("Location: " + department.getLocation());
                        break;
                    }
                }
                break;
            }
        }
    }

    public void displayAllEmployees() {
        System.out.println("All Employees:");
        for (Employee employee : employees) {
            System.out.println("Employee Code: " + employee.getEmpCode());
            System.out.println("Employee Name: " + employee.getEmpName());
            System.out.println("Basic Pay: " + employee.getBasic());
            System.out.println("------------------");
        }
    }

    public double getTotalBasicPay(String deptCode) {
        double totalBasicPay = 0;
        for (Employee employee : employees) {
            if (employee.getDeptCode().equals(deptCode)) {
                totalBasicPay += employee.getBasic();
            }
        }
        return totalBasicPay;
    }

    public void removeEmployee(String empCode) {
        employees.removeIf(employee -> employee.getEmpCode().equals(empCode));
    }

    public void modifyBasicPay(String empCode, double newBasic) {
        for (Employee employee : employees) {
            if (employee.getEmpCode().equals(empCode)) {
                employee.setBasic(newBasic);
                break;
            }
        }
    }

    public void sortEmployeesByBasicDescending() {
        Collections.sort(employees, Comparator.comparingDouble(Employee::getBasic).reversed());
    }

    public void sortEmployeesByDeptCode() {
        Collections.sort(employees, Comparator.comparing(Employee::getDeptCode));
    }

    public void sortEmployeesByEmpCode() {
        Collections.sort(employees, Comparator.comparing(Employee::getEmpCode));
    }
}

public class Q1 {
    public static void main(String[] args) {
        Company company = new Company();

        // Adding departments
        Department dept1 = new Department("D1", "Department 1", "Location 1");
        Department dept2 = new Department("D2", "Department 2", "Location 2");
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Adding employees
        Employee emp1 = new Employee("E1", "Employee 1", 5000, "D1");
        Employee emp2 = new Employee("E2", "Employee 2", 6000, "D1");
        Employee emp3 = new Employee("E3", "Employee 3", 7000, "D2");
        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);

        // Display details for a given emp code
        company.displayEmployeeDetails("E2");

        // Display details of all employees
        company.displayAllEmployees();

        // Find total basic pay for a department
        double totalBasicPay = company.getTotalBasicPay("D1");
        System.out.println("Total Basic Pay for Department D1: " + totalBasicPay);

        // Remove an employee
        company.removeEmployee("E1");
        System.out.println("Employee E1 removed.");

        // Modify basic of an employee
        company.modifyBasicPay("E2", 8000);
        System.out.println("Basic Pay of Employee E2 modified.");

        // Sort the employee list by basic pay in descending order
        company.sortEmployeesByBasicDescending();
        System.out.println("Employees sorted by basic pay (descending):");
        company.displayAllEmployees();

        // Sort the employee list by dept code
        company.sortEmployeesByDeptCode();
        System.out.println("Employees sorted by department code:");
        company.displayAllEmployees();

        // Sort the employee list by emp code
        company.sortEmployeesByEmpCode();
        System.out.println("Employees sorted by employee code:");
        company.displayAllEmployees();
    }
}

