import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LabdaList {
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        numbers.forEach(s ->System.out.println(s*3));
    }
}
