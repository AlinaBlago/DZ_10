package data;

import impl.TaskServiceImpl;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfDaysOfBirthday extends TaskServiceImpl {
        public static Map<Month,Long> listOfDaysOfBirthday (List<LocalDate> dates){

            Map<Month, Long> map = dates.stream()
                    .collect(Collectors.groupingBy(LocalDate::getMonth, Collectors.counting()));
            System.out.println(map);

            return map;
        }
    }

