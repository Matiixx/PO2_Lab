sealed abstract class RandomString permits RandomOct, RandomHex {
    private final int length;

    RandomString(int length) {
        this.length = length;
    }

    abstract public String rand();

    protected int getLength() {
        return length;
    }
}
