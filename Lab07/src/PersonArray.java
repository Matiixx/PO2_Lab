import pl.edu.agh.fis.lab7.*;

import java.util.stream.Stream;

public class PersonArray {
    private Person[] array;
    private int length;

    PersonArray() {
        array = new Person[0];
        length = 0;
    }

    public void add(Person p) {
        resize();
        array[length - 1] = p;
    }

    private void resize() {
        length++;
        Person[] tmp = new Person[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void printArray() {
        Stream.of(array)
                .forEach(System.out::println);
    }

}
