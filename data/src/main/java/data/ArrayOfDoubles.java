package data;

import impl.TaskServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayOfDoubles extends TaskServiceImpl {
    static void arrayOfDoubles (double[] array) {

        Stream<Double> stream1 = (Stream<Double>) Arrays.stream(array);
        stream1.mapToDouble(Double::doubleValue).max().getAsDouble();
        stream1.mapToDouble(Double::doubleValue).min().getAsDouble();
    }
}
