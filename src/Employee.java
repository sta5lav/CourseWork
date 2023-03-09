import java.util.Objects;

public class Employee {
    private final String name;
    private final String middleName;
    private final String surname;
    private int otdel;
    private int salary;
    private static int id = 1;

    public Employee(String name, String middleName, String surname, int otdel, int salary) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.otdel = otdel;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public int getOtdel() {
        return otdel;
    }

    public int getSalary() {
        return salary;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getId() {
        return id++;
    }

    @Override
    public String toString() {
        return "ID сотрудника " + getId() +
                " Ф.И.О. = " + name +
                " " + middleName +
                " " + surname +
                ", Отдел = " + otdel +
                ", Зарплата = " + salary;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, middleName, surname, otdel, salary, id);
    }
}
