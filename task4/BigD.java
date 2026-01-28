import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigD {

    public static void main(String[] args){
        var a =new BigDecimal("2.0");
        System.out.println(a);
        System.out.println(a.toPlainString());

        var b =new BigDecimal("123.132");
        System.out.println(b);

        var sum  = a.add(b);
        System.out.println(sum);

        var min  = a.subtract(b);
        System.out.println(min);

        var umnozhenie  = a.multiply(b).setScale(3, RoundingMode.HALF_UP);
        System.out.println(umnozhenie);

        var devide = a.divide(b,2,RoundingMode.HALF_UP);
        System.out.println(devide);


        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
    }
}
