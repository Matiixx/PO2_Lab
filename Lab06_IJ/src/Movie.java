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

        assert duration >= 0 : "Duration cannot be less than 0";


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

    public int length(String fieldName) {
        if (fieldName.equals("title") == true) {
            return this.title.length();
        } else if (fieldName.equals("director") == true) {
            return this.director.length();
        } else if (fieldName.equals("duration") == true) {
            return Integer.toBinaryString(this.duration).length();
        }
        assert false : "Wrong fieldName";
        return -1;
    }

    /**
     * Test asserrtion class Movie
     */
    public static void main() {
//        Movie m = new Movie(-12,"Dir", "");
        Movie m2 = new Movie(12, "Dir", "Dir");
        m2.length("duration");
        m2.length("title");
        m2.length("director");
//        m2.length("test");

    }
}
