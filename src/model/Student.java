package model;

public class Student extends Person{

    private static int nextId = 1;

    private int id;
    private String name;
    private String surname;
    private double gpa;

    public Student(){
        this.id = nextId++;
    }

    public Student(String name , String surname , double gpa){
        this.id = nextId++;
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
    public String toString(){
        return id + " " + name + " " + surname;
    }
}
