package ru.javalearn;

public class NumberValidator {

    public static void main(String[] args) {
        NumberValidator numberValidator = new NumberValidator();
        System.out.println(numberValidator.is_simple(10));
    }

    public boolean is_simple(int x) {
        int divisor = 2;

        while (divisor < x) {
            if (x % divisor == 0) {
                return false;
            }
            divisor += 1;
        }

        return true;
    }
}
