package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Invalid Argument");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Not enough arguments")
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        for(String s: args) {
            sum += Integer.valueOf(s);
        }
        return sum;
    }
}
