package data;

import impl.TaskServiceImpl;

import java.util.List;
import java.util.stream.Collectors;


public class ListOfStringRegular extends TaskServiceImpl {
    public static List<String> cutMethod (List<String> text , String regex){

        List<String> output =
                text.stream()
                        .map(s-> {
                            String n = new String(s); // create new instance
                            n = n.replaceAll(regex , " "); // mutate its state
                            System.out.println(n);
                            return n; // return mutated instance
                        })
                        .collect(Collectors.toList());

        return output;
    }
}
