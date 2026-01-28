import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red"); // дубликат не добавится

        System.out.println("Colors: " + colors);

    }
}
