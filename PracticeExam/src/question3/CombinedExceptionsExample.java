package question3;

public class CombinedExceptionsExample {
    public static void main(String[] args) {
        try {

            int result = 5 / 0;


            int[] array = new int[3];
            int value = array[5];

            String s = null;
            int length = s.length();

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        } catch (Exception e) {
            // Generic catch block for any other exceptions
            System.out.println("Exception caught: " + e);
        } finally {
            // Code in this block will be executed no matter what
            System.out.println("Last line of my program ");
        }
    }
}
