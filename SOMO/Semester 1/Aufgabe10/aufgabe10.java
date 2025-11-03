import java.util.Scanner;
import java.util.regex.Pattern;

public final class aufgabe10 {

    private aufgabe10() {}

    private static final Scanner EINGABE = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Format im RegEx format speichern
        //Fomat Std:Minute
        String format = "^(2[0-3]|[01][0-9]):([0-5][0-9])$";

        while (EINGABE.hasNext()) {
            
            String eingabe = EINGABE.next();
            if (!Pattern.matches(format, eingabe)) {
                System.out.println("Ungültige eingabe!");
            }
            else {
                System.out.println("Eingabe: "+eingabe+" wird Akzeptiert.");
            }
        }
    }

}
