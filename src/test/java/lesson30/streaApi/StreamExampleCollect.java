package lesson30.streaApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleCollect {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");


        Set<String> stream = list.stream().collect(Collectors.toSet());
        stream.forEach(System.out::println);
    }
}