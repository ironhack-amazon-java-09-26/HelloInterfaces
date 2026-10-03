package bigDecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    static void main() {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b);


        BigDecimal a1 = new BigDecimal("0.1");
        BigDecimal b1 = new BigDecimal("0.2");

        System.out.println(a1.add(b1));
//
//        a1.subtract(b1);
//        a1.multiply(b1);

        BigDecimal c1 = new BigDecimal("0");
        try {
            System.out.println(a1.divide(c1, RoundingMode.HALF_UP));
        } catch (ArithmeticException e) {
            System.out.println(0);
        }

    }
}
