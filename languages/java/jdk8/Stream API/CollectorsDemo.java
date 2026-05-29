import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Rahul",
                "Amit",
                "Priya",
                "Rahul"
        );

        List<String> nameList = names.stream()
                .collect(Collectors.toList());

        Set<String> nameSet = names.stream()
                .collect(Collectors.toSet());

        Map<String, Integer> nameLengthMap = names.stream()
                .distinct()
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));

        String joinedNames = names.stream()
                .collect(Collectors.joining(", "));

        Long count = names.stream()
                .collect(Collectors.counting());

        System.out.println("toList(): " + nameList);
        System.out.println("toSet(): " + nameSet);
        System.out.println("toMap(): " + nameLengthMap);
        System.out.println("joining(): " + joinedNames);
        System.out.println("counting(): " + count);
    }
}
