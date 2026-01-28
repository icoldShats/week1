import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strBuf {

    public static String render(String template, Map<String, Object> data) {

        Pattern pattern = Pattern.compile("\\$\\{([^:{}]+)(?::([^{}]+))?}");
        Matcher matcher = pattern.matcher(template);

        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String key = matcher.group(1);
            String format = matcher.group(2);

            Object value = data.get(key);
            String replacement = "";

            if (value != null) {
                if (format != null && value instanceof Number) {
                    if (format.equals("0.00")) {
                        replacement = String.format("%.2f", value);
                    } else {
                        replacement = value.toString();
                    }
                } else {
                    replacement = value.toString();
                }
            }

            matcher.appendReplacement(result, Matcher.quoteReplacement(replacement));
        }

        matcher.appendTail(result);
        return result.toString();
    }




    public static void main(String[] args) {

        String template = "Hello ${name}, balance = ${balance:0.00}";

        Map<String, Object> data = Map.of(
                "name", "Alice",
                "balance", 123.456
        );

        String output = render(template, data);
        System.out.println(output);
    }
}
