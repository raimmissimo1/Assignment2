package model;

public class Student extends Person {

    private double gpa;

    public Student(){
        super();

    }

    public Student(String name , String surname , double gpa){
        this();
        super(name , surname);
        setGpa(gpa);

    }

    public double getGpa(){
        return gpa;

    }

    public void setGpa(double gpa){
        this.gpa = gpa;

    }

    @Override
    public String getPosition(){
        return "Student";

    }

    @Override
    public int compareTo(Person other){
        if(gpa > 2.67){
            return 36660.0;

        }
        return 0.0;

    }



    @Override
    public String toString(){
        return "Student " + super.toString();

    }
}
