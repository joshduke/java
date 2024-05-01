package learning.java.exception.custom.unchecked;

public class MyUncheckedExceptionDemo {

    public static void main(String[] args) {
        System.out.println(new MyUncheckedExceptionDemo().getRandomNumber(10));
        System.out.println(new MyUncheckedExceptionDemo().getRandomNumber(0));
    }

    private int getRandomNumber(int i) {
        if(i == 0) {
            throw new MyUncheckedException("Input is zero");
        } else {
            return i*100;
        }
    }

}
