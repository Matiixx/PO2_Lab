import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RandomString randomOct = new RandomOct(20);
        System.out.println(randomOct.rand());

        RandomString randomHex = new RandomHex(20);
        System.out.println(randomHex.rand());

        Scanner scanner = new Scanner(new RandomHexAdapter(35, 6));
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }
}