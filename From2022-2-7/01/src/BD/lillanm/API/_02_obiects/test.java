package BD.lillanm.API._02_obiects;

import java.util.Objects;

public class test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "lillanm";
        //不安全的比较，没有null的判断
        //System.out.println(s1.equals(s2));


        System.out.println(Objects.equals(s1, s2));

        //Objects类的equals源码，增加了null的判断，更安全
   /* public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
    }*/

        //
        System.out.println(Objects.isNull(s1));
        System.out.println(s1 == null);
        System.out.println(Objects.isNull(s2));
        System.out.println(s2 == null);
        //源码就是一个壳子，但是显得专业
        /*public static boolean isNull(Object obj) {
            return obj == null;
        }*/
    }
}
