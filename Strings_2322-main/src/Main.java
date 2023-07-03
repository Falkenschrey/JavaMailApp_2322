import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String text = "Hello, world!";
        System.out.println(text.length());

        System.out.println(text.isEmpty());
        String leerzeichen = " ";
        System.out.println(leerzeichen.isEmpty());
        System.out.println(leerzeichen.isBlank());

        String empty = null;
        //System.out.println(empty.isBlank());
        //System.out.println(empty.isEmpty()); // if (empty != null) { empty.isEmpty();}
        System.out.println(leerzeichen == "");
        System.out.println(text.length() > 0);

        //trim
        String text2 = "     'Hello, world!'     ";
        System.out.println(text2.trim());
        //replace
        System.out.println(text2.trim().replace(",", " -"));

        //yuriy@beck.de = 3@3.2
        String name = "Yuriy Beck";
        String[] splitted = name.split(" ");

        System.out.println(Arrays.toString(splitted));
        System.out.println(splitted.toString());
        //
        String firstname = splitted[0];
        String lastname = splitted[1];
        System.out.println("FIRSTNAME: " + firstname);
        System.out.println("LASTNAME: " + lastname);

        // %s -> string
        // %d -> decimal
        // %f -> float
        // %c -> chars
        // %b -> boolean
        int age = 36;
        String template = "Hallo %s, du bist %d Jahre alt!";
        String formattedString = String.format(template, firstname, age);
        System.out.println(formattedString);

        template = "Hallo %s %s, du bist 36 Jahre alt!";
        formattedString = String.format(template, splitted);
        System.out.println(formattedString);

        template = "Hallo %s %s, du bist %s Jahre alt!";
        String[] list = new String[3];
        list[0] = firstname;
        list[1] = lastname;
        list[2] = String.valueOf(age);
        formattedString = String.format(template, list);
        System.out.println(formattedString);

    }
}