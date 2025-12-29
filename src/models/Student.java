package models;

public class Student extends Person {

    private double gpa;
    private double bonus;

    public Student(){}

    public Student(String name , String surname , double gpa) {
        super(name , surname);
        setGpa(gpa);
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
        calculateBonus();
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    private void calculateBonus() {
        if (gpa > 3.67) {
            bonus = getPaymentAmount() * 0.10;
        } else {
            bonus = 0.0;
        }
    }

    private double getBasePayment() {
        return gpa > 2.67 ? 36660.0 : 0.0;
    }

    @Override
    public String getPosition(){
        return "Student";
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount()
        );
    }

    @Override
    public double getPaymentAmount(){
        if(gpa > 3.67){
            return getBasePayment() + bonus;
        }
        else if(gpa > 2.67 && gpa < 3.67){
            return getBasePayment();
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format(
                "Student %s is a %s. Base: %.2f. Bonus: %.2f. Total: %.2f",
                super.toString(),
                getPosition(),
                getBasePayment(),
                bonus,
                getPaymentAmount()
        );
    }


}
