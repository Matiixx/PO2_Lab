package pl.edu.agh.fis.lab7;

import java.time.LocalDate;

public class Graduate extends Student {

    private LocalDate graduationDate;

    public Graduate(String fn, String ln, int id, double avg, LocalDate gradDate) {
        super(fn, ln, id, avg);
        graduationDate = gradDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", graduation date: " + graduationDate;
    }
}
