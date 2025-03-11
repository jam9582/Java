
class Employee {
    private String name;
    private double money;

    public Employee(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void Info() {
        System.out.println("직원의 이름: " + name);
        System.out.println("급여: " + money + "만 원");
    }

}

class Manager extends Employee {
    private String position;

    public Manager(String name, double money, String position) {
        super(name, money);
        this.position = position;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("직책: " + position);
    }
}

public class task1 {
    public static void main(String[] args) {

        Employee employee = new Employee("권재은", 300);
        employee.Info();
        System.out.println();

        Manager manager = new Manager("미래의 권재은", 500, "팀장");
        manager.Info();
    }
}

