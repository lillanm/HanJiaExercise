package BD.lillanm.API._01_object;

public class test2 {
    public static void main(String[] args) {
        student stu = new student("秦始皇","男",2000);
        student stu2 = new student("秦始皇","男",2000);
        System.out.println(stu.equals(stu2));
        System.out.println(stu == stu2);
    }
}
