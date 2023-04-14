import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private final Map<String, Employee> employees;

    public EmployeeBook() {
        employees = new HashMap<>();
    }

    public String getKey(Employee employee) {
        return employee.getName() + " " + employee.getSurname();
    }

    public String addEmployee(Employee employee) {
        if (employees.containsKey(getKey(employee)) || getKey(employee) == null) {
            throw new RuntimeException();
        }
        employees.put(getKey(employee), employee);
        return ("Добавлены данные о сотруднике: " + employees.get(getKey(employee)));
    }

    public Employee removeEmployee(Employee employee) {
        if (!employees.containsKey(getKey(employee))) {
            throw new RuntimeException();
        }
        return employees.remove(getKey(employee));
    }

    public Employee findEmployee(Employee employee) {
        if (!employees.containsKey(getKey(employee))) {
            throw new RuntimeException();
        }
        return employees.get(getKey(employee));
    }

    @Override
    public String toString() {
        return  "employees=" + employees;
    }
}
