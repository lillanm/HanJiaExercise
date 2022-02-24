package BD.lillanm_02_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    //正则表达式爬取信息
    public static void main(String[] args) {
        String rs = "我叫梁锦轩，我的手机号码是18623336666，" +
                "我的邮箱是6666@163.com，当然了，我还有个手机是400-4546684-233" +
                "这就是我";

        //1.定义爬取规则，字符串形式
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}|(1[3-9]\\d{9}))" +
                "|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";
        Pattern pattern = Pattern.compile(regex);
        Matcher   matcher = pattern.matcher(rs);

        while (matcher.find()){
            String rs1 = matcher.group();
            System.out.println(rs1  );
        }

    }
}
