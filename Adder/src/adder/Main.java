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
        if(args[0] == '-') {
            for(int i = 1; i < args.length; i++)
            sum += 0 - Integer.valueOf(args[i]);
        }
        else {
            for(String s: args) {
                sum += Integer.valueOf(i);
            }
        }
        return sum;
    }
}
