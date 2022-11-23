import pl.edu.agh.fis.lab7.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PersonArray pa = new PersonArray();

        Student p1 = new Student("Agnieszka", "Machowska", 465988, 4.5);
        Student p2 = new Student("Takuya", "Theophila", 465989, 4.3);
        Graduate g1 = new Graduate("Ruy", "Brunhilda", 456213, 3.0, LocalDate.now());
        Dean d1 = new Dean("dr", "Jan", "Kowalski", 2010, 2020);

        pa.add(p1);
        pa.add(p2);
        pa.add(g1);
        pa.add(d1);

        pa.printArray();
    }

}
