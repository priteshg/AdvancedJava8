package advanced_java_8.functional_interfaces;

public class FunctionExampleReuseability {

    public static String performConcat(String str) {
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("Hello");
        System.out.println(result);
    }

}
