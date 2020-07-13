package data;

import impl.TaskServiceImpl;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class ArrayOfInts extends TaskServiceImpl {
    public static void arrayOfInts(List<Integer> integers){
        List<Integer> evenNumbers = integers.stream()
                .filter(x -> x % 2 == 0)
                .sorted((a, b) -> Double.compare(b, a))
                .collect(toList());
        List<Integer> oddNumbers = integers.stream()
                .filter(x -> x % 2 != 0)
                .sorted((a, b) -> Double.compare(b, a))
                .collect(toList());

        System.out.println("Array of even numbers: \n" + evenNumbers + "\nArray of odd numbers: \n" + oddNumbers);

    }
}

