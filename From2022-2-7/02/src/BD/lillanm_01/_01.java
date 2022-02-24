package BD.lillanm_01;

public class _01 {
    public static void main(String[] args) {
        //引用数据类型
        Integer integer = 23;
        //可以将数字转化为字符串
        String rs = integer.toString();
        System.out.println(rs);
        //可以将字符串转化为数字
        String num = "666";
        int six = Integer.parseInt(num);
        String num2 = "66.6";
        double rs2 = Double.parseDouble(num2);
        System.out.println(six);
        System.out.println(rs2);
        //实际中可以调用valveOf方法，更方便。
        int n3 = Integer.valueOf(num);
    }
}
