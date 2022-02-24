package BD.lillanm_02_regex;

public class RegexDemo {
    public static void main(String[] args) {
        //public boolean matches(String regex):判断是否与正则表达式匹配，匹配返回true
        //只能是abc
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));

        //不能出现abc
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));

        System.out.println("a".matches("\\d"));
        System.out.println("3".matches("\\d"));
        System.out.println("333".matches("\\d"));
        System.out.println("z".matches("\\w"));
        System.out.println("2".matches("\\w"));
        System.out.println("21".matches("\\w"));
        System.out.println("你".matches("\\w"));

        //检验密码
        //必须是数字、字母、下划线、至少六位
        System.out.println("24689802".matches("\\w{6,}"));
        System.out.println("2468".matches("\\w{6,}"));

        //验证码
        System.out.println("sfcj".matches("[a-zA-Z0-9]{4}"));
        System.out.println("lill".matches("[a-zA-Z0-9]{4}"));
        System.out.println("lil_".matches("[\\w&&[^_]]{4}"));
        System.out.println("lilsdfl".matches("[\\w&&[^_]]{4}"));

    }
}
