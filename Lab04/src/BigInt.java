import java.util.Arrays;

public final class BigInt {

    public static final BigInt ZERO = new BigInt(new byte[]{0});
    public static final BigInt ONE = new BigInt(new byte[]{1});
    public static final BigInt TWO = new BigInt(new byte[]{2});
    public static final BigInt TEN = new BigInt(new byte[]{1, 0});

    private byte arr[];

    BigInt(byte[] a) {
        arr = Arrays.copyOf(a, a.length);
    }

    BigInt(String str) {
        arr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Byte.parseByte(String.valueOf(str.charAt(i)));
        }
    }

    public static BigInt valueOf(byte[] ar) {
        if (ar.equals(ZERO.arr) == true) return ZERO;
        else if (ar.equals(ONE.arr) == true) return ONE;
        else if (ar.equals(TWO.arr) == true) return TWO;
        else if (ar.equals(TEN.arr) == true) return TEN;
        return new BigInt(ar);
    }

    public static BigInt valueOf(String str) {

        return switch (str) {
            case "0" -> ZERO;
            case "1" -> ONE;
            case "2" -> TWO;
            case "10" -> TEN;
            default -> new BigInt(str);
        };
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof BigInt oBigInt)) return false;
        if (this.arr.length != oBigInt.arr.length) return false;
        for (int i = 0; i < this.arr.length; i++) {
            if (Byte.compare(this.arr[i], oBigInt.arr[i]) != 0) return false;
        }
        return true;
    }

    public byte[] getNum() {
        return Arrays.copyOf(this.arr, this.arr.length);
    }

    public byte getDigit(int i) {
        if (i < 0) return 0;
        return Byte.valueOf(this.arr[i]);
    }

    @Override
    public String toString() {
        String s = "";
        for (var el : this.arr) {
            s += String.valueOf(el);
        }
        return s;
    }

    public static BigInt plus(BigInt a, BigInt b) {
        byte[] sum = new byte[Math.max(a.arr.length, b.arr.length) + 1];
        byte next = 0;
        for (int aIndex = a.arr.length - 1, bIndex = b.arr.length - 1, sumIndex = sum.length - 1;
             (aIndex >= 0 || bIndex >= 0);
             aIndex--, bIndex--, sumIndex--) {
            int s = a.getDigit(aIndex) + b.getDigit(bIndex) + next;
            if (s >= 10) {
                s = s % 10;
                next = 1;
            } else next = 0;
            sum[sumIndex] = Byte.parseByte(String.valueOf(s));
//            System.out.println(sumIndex);
        }
//        sum[0] += next;
        if (sum[0] == 0) {
            return new BigInt(Arrays.copyOfRange(sum, 1, sum.length));
        }
        return new BigInt(sum);
    }

}
