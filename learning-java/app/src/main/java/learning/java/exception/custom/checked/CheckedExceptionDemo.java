package learning.java.exception.custom.checked;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        try {
            System.out.println(new CheckedExceptionDemo().addNumbers(30, 40));
            System.out.println(new CheckedExceptionDemo().addNumbers(30, 4));
        } catch (MyCheckedException e) {
            System.out.println("Exception caught !!!");
        }finally {
            System.out.println("Checked Exception demo shown");
        }
    }

    private int addNumbers(int num1, int num2) throws MyCheckedException {
        if(num1 < 10 || num2 < 10) {
            throw new MyCheckedException("Input less than 10");
        } else {
            return num1 + num2;
        }
    }

}
