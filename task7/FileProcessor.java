import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class FileProcessor {
    public static void main(String[] args){
        String filePath="BigFile.txt";

        long totalLines=0;
        double totalValue=0;
        Map<String, Integer> errorCount =new HashMap<>();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))){
            String line;
            boolean firsLine= true;

            while((line=reader.readLine()) !=null){
                if (firsLine && line.startsWith("\uFEFF")){
                    line= line.substring(1);
                }
                firsLine= false;

                if (line.isBlank()) continue;
                if (line.startsWith("ERROR")) continue;

                totalLines++;
                totalValue += extractValue(line);

                String type =extractType(line);
                errorCount.put(type, errorCount.getOrDefault(type,0)+1);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Всего строк: " + totalLines);
        System.out.println("Сумма: " + totalValue);
        System.out.println("По категориям: " + errorCount);
    }
    private static double extractValue(String line){
        String[] parts = line.split(":");
        if (parts.length<2) return 0;
        try{
            return Double.parseDouble(parts[1].trim());
        }catch (NumberFormatException e){
            return 0;
        }
    }

    private static String extractType(String line){
        String[] parts=line.split(":");
        return parts[0].trim();
    }

}
