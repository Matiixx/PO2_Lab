import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Lab02 {

    public static void main(String[] args) {

        int monthNumber = LocalDate.now().getMonthValue();
        int yearNumber = LocalDate.now().getYear();

        if (args.length == 2 || args.length == 4) {
            if (args[0].equals("-m")) {
                monthNumber = Integer.parseInt(args[1]);
                if (monthNumber > 12 || monthNumber < 1) monthNumber = LocalDate.now().getMonthValue();
            }
        }

        if (args.length == 4) {
            if (args[2].equals("-y")) {
                yearNumber = Integer.parseInt(args[3]);
            }
        }

//        System.out.println(monthNumber + " " + yearNumber);

        Month month = LocalDate.of(yearNumber, monthNumber, 1).getMonth();
        int year = LocalDate.of(yearNumber, monthNumber, 1).getYear();
        int dom = 1;
        if (args.length == 0)
            dom = LocalDate.now().getDayOfMonth();
//        DayOfWeek dow = LocalDate.of(yearNumber, monthNumber, 1).getDayOfWeek();
        int lengthOfMonth = month.length(LocalDate.of(yearNumber, monthNumber, 1).isLeapYear());


        int firstDayOfMonth = LocalDate.of(yearNumber, monthNumber, 1).getDayOfWeek().getValue();

        System.out.printf("%20s", month.getDisplayName(TextStyle.FULL_STANDALONE, new Locale("pl")) + " " + year);
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%4s", DayOfWeek.values()[i].getDisplayName(TextStyle.NARROW_STANDALONE, new Locale("pl")) + "  ");
        }
        System.out.println();

        for (int i = 0; i < firstDayOfMonth - 1; i++) {
            System.out.print("    ");
        }

        boolean afterToday = false;
        for (int i = 1; i <= lengthOfMonth; i++) {
            if ((firstDayOfMonth - 1 + i - 1) % 7 == 0) {
                System.out.println();
                afterToday = false;
            }
            if (args.length == 0 && i == dom) {
                System.out.printf("%5s", i + "*");
                afterToday = true;
            } else if (afterToday) {
                System.out.printf("%3d", i);
                afterToday = false;
            } else
                System.out.printf("%4d", i);
        }
    }
}