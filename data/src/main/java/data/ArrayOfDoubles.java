package data;

import impl.TaskServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class ArrayOfDoubles extends TaskServiceImpl {

    public static void arrayOfDoubles (Double[] array) {

        double max = Arrays.stream(array).mapToDouble(Double::doubleValue).max().getAsDouble();
        double min = Arrays.stream(array).mapToDouble(Double::doubleValue).min().getAsDouble();
        double sum = Arrays.stream(array).mapToDouble(Double::doubleValue).sum();
        double average = Arrays.stream(array).mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println("Max value: " + max + "\nMin value: " + min + "\nSum of numbers: " + sum + "\nAverage of numbers: " + average);
    }


}
