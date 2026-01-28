import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuncPipeline {
    public static void main(String[] args){
        List<String> input = List.of();

        Function<String,String> trim = s->s.trim();
        Predicate<String> notEmpty = s -> !s.isEmpty();

        Function<String, Optional<Integer>> safeParse = s->{
            try{
                return Optional.of(Integer.parseInt(s));
                //static <T> Optional<T> of(T value) сигнатура
            }
            catch (NumberFormatException e){
                return Optional.empty();
            }
        };


        Predicate<Integer> isEven = n ->n%2==0;


        List<String> afterStringSteps = input.stream()
                .map(trim)
                .filter(notEmpty)
                .toList();

        List<Integer> numbers = afterStringSteps.stream()
                .map(safeParse)
                .flatMap(Optional::stream)
                .filter(isEven)
                .toList();


        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Числа после обработки: " + numbers);
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
    }
}
