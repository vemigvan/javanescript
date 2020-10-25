package Task1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        //Part1();
        //Part2(10);
        Part3("sjdhgfsjkavchjwagehf");

    }

    public static void Part1(){
        List<String> pairs = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        pairs.stream().filter(s -> s.startsWith("c")).sorted().forEach(s -> System.out.println(s.toUpperCase()));
    }

    public static  void Part2(int n){
        Integer[] array = new Integer[n];
        List<Integer> numbers = Arrays.asList(array);

        Random rnd = new Random();

        System.out.println(numbers.stream().mapToInt(i -> rnd.nextInt(10)).filter(i -> i%2==0).average().getAsDouble());
    }

    public static void Part3(String s){
        s = Pattern.compile("").splitAsStream(s).map(c -> (c.charAt(0) >= 'h' && c.charAt(0) <= 't') ? c.toUpperCase() : c).collect(Collectors.joining());
        System.out.println(s);
    }
}
