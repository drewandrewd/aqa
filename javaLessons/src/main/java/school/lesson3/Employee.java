package school.lesson3;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + this.getName());
        System.out.println("Должность: " + this.getPosition());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Телефон: " + this.getNumber());
        System.out.println("Зарплата: " + this.getSalary());
        System.out.println("Возраст: " + this.getAge());
        System.out.println();
    }

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Andrey Andreev", "Programmer", "drew@mail.com", "8922222222", 100000, 28);
        employeeArray[1] = new Employee("Ivan Ivanov", "QA", "iva@mail.com", "89777777777", 150000, 25);
        employeeArray[2] = new Employee("Vlad Vladov", "CEO", "vv@mail.com", "89999999999", 1050000, 41);
        employeeArray[3] = new Employee("Phil Philov", "CTO", "phil@mail.com", "89255555555", 1000000, 48);
        employeeArray[4] = new Employee("Dan Danov", "PM", "dan@mail.com", "89000000000", 500000, 38);
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].age > 40) {
                employeeArray[i].info();
            }
        }
    }
}
