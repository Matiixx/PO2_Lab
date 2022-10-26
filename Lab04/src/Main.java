import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte ar[] = {1, 2, 3};
        BigInt b = new BigInt(ar);
        BigInt c = new BigInt("923");
        System.out.println(b.equals(c));

        byte[] ar2 = {0};
        BigInt d = BigInt.valueOf(ar2);

        for (var el : d.getNum()) {
            System.out.println(el);
        }

        BigInt e = BigInt.plus(b, c);
        System.out.println("" + e);

        //TEST
        for (int i = 0; i < 1000; i++) {
            Random r = new Random();
            Long la = r.nextLong();
            Long lb = r.nextLong();
            if (la + lb < 0 || la < 0 || lb < 0) {
                i--;
                continue;
            }
            System.out.println("Suma longow:" + (la + lb));
            BigInt b1 = new BigInt(String.valueOf(la));
            BigInt b2 = new BigInt(String.valueOf(lb));
            BigInt sum = BigInt.plus(b1, b2);
            System.out.println("Suma Bigint:" + sum);
            System.out.println();
        }

    }
}