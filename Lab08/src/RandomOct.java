import java.util.Random;

final class RandomOct extends RandomString {

    RandomOct(int length) {
        super(length);
    }

    @Override
    public String rand() {
        Random r = new Random();
        String s = "";
        for (int i = 0; i < super.getLength(); i++) {
            s += (r.nextInt(8));
        }
        return s;
    }
}
