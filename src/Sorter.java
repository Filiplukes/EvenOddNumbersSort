import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {

    private List<Integer> numbers = new ArrayList<>();
    private boolean even;

    private boolean evenNumbers() {


        if (this.numbers.size() % 2 == 0) {
            return true;

        }
        return false;
    }

    public Sorter(String text) {

        if (text.equals("")) {
            System.out.println("Prazdny text");
            return;
        }

        String textArray[] = text.split(",");


        for (String slovo : textArray) {

            try {
                this.numbers.add(Integer.parseInt(slovo));
            } catch (NumberFormatException e) {

                System.out.println("Obsahuje hodnotu neodpovidajici cislu");

            }
        }
        this.even = evenNumbers();
    }


    public String getSortedNumber() {


        String sortedNumbers = this.numbers.stream().
                filter(i -> (i % 2 == 0) == this.even).
                map(Object::toString).
                collect(Collectors.joining(",")).toString();

        return sortedNumbers;

    }


    public String getSortedNumber2() {
        String sortedNumbers = "";
        for (Integer number : numbers) {

            if ((number % 2 == 0) == this.even) {
                sortedNumbers += number + ",";
            }
        }
        sortedNumbers = sortedNumbers.substring(0, sortedNumbers.length() - 1);
        return sortedNumbers;

    }


}
