package in.xenosis.IntermediatePro;

public class MultipleExceptionsHandling {
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void printLength(String s) throws NullPointerException {
        System.out.println("Length of the string: " + s.length());
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Valid age.");
        }
    }
    public static void main(String[] args) {
        try {
//            //ArithmeticException
//            int result = divide(10, 0);
//            System.out.println("Result: " + result);

            //NullPointerException
            String text = null;
            printLength(text);

            //CustomException
            validateAge(15);
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
           }
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

}
