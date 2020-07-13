package data;

import impl.TaskServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class ArrayOfDoubles extends TaskServiceImpl {
    static void arrayOfDoubles (double[] array) {

        Stream<Double> stream1 = (Stream<Double>) Arrays.stream(array);
        double max = stream1.mapToDouble(Double::doubleValue).max().getAsDouble();
        double min = stream1.mapToDouble(Double::doubleValue).min().getAsDouble();
        double sum = stream1.mapToDouble(Double::doubleValue).sum();
        OptionalDouble average = stream1.mapToDouble(Double::doubleValue).average();
        System.out.println(max + " " + min + " " + sum + " " + average);
    }
}
