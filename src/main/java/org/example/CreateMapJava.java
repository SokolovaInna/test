package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CreateMapJava {
  public static Map<Integer, Long> countElements(List<Integer> list) {
    return list.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  public static Map<Integer, Long> countElements(Integer[] array) {
    return Arrays.stream(array)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  public static void main(String[] args) {
    List<Integer> numbersList = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
    Map<Integer, Long> countsList = countElements(numbersList);
     System.out.println(countsList);

    Integer[] numbersArr = {1, 3, 4, 5, 1, 5, 4};
    Map<Integer, Long> countsArr = countElements(numbersArr);
    System.out.println(countsArr);

  }

}
