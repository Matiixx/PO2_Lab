package pl.edu.agh.fis.lab7;

import java.lang.instrument.ClassDefinition;

abstract public class Person {
    private String firstName;
    private String lastName;

    abstract public Person greater(Person ob);

    Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public void setFirstName(String a) {
        firstName = a;
    }

    public void setLastName(String a) {
        lastName = a;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}


