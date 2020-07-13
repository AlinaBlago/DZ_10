package data;

import impl.TaskServiceImpl;

import java.util.List;
import java.util.stream.Collectors;


public class ListOfStringRegular extends TaskServiceImpl {
    public static List<String> cutMethod (List<String> text){
        return text.stream()
        .map(Character::toUpperCase)
        .filter(c -> !Character.isDigit((Character) c))
        .filter(c -> !Character.isSpaceChar((Character) c))
        .mapToObj(c -> String.valueOf((char) c))
        .collect(Collectors.toList());
    }
}
