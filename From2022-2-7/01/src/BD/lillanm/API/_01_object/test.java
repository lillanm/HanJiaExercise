package BD.lillanm.API._01_object;

public class test {
    public static void main(String[] args) {
        student stu = new student("秦始皇", "男", 2000);

        //        String rs = stu.toString();
        //        System.out.println(rs);
        //        System.out.println(stu.toString());
        //toString一般都要重写，返回信息而不是地址
        System.out.println(stu);
    }
}
