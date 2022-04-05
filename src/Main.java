public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        // получили java.lang.ArithmeticException
        // нужно в divide предусмотреть случаи деления на ноль
        calc.println.accept(c);
    }
}
