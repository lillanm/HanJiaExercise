package BD.lillanm_02_regex;

public class RegexDemo3 {
    public static void main(String[] args) {
        String name = "梁锦轩sjdlfjaf684864涂兰朵";
        String []   arr = name.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        String rs = name.replaceAll("\\w+","    ");
        System.out.println(rs);
    }
}
