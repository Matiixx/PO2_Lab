package pl.edu.agh.fis.lab7;

public class Dean extends Person {
    private int startYear;
    private String degree;
    private int endYear;

    @Override
    public Dean greater(Person ob) {
        if (this == ob) return this;
        if (!(ob instanceof Dean obDean)) return null;
        if (
                (endYear - startYear) > (obDean.getEndYear() - obDean.getStartYear())
        ) return this;
        return (Dean) ob;
    }

    public Dean(String deg, String fn, String ln, int start, int end) {
        super(fn, ln);
        degree = deg;
        startYear = start;
        endYear = end;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int end) {
        endYear = end;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String d) {
        degree = d;
    }

    @Override
    public String toString() {
        return degree + " " +
                super.toString() +
                ", Dean of the Faculty from " + startYear +
                " to " + endYear;
    }

}
