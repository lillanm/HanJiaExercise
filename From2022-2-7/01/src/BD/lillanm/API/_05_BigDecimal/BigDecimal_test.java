package BD.lillanm.API._05_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_test {
    public static void main(String[] args) {
        //计算加减乘数有精度问题(但精度问题好像又不是每次都会出现)
        System.out.println(0.09+0.01);
        System.out.println(1.0-0.32);
        System.out.println(1.024*100);
        System.out.println(1.015*100);
        System.out.println(1.0/3.1);
        BigDecimal d1 = BigDecimal.valueOf(0.09);
        BigDecimal d2 = BigDecimal.valueOf(0.01);
        BigDecimal rs = d1.add(d2);
        BigDecimal rs2 = d1.subtract(d2);
        BigDecimal rs3 = d1.multiply(d2);
        BigDecimal rs4 = d1.divide(d2);

        //需要精度的地方(大概长这个样子)
        BigDecimal jd = d1.divide(d2,2, RoundingMode.HALF_UP);
    }
}
