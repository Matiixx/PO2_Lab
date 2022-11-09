/**
 * Obiekt <code>Movie</code> reprezentuje dany film
 *
 * @author Mateusz Cichostepski
 */
public class Movie {
    /**
     * Pole zawierajace dlugosc filmu
     */
    private final int duration;
    /**
     * Pole zwierajace nazwe filmu
     */
    private final String title;
    /**
     * Pole zawierajace rezysera filmu
     */
    private final String director;

    /**
     * Podstawowy konstruktor Movie
     *
     * @param duration Dlugosc filmu
     * @param title    Nazwa filmu
     * @param director Rezyser filmu
     */
    public Movie(int duration, String title, String director) {
        this.duration = duration;
        this.title = title;
        this.director = director;
    }

    /**
     * Getter nazwy filmu
     *
     * @return Nazwa flimu
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter dlugosci filmu
     *
     * @return Dlugosc filmu
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Getter rezysera filmu
     *
     * @return Rezyser filmu
     */
    public String getDirector() {
        return director;
    }

    /**
     * Nadpisana funkcja <code>toString()</code>
     *
     * @return Lancuch obiektu <code>Movie</code>
     */
    @Override
    public String toString() {
        return (title + "," + duration + "," + director);
    }
}
