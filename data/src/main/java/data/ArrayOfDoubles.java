package data;

import impl.TaskServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayOfDoubles extends TaskServiceImpl {
    static void arrayOfDoubles (double[] array) {
        //double[] array = {"Java", "Ruuuuussshhh"};
        //Stream<Double> streamOfArray = Arrays.stream(array);
        //return Arrays.stream(array)

        List<String> list = Arrays.stream(array).min(Double::compare);

        //Optional<Double> min =  Arrays.stream(array).min(Double::compare);
       // Optional<Double> max =  Arrays.stream(array).max(Double::compare);
        System.out.println(min.get());
        System.out.println(max.get());

        double max = Arrays.stream(array).mapToDouble(Double::doubleValue).max().getAsDouble();//16.0
        double min = Arrays.stream(array).mapToDouble(Double::doubleValue).min().getAsDouble();//-6.0
    }
}
