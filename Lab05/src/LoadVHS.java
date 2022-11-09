import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Obiekt <code>LoadVHS</code> pozwala na wczytanie obiektow <code>VHS</code> z pliku tekstowego
 */
public class LoadVHS {
    /**
     * Prywatny konstruktor podstawowy
     */
    private LoadVHS() {
    }

    /**
     * Tworzy tablice obiektow <code>VHS</code> wczytych z pliku tekstowego i wypisze zawartosc tablicy w konsoli
     *
     * @param filename Sciezka do pliku tekstowego
     */
    public static void LoadFromFile(String filename) {
        try {
            BufferedReader f = new BufferedReader(
                    new FileReader(filename));
            var rows = f.lines().toArray();
            VHS[] VHSArray = new VHS[rows.length - 1];

            for (int i = 1; i <= VHSArray.length; i++) {
                String[] row = String.valueOf(rows[i]).split(",");
                Movie newMovie = new Movie(Integer.parseInt(row[2]), row[1], row[3]);
                VHS newVHS = new VHS(newMovie, LocalDate.parse(row[4]), LocalDate.parse(row[5]), UUID.fromString(row[0]));
                VHSArray[i - 1] = newVHS;
            }

            for (var el : VHSArray) {
                System.out.println(el);
            }
            System.out.println("Ilosc elementow: " + VHSArray.length);


        } catch (IOException e) {
            System.out.println("File cannot be open" + e);
        }
    }
}
