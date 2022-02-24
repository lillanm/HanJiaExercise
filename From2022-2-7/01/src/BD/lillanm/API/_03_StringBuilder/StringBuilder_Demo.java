package BD.lillanm.API._03_StringBuilder;

public class StringBuilder_Demo {
    public static void main(String[] args) {
        //StringBuilder对字符串的的操作性能更优
        //String类型拼接字符串还是new一个StringBuilder类型然后append，所以一个加号就new了两个对象
        //效率感觉不如StringBuilder.....性能
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append(2);
        sb.append(2).append("lillanm").append(520);
        System.out.println(sb);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}
