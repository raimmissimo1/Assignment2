package model;

public abstract Person implements Payable , Comparable<Person> {

    private static int genId = 1;

    private int id;
    private String name;
    private String surname;

    public Person(){
        this.id = genId++;

    }

    public Person(String name , String surname){
        this();
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
        return surname;

    }

    public void setSurname(String surname){
        this.surname = surname;

    }

    public abstract String getPosition();

    @Override
    public int compareTo(Person other){
        return Double.compare(this.getPaymentAmount() , other.getPaymentAmount());

    }

    @Override
    public String toString(){
        return id + " " + name + " " + surname;

    }

}
