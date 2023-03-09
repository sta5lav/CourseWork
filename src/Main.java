import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иван", "Иванович", "Иванов", 1, 30000);
        employee[1] = new Employee("Сергей", "Петрович", "Петров", 1, 32000);
        employee[2] = new Employee("Петр", "Николаевич", "Сидоров", 1, 31000);
        employee[3] = new Employee("Федор", "Петрович", "Рыжов", 2, 44000);
        employee[4] = new Employee("Николай", "Сергеевич", "Смирнов", 2, 44000);
        employee[5] = new Employee("Сергей", "Максимович", "Попов", 4, 32000);
        employee[6] = new Employee("Станислав", "Александрович", "Кузнецов", 3, 25000);
        employee[7] = new Employee("Александр", "Геннвдьевич", "Соколов", 3, 26000);
        employee[8] = new Employee("Евгений", "Петрович", "Лебедев", 5, 51000);
        employee[9] = new Employee("Иван", "Викторович", "Васильев", 5, 55000);
        /*1*/
        System.out.println("a. Список всех сотрудников ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }

        /*2*/
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("b. Сумма затрат на зарплаты в месяц = " + sum);
        /*3*/
        int min = employee[0].getSalary();
        String minSalary = null;
        for (int i = 0; i < employee.length; i++) {
            if (min > employee[i].getSalary()) {
                min = employee[i].getSalary();
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (min == employee[i].getSalary()) {
                minSalary = employee[i].getName() + " " + employee[i].getMiddleName() + " " + employee[i].getSurname();
            }
        }
        System.out.println("с. Сотрудник с минимальной зарплатой: " + minSalary + " (" + min + ") ");

        /*4*/
        int max = employee[0].getSalary();
        String maxSalary = null;
        for (int i = 0; i < employee.length; i++) {
            if (max < employee[i].getSalary()) {
                max = employee[i].getSalary();
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (max == employee[i].getSalary()) {
                maxSalary = employee[i].getName() + " " + employee[i].getMiddleName() + " " + employee[i].getSurname();
            }
        }
        System.out.println("d. Сотрудник с максимальной зарплатой: " + maxSalary + " (" + max + ") ");

        /*5*/
        int middleSum = 0;
        middleSum = sum / employee.length;
        System.out.println("e. Среднее значение зарплат = " + middleSum);

        /*6*/
        System.out.println("f. Список всех сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName() + " " + employee[i].getMiddleName() + " " + employee[i].getSurname());
        }

    }


}