import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Class obClass = HackMe.class;

        Constructor[] consts = obClass.getDeclaredConstructors();

        System.out.println(consts.length);

        for (int i = 0; i < consts.length; i++) {
            System.out.println(consts[i]);
        }

        // A -> int (get, set)
        // B -> int (get)
        // C -> String (get, set)
        // D -> double (get)

        Method[] declarMethods = obClass.getDeclaredMethods();
        System.out.println();
        System.out.println(declarMethods);

        for (int i = 0; i < declarMethods.length; i++) {
            String mn = declarMethods[i].getName();
            Type[] tt = declarMethods[i].getGenericParameterTypes();
            System.out.println(declarMethods[i]);
        }

        Field[] fields = obClass.getDeclaredFields();
        System.out.println("Fields:");
        System.out.println(fields);

        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        System.out.println();

        try {
            int[] arr = { 1, 12 };
            Method h = HackMe.class.getDeclaredMethod("hackMeOf", int.class, int.class, int[].class);
            h.setAccessible(true);
            HackMe obj = (HackMe) h.invoke(null, 1, 1, arr);

            System.out.println(obj);

        } catch (Exception e) {
            System.out.println("Blad " + e.getMessage());
        }

        System.out.println();

        Class[] classes = obClass.getDeclaredClasses();
        System.out.println("Classes:");

        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }

        Class insider = obClass.getDeclaredClasses()[0];

        Field[] insiderFields = insider.getDeclaredFields();

        for (int i = 0; i < insiderFields.length; i++) {
            System.out.println(insiderFields[i]);
        }

    }
}