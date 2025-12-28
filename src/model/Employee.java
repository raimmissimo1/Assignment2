package model;

public class Employee extends Person{

    private static int nextId = 1;

    private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Employee(){
        this.id = nextId++;
    }

    public Employee(String name , String surname , String position , double salary){
        this.id = nextId++;
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + surname + " " + position + " " + salary;
    }
}

