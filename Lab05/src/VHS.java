import java.time.LocalDate;
import java.util.UUID;

/**
 * Obiekt <code>VHS</code> reprezentuje wypozyczenie filmu
 */
public class VHS {
    /**
     * Pole zawierajace obiekt <code>Movie</code>
     */
    private final Movie movie;
    /**
     * Pole zawierajace uuid wypozyczenia
     */
    private final UUID uuid;
    /**
     * Pole zawierajace date wypozyczenia
     */
    private LocalDate rentalDate;
    /**
     * Pole zawierajace date zwrotu wypozyczenia
     */
    private LocalDate returnDate;

    /**
     * Konstuktor obiektu <code>VHS</code>
     *
     * @param movie      Obiekt <code>Movie</code>
     * @param rentalDate Data wypozyczenia
     * @param returnDate Data zwrotu
     * @param uuid       uuid wypozyczenia
     */
    public VHS(Movie movie, LocalDate rentalDate, LocalDate returnDate, UUID uuid) {
        this.uuid = uuid;
        this.movie = movie;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }

    /**
     * Getter obiektu <code>Movie</code> wypozyczenia
     *
     * @return Obiekt <code>Movie</code>
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Getter daty wypozyczenia
     *
     * @return Data wypozyczenia
     */
    public LocalDate getRentalDate() {
        return rentalDate;
    }

    /**
     * Getter daty zwrotu
     *
     * @return Data zwrotu
     */
    public LocalDate getReturnDate() {
        return returnDate;
    }

    /**
     * Setter daty zwrotu
     *
     * @param returnDate Nowa data zwrotu
     */
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * Setter daty wypozyczenia
     *
     * @param rentalDate Nowa data wypozyczenia
     */
    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    /**
     * Getter UUID wypozyczenia
     *
     * @return UUID wypozyczenia
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Nadpisana funkcja <code>toString()</code>
     *
     * @return Lancuch obiektu <code>VHS</code>
     */
    @Override
    public String toString() {
        return (uuid + "," + movie + "," + rentalDate + "," + returnDate);
    }
}
