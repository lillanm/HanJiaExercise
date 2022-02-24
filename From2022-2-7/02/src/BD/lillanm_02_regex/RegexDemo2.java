package BD.lillanm_02_regex;

import java.util.Scanner;

public class RegexDemo2 {
    public static void main(String[] args) {
        //CheckPhone();
        CheckEmail();
    }

    private static void CheckEmail() {
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("请输入您注册的邮箱");
            String email = s.next();
            if(email.matches("\\w{1,20}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,10}){1,2}")){
                System.out.println("格式正确");
                break;
            }else {
                System.out.println("格式错误");
            }
        }
    }


    private static void CheckPhone() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的手机号");
            String phone = s.next();
            if(phone.matches("1[3-9]\\d{9}")){
                System.out.println("注册成功");
                break;
            }
            else {
                System.out.println("手机号无效");
            }
        }
    }

}
