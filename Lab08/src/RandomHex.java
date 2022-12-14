import java.util.Random;

sealed class RandomHex extends RandomString permits RandomHexAdapter {

    private final String[] symbols = {"A", "B", "C", "D", "E", "F"};

    RandomHex(int length) {
        super(length);
    }

    @Override
    public String rand() {
        Random r = new Random();
        String s = "";
        for (int i = 0; i < super.getLength(); i++) {
            int ran = r.nextInt(16);
            s += ran < 10 ? ran : symbols[ran % 10];
        }
        return s;
    }
}
