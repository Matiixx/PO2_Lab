import java.nio.CharBuffer;

final class RandomHexAdapter extends RandomHex implements Readable {
    private int count;

    RandomHexAdapter(int length, int count) {
        super(length);
        this.count = count;
    }

    @Override
    public String rand() {
        return super.rand();
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- > 0) {
            cb.append(super.rand() + " ");
            return super.getLength() + 1;
        }
        return -1;
    }
}
