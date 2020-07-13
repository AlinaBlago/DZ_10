import data.*;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1:");
        System.out.println("_____________________________");
        Double[] arr = {1.0,2.0,3.0,4.0};
        ArrayOfDoubles.arrayOfDoubles(arr);

        System.out.println("\nTask 2:");
        System.out.println("_____________________________");
        CollectionOfYears task2 = new CollectionOfYears();
        Year[] years = {Year.of(2000), Year.of(2001), Year.of(2002), Year.of(2003), Year.of(2004), Year.of(2015), Year.of(1996), Year.of(1800)};
        task2.collectionOfYears(years);

        System.out.println("\nTask 3:");
        System.out.println("_____________________________");
        ArrayList<String> list = new ArrayList<String>();
        list.add("asda12asd1 dw12");
        list.add("akndasndo");
        list.add(" __ 123123  213 123");

        ListOfStringRegular.cutMethod(list , "[0-9]");


        System.out.println("\nTask 4:");
        System.out.println("_____________________________");
        List<String> stringWithPalindromes = Arrays.asList(" radar", " deified", " level", " cat");
        ListOfStringPalindromes.listOfStringPalindromes(stringWithPalindromes);


        System.out.println("\nTask 6:");
        System.out.println("_____________________________");
        ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.of(2000,10,2));
        dates.add(LocalDate.of(2000,10,12));
        dates.add(LocalDate.of(2000,10,15));
        dates.add(LocalDate.of(2000,7,2));

        System.out.println("Number of birthday in every month: ");
        ListOfDaysOfBirthday.listOfDaysOfBirthday(dates);


        System.out.println("\nTask 7:");
        System.out.println("_____________________________");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        ArrayOfInts.arrayOfInts(integers);


        System.out.println("\nTask 8:");
        System.out.println("_____________________________");
        List<UnaryOperator<Integer>> unaryOperators = new ArrayList<>();
        unaryOperators.add(x -> x * x);
        unaryOperators.add(x -> x + x);
        unaryOperators.add(x -> x * 2);
        int num = 2;
        Integer resultOperations = ListOfUnaryOperators.listOfUnaryOperators(unaryOperators).apply(num);
        System.out.println("Number: " + num);
        System.out.println("l1 = x * x; \nl2 = x + x; \nl3 = x * 2");
        System.out.println("Result of union: " + resultOperations);




    }
}
