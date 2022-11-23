package pl.edu.agh.fis.lab7;

public class Student extends Person {

    private int idNumber;
    private double average;

    @Override
    public Student greater(Person ob) {
        if (this == ob) return this;
        if (!(ob instanceof Student obPerson)) return null;
        if (this.getAverage() > obPerson.getAverage()) return this;
        return (Student) ob;
    }

    public Student(String fn, String ln, int id, double avg) {
        super(fn, ln);
        idNumber = id;
        average = avg;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double a) {
        average = a;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", id number: " + idNumber +
                ", average: " + average;
    }
}
