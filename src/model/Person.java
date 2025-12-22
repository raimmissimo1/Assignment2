package model;

public abstract Person extends Payable {

    private static int nextId = 1;

    private int id;
    private String name;
    private String surname;

    public Person(){
        this.id = nextId++;
    }

    public Person(String name , String surname){
        this.id = nextId++;
        setName(name);
        setSurname(surname);
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
        return surname;;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public abstract String getPosition();

    @Override
    public String toString(){
        return id + " " + name + " " + surname;
    }

}
