import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.find(2));

        System.out.println("Wejscie: " + args[0]);

        Stack<String> onp = new Stack<>();
        var operators = new String[]{"+", "-", "*", "/"};
        var tokens = args[0].split("");

        for (var el : tokens) {
            boolean isOperator = false;
            for (var op : operators) {
                if (el.equals(op)) {
                    isOperator = true;
                    try {
                        String x = onp.pop();
                        String y = onp.pop();
                        onp.push("(" + y + el + x + ")");
                    } catch (EmptyStackException e) {
                        System.out.println("BLAD DANYCH WEJSCIOWYCH! Na stosie jest za malo elementow, zeby wykonac operacje!");
                        break;
                    }
                }
            }
            if (isOperator) continue;
            onp.push(el);
        }

        if (onp.getLength() > 1) {
            System.out.print("BLAD DANYCH WEJSCIOWYCH! Koniec algorytmu, a stos nie jest pusty: ");
            for (int i = 0; i <= onp.getLength(); i++) {
                System.out.print(onp.pop() + ", ");
            }
        } else if (!onp.isEmpty())
            System.out.println("Wynik: " + onp.peek());

    }
}