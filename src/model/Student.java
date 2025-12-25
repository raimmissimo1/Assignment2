package model;

public class Student extends Person, implements Comparable<Student>{

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
    public int compare(Student anotherStudent){
        if(gpa > anotherStudent.gpa)return 1;
        if(gpa < anotherStudent.gpa)return -1;
        else return 0;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + surname;
    }
}
