package Entities;

public class NumberDivision {

    private int a;
    private int b;

    public NumberDivision(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getDivision() throws  ArithmeticException{
        try{
            int result = a / b;
            return result;
        }catch (ArithmeticException e) {
            throw  e;
        }
    }
}
