public class Main {
    public static void main(String[] args) {


        boolean success = Data.validate("name","name1","name1");

        if (success) {
            System.out.println("данные верны");

        } else {
            System.out.println("данные не верны ");
        }
    }
}