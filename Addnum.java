public class Addnum {

    public static void main(String[] args) {
        if(args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        }
    }
}
