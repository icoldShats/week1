import java.util.function.Function;

public class limba {
    public static void main(String[] args){
//        Function<Integer,Integer> f = x ->x*2;
//        System.out.println(f.apply(5));

        Function<String,Integer> f= s -> Integer.parseInt(s);
    }
}
