package data;

import impl.TaskServiceImpl;

import java.time.Year;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOfYears extends TaskServiceImpl {
    public static void collectionOfYears(Year[] array) {

        Stream<Year> mainStream = (Stream<Year>) Arrays.stream(array);


        List<Year> years = mainStream.filter(year -> year.atMonth(2).lengthOfMonth() == 29)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("List of leap years: " + years.toString());

    }



}
