import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {

        if(args.length == 2)
        {
            int n = Integer.parseInt(args[0]);
            double r_max = Double.parseDouble(args[1]);

            Random rand = new Random();
            double alfa, r, x, y;
            for(int i = 0; i < n; i++)
            {
                alfa = rand.nextDouble() * 2 * Math.PI;
                r = rand.nextDouble() * r_max;
                x = r * Math.cos(alfa);
                y = r * Math.sin(alfa);    
                System.out.println(x + " " + y);           
            }
        }
    }

}
