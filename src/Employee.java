
public class Employee {
    private String name;
    private String middleName;
    private String surname;
    private int otdel;
    private int salary;
    Counter counter;

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
}
