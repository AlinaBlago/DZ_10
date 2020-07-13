package data;

import impl.TaskServiceImpl;

import java.util.List;
import java.util.function.UnaryOperator;

public class ListOfUnaryOperators extends TaskServiceImpl {
    public static UnaryOperator <Integer> listOfUnaryOperators (List<UnaryOperator<Integer>> unaryOperators) {
        return unaryOperators.stream()
                .reduce(s -> s, (a, b) -> s -> b.apply(a.apply(s)));
    }
}
