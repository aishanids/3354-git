package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide two integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        if(args[0] == '-') {
            sum = (0 - Integer.valueOf(args[1])) + (0 - Integer.valueOf(args[2]));
        }
        return sum;
    }
}
