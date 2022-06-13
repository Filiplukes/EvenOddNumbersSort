
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberParameter = args.length;
        Integer consoleEnter = null;

        if (numberParameter < 1) {
            System.out.println("Nebyly zadany vstupni parametry");
            System.exit(0);

        }
        Sorter numbers;
        String typeEnter = args[0];

        try {
            consoleEnter = Integer.parseInt(typeEnter);
        } catch (NumberFormatException e) {

        }

        if (consoleEnter != null) {

            System.out.println("Zdajte prosim ciselnou radu oddelenou carkou");
            Scanner sc = new Scanner(System.in);
            String enterNumbers = sc.nextLine();
            numbers = new Sorter(enterNumbers);
        } else {
            numbers = new Sorter(ReaderFileInput.ReaderFileInput(args[0]));
        }


        if (numberParameter > 1) {

            SaveFileOutpu.saveOutputNumbers(numbers.getSortedNumber(), args[1]);
        } else {
            System.out.println(numbers.getSortedNumber());

        }

    }
}