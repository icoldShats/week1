import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FuncPipeline {

    static Optional<Integer> parseIntSafe(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {

        List<String> input = List.of(" 10 ", "23", "abc", " 42 ", "100");

        Function<String, String> trim = String::trim;
        Predicate<String> notEmpty = s -> !s.isEmpty();

        Function<String, Optional<Integer>> safeParse = FuncPipeline::parseIntSafe;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Function<Stream<String>, Stream<String>>> stringSteps = List.of(
                s -> s.map(trim),
                s -> s.filter(notEmpty)
        );

        List<Function<Stream<Integer>, Stream<Integer>>> numberSteps = List.of(
                s -> s.filter(isEven)
        );

        Stream<String> stringStream = input.stream();
        for (var step : stringSteps) {
            stringStream = step.apply(stringStream);
        }

        Stream<Integer> numberStream = stringStream
                .map(safeParse)
                .flatMap(Optional::stream);

        for (var step : numberSteps) {
            numberStream = step.apply(numberStream);
        }

        List<Integer> numbers = numberStream.toList();

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Числа после обработки: " + numbers);
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
    }
}


//public class FuncPipeline {
//    public static void main(String[] args){
//        List<String> input = List.of(" 10 ", "23", "abc", " 42 ", "100");
//
//        Function<String,String> trim = s->s.trim();
//        Predicate<String> notEmpty = s -> !s.isEmpty();
//
//        Function<String, Optional<Integer>> safeParse = s->{
//            try{
//                return Optional.of(Integer.parseInt(s));
//            }
//            catch (NumberFormatException e){
//                return Optional.empty();
//            }
//        };
//
//
//        Predicate<Integer> isEven = n ->n%2==0;
//
//
//        List<String> afterStringSteps = input.stream()
//                .map(trim)
//                .filter(notEmpty)
//                .toList();
//
//        List<Integer> numbers = afterStringSteps.stream()
//                .map(safeParse)
//                .flatMap(Optional::stream)
//                .filter(isEven)
//                .toList();
//
//
//        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
//        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
//
//        System.out.println("Числа после обработки: " + numbers);
//        System.out.println("Сумма: " + sum);
//        System.out.println("Среднее: " + average);
//    }
//}
