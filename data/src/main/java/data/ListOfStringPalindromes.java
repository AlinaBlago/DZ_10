package data;

import impl.TaskServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListOfStringPalindromes extends TaskServiceImpl {
    static List<String> palindromes(List<String> text){
        return text.stream().map(s -> {
            List<String> strings = Arrays.asList(s.trim().split("\\s+"));
            List<String> palindromes = strings.stream().filter(str ->
                    str.equals(new StringBuilder(str).reverse().toString())).collect(Collectors.toList());
            StringBuilder stringBuilder = new StringBuilder();
            palindromes.forEach(str -> stringBuilder.append(str).append(" "));
            if (!stringBuilder.toString().isEmpty()){
                return stringBuilder.toString();
            }
            return null;
         }).filter(Objects::nonNull).collect(Collectors.toList());
    }
}
