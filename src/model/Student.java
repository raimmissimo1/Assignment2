package model;

public class Student extends Person {

    private static int genId = 1;

    private int id;
    private String name;
    private String surname;
    private double gpa;

    public Student(){
        this.id = genId++;
    }

    public Student(String name , String surname , double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
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

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Person other){
        return double.compare(this.getPaymentAmount() , other.getPaymentAmount());
    }

    @Override
    public String toString(){
        return id + " " + name + " " + surname;
    }
}
