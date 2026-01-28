public class LambdaExample {
    public static void main(String[] args){
        Math addition=(a,b) ->a+b;
        int result=addition.operation(4,3);
        System.out.println(result);
    }
}
