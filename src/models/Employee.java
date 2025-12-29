package models;

public class Employee extends Person {

    private String position;
    private double salary;
    private double bonus;

    public Employee() {
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        calculateBonus();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    private void calculateBonus() {
        if (salary > 100000) {
            bonus = salary * 0.10;
        } else if (salary >= 50000 && salary < 100000) {
            bonus = salary * 0.075;
        } else {
            bonus = 0;
        }
    }

    @Override
    public double getPaymentAmount() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee %s is a %s. He earned: %.2f. His bonus is: %.2f. Total is: %.2f",
                super.toString(),
                position,
                salary,
                bonus,
                getPaymentAmount()
        );
    }

}