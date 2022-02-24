package BD.lillanm.API._04_Math;

public class math {
    public static void main(String[] args) {
        //1.取绝对值，返回正数
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10.2));

        //2.向上取整
        System.out.println(Math.ceil(4000.2));
        System.out.println(Math.ceil(4000.0));

        //3.向下取整
        System.out.println(Math.floor(3.999));

        //4.求指数次方
        System.out.println(Math.pow(2, 4));

        //5.四舍五入
        System.out.println(Math.round(5.4999));
        System.out.println(Math.round(4.5));

        //随机数
        System.out.println(Math.random());//0.0~1.0（有前没有后）
        //扩展：3-9之间的随机数
        //先0-6
        int data = (int )(Math.random()*7)+3;

    }
}
