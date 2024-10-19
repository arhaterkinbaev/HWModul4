class Employee {
    private String name;
    private double baseSalary;
    private String employeeType;

    public Employee(String name, double baseSalary, String employeeType) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getEmployeeType() {
        return employeeType;
    }
}

interface ISalaryCalculator {
    double calculateSalary(Employee employee);
}

class PermanentSalaryCalculator implements ISalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 1.2;
    }
}

class ContractSalaryCalculator implements ISalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 1.1;
    }
}

class InternSalaryCalculator implements ISalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 0.8;
    }
}

class EmployeeSalaryCalculator {
    private ISalaryCalculator calculator;

    public EmployeeSalaryCalculator(ISalaryCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculateSalary(Employee employee) {
        return calculator.calculateSalary(employee);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Асан Әлібек", 50000, "Permanent");
        EmployeeSalaryCalculator salaryCalculator = new EmployeeSalaryCalculator(new PermanentSalaryCalculator());
        double salary = salaryCalculator.calculateSalary(employee);
        System.out.println("Зарплата: " + salary);
    }
}
