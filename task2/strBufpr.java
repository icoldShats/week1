import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strBufpr {
    public static void main(String[] args){

        Pattern pattern1 = Pattern.compile("[a-z]+");

        Matcher matcher1= pattern1.matcher("a b c d s f g 1 2 3 4");
        System.out.println(matcher1.find());

        Matcher matcher2= pattern1.matcher("A S D F G 1 2 3 4");
        System.out.println(matcher2.find());

        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher3=pattern2.matcher("A S D q v f 1 2 3");
        System.out.println(matcher3.find());







//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" world");
//        sb.replace(0, 5, "Hi");
//
//        System.out.println(sb);

//        String s = "";
//
//        for (int i = 0; i < 5; i++) {
//            s = s + i;
//        }
//        System.out.println(s);

//        StringBuffer sb= new StringBuffer();
//        for(int i=0; i<5; i++){
//            sb.append(i);
//        }
//        String result=sb.toString();
//        System.out.println(result);
    }
}
