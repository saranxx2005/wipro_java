public class com {
    public static void main(String[] args) {
        if(args.length == 2) {
            String str = args[0];
            String str1 = args[1];
            System.out.println(str + " Technologies " + str1);
        } else {
            System.out.println("Please pass exactly two command line arguments.");
        }
    }
}
