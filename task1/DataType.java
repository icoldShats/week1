import javax.xml.crypto.Data;
import java.util.function.Function;

public enum DataType{
    INT(s ->{
    try {
        return Integer.parseInt(s);
    }catch (Exception e){
        return null;
    }
    }),
    DOUBLE(s ->{
        try{
            return Double.parseDouble(s);
        }
        catch (Exception e){
            return null;
        }
    }),
    BOOLEAN(s ->{
        try{
            return Boolean.parseBoolean(s);
        }
        catch (Exception e){
            return null;
        }

    }),
    STRING(s ->s);

    private final Function<String,Object> parser;
    DataType(Function<String,Object> parser){
        this.parser=parser;
    }
    public Object parse(String input){
        return parser.apply(input);
    }


}



